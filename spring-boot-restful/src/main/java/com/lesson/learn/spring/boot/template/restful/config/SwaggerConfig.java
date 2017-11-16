/*
 * Copyright (c) 2017. @author lev-gc
 */

package com.lesson.learn.spring.boot.template.restful.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StopWatch;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * <b><code>SwaggerConfig</code></b>
 * <p/>
 * The bean of SwaggerConfig
 * <p/>
 * <b>Creation Time:</b> 2016/12/4 17:15.
 *
 * @author Elvis
 * @since spring-boot-restful 1.0.0
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends WebMvcConfigurerAdapter {

    /**
     * Swagger springfox docket 4 kad docket.
     *
     * @return the docket
     */
    @Bean
    public Docket swaggerSpringfoxDocket4KAD() {
        StopWatch watch = new StopWatch();
        watch.start();
        Docket swaggerSpringMvcPlugin = new Docket(DocumentationType.SWAGGER_2)
                .useDefaultResponseMessages(false)
                .groupName("spring-template-boot")
                .apiInfo(apiInfo())
                .select().apis(RequestHandlerSelectors.basePackage("com.lesson.learn.spring.boot.template.restful"))
                .paths(PathSelectors.any())
                .build();
        watch.stop();
        return swaggerSpringMvcPlugin;
    }

    /**
     * Api info api info.
     *
     * @return the api info
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("SwaggerUI Restful APIs")
                .description("Restful APIs of SpringBoot template")
                .build();
    }

}
