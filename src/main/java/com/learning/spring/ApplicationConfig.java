package com.learning.spring;

import com.learning.spring.services.SimpleServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ApplicationConfig {

    @Bean(name="simpleService")
    public SimpleServiceImpl simpleServiceBean(){
        return new SimpleServiceImpl();
    }
}
