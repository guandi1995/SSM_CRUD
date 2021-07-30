package aop.enhencer;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 基于xml配置aop的enhancer额外增强的功能
 *
 * @author Di Guan on 7/30/2021 11:32 AM
 */

public class TransactionEnhancer {
    //前置通知before advice：target之前，执行该方法
    public void beforeMethod(JoinPoint joinPoint){
        System.out.println("execute before the pointcut");
    }

    //最终通知after advice：target无论有没有异常，执行该方法
    public void afterMethod(){
        System.out.println("execute after the pointcut no matter there is an exception or not");
    }

    //后置通知：target没有异常，执行该方法
    public void afterNoExceptionMethod(){
        System.out.println("execute after the pointcut if there is no exception");
    }

    //异常通知：target有异常，执行该方法
    public void afterExceptionMethod(Exception e){
        System.out.println(e);
        System.out.println("execute after the pointcut if there is an exception");
    }

    //环绕通知around advice：包含target，即必须调用target方法；返回object
    public Object roundMethod(ProceedingJoinPoint joinPoint) throws Exception {
        Object proceed;
        try {
            System.out.println("before around advice");
            //调用target中的方法
            proceed = joinPoint.proceed(joinPoint.getArgs());
            System.out.println("after around advice");
        } catch (Throwable throwable) {
            System.out.println("exception occurs in around advice method");
            throwable.printStackTrace();
            throw new Exception("around advice has exception");
        }
        return proceed;
    }
}
