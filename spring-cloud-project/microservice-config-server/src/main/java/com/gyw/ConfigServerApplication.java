package com.gyw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {
    /*访问配置文件地址 http://localhost:8980/microservice-foo/dev------microservice-foo-dev.property*/
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
