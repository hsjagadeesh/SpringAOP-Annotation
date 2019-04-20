package com.learning.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logging {

   /**
    * This is the method which I would like to execute
    * before a selected method execution.
    */
   @Before(value = "execution(* com.learning.spring.services.*.*(..))")
   public void beforeAdvice(JoinPoint jp){
      System.out.println("Executing this aspect BEFORE method.");
   }

   @After(value = "execution(* com.learning.spring.services.*.*(..))")
   public void afterAdvice(JoinPoint jp){
      System.out.println("Executing this aspect AFTER method.");
   }

   @AfterReturning(value = "execution(* com.learning.spring.services.*.*(..))")
   public void afterReturningAdvice(JoinPoint jp){
      System.out.println("Executing this aspect afterReturningAdvice method.");
   }

   @AfterThrowing(value = "execution(* com.learning.spring.services.*.*(..))")
   public void afterThrowingAdvice(JoinPoint jp){
      System.out.println("Executing this aspect afterThrowingAdviceo method.");
   }
}