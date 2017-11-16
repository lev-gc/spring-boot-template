/*
 * Copyright (c) 2017. @author lev-gc
 */

package com.lesson.learn.spring.boot.template.restful.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * <b><code>CorsConfig</code></b>
 * <p/>
 * The bean of CorsConfig
 * <p/>
 * <b>Creation Time:</b> 2016/12/4 17:15.
 *
 * @author Elvis
 * @since spring-boot-restful 0.1
 */
@Configuration
public class CorsConfig {

    /**
     * Build config cors configuration.
     *
     * @return the cors configuration
     * @since spring-boot-restful 0.1
     */
    private CorsConfiguration buildConfig() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.addAllowedOrigin("*");                // 1.allow all domain
        corsConfiguration.addAllowedHeader("*");                // 2.allow all Header
        corsConfiguration.addAllowedMethod("*");                // 3.allow all method(post,get etc.）
        return corsConfiguration;
    }

    /**
     * Cors filter.
     *
     * @return the cors filter
     * @since spring-boot-restful 0.1
     */
    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", buildConfig());
        return new CorsFilter(source);
    }

}
