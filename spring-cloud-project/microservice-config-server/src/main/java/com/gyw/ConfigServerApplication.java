package com.gyw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@EnableConfigServer
@EnableEurekaClient
@SpringBootApplication//@SpringbootApplication相当于@Configuration,@EnableAutoConfiguration和 @ComponentScan 并具有他们的默认属性值
public class ConfigServerApplication {

    @Bean
    @ConfigurationProperties(prefix = "datasource")
    @Primary
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }

    /*访问配置文件地址 http://localhost:8980/microservice-foo/dev------microservice-foo-dev.property*/
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
