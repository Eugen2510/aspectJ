package org.example;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TransactionAspect{

    @Pointcut("execution(* Main.makeSomeOperation(String))")
    public void executeOperation() {
    }

    @Around(value = "executeOperation()")
    public void beforeAdvice(ProceedingJoinPoint joinPoint) {
        System.out.println("Открытие транзакции...");
        try {
            joinPoint.proceed();
            System.out.println("Закрытие транзакции....");
        }
        catch (Throwable throwable) {
            System.out.println("Операция не удалась, откат транзакции...");
        }
    }
}