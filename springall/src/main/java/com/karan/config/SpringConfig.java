package com.karan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackages = "com.karan")
@PropertySource("classpath:application.properties")
public class SpringConfig {

}
