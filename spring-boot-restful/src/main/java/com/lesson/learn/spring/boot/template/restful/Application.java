/*
 * Copyright (c) 2017. @author lev-gc
 */

package com.lesson.learn.spring.boot.template.restful;

import org.apache.log4j.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <b><code>Application</code></b>
 * <p/>
 * Application
 * <p/>
 * <b>Creation Time:</b> 2017/1/22 14:41.
 *
 * @author Elvis
 * @since spring-boot-restful 1.0.0
 */
@SpringBootApplication
@MapperScan("com.lesson.learn.spring.boot.template.restful.mapper")
public class Application {

    /**
     * The constant LOG.
     */
    private static final Logger LOG = Logger.getLogger(Application.class);

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        LOG.info("Application Start!");
        SpringApplication.run(Application.class, args);
    }
}
