package com.snehansh;

import org.springframework.beans.factory.BeanNameAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class User implements UserInterface,BeanNameAware{
    @Override
    public void welcomeUser() {
        System.out.println("Welcome to the world");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("SetBeanName method is called");
    }
    @PostConstruct
    public void postConstruct(){
        System.out.println("Post Construct method is called");
    }
}
