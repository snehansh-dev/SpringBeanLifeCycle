package com.snehansh;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "com.snehansh")
public class BeanConfig {
    @Bean
    @Scope(scopeName = "prototype")
    public User user(){
        return new User();
    }
}
