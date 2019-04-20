package com.learning.spring;

import com.learning.spring.services.SimpleServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {

    public static void main(String[] args) {

//        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        SimpleServiceImpl simpleService = (SimpleServiceImpl) context.getBean("simpleServiceProxy");
//        simpleService.printNameId();
//        System.out.println("--------------");
//        try {
//            simpleService.checkName();
//        } catch (Exception e) {
//            System.out.println("SimpleServiceImpl: Method checkName() exception thrown..");
//        }
//        System.out.println("--------------");
//        simpleService.sayHello("Javacodegeeks");
//        context.close();

        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        SimpleServiceImpl service = context.getBean("simpleService", SimpleServiceImpl.class);
        service.sayHello("Teting");
    }
}