package com.test.library.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@Configuration
@ComponentScan(basePackages = "com.test.library")
@EnableJpaRepositories(basePackages = "com.test.library.repository")
@EnableAutoConfiguration
class ApplicationConfig {

}