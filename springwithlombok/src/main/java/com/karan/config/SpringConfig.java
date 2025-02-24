package com.karan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.karan.bean.Customer;

@Configuration
@ComponentScan(basePackages = "com.karan")
public class SpringConfig {

}