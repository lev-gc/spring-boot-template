/*
 * Copyright (c) 2017. @author lev-gc
 */

package own.spring.boot.template.restful;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

/**
 * <b><code>Application</code></b>
 * <p/>
 * Application
 * <p/>
 * <b>Creation Time:</b> 2017/1/22 14:41.
 *
 * @author Elvis
 * @since spring-boot-restful 0.1
 */
@SpringBootApplication(scanBasePackages = {"own.spring.boot.template.*"})
@MapperScan("own.spring.boot.template.restful.mapper")
public class Application {

    /**
     * The constant LOG.
     *
     * @since spring-boot-restful 0.1
     */
    private static final Logger LOG = Logger.getLogger(Application.class);

    /**
     * Datasource.
     *
     * @return the data source
     * @since spring-boot-restful 0.1
     */
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource() {
        return new DataSource();
    }

    /**
     * the bean SqlSessionFactory.
     *
     * @return the sql session factory
     * @throws Exception the exception
     * @since spring-boot-restful 0.1
     */
    @Bean
    public SqlSessionFactory sqlSessionFactoryBean() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();

        /* DateSource */
        sqlSessionFactoryBean.setDataSource(dataSource());

        /* Mapper */
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:/mapper/*.xml"));

        return sqlSessionFactoryBean.getObject();
    }

    /**
     * Transaction manager platform.
     *
     * @return the platform transaction manager
     * @since spring-boot-restful 0.1
     */
    @Bean
    public PlatformTransactionManager transactionManager() {
        DataSourceTransactionManager manager = new DataSourceTransactionManager(dataSource());
        manager.setRollbackOnCommitFailure(false);
        return manager;
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @since spring-boot-restful 0.1
     */
    public static void main(String[] args) {
        LOG.info("Application Start!");
        SpringApplication.run(Application.class, args);
    }
}
