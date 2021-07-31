//package transaction.aspect;
//
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Pointcut;
//import org.springframework.stereotype.Component;
//
///**
// * 模拟Spring事务中的around advice原理
// * 不需要执行这段代码
// * @author Di Guan on 7/31/2021 2:49 PM
// */
//@Component
//@Aspect
//public class TransactionEnhancer {
//    @Pointcut("execution(* transaction.service.*.insert*(..) )")
//    public void pointcut(){ }
//
//    @Around("pointcut()")
//    public Object roundMethod(ProceedingJoinPoint joinPoint) throws Exception {
//        Object proceed;
//        try {
//            //执行insertAdmin()
//            proceed = joinPoint.proceed(joinPoint.getArgs());
//            //==========如果执行成功，则commit()=============
//
//        } catch (Throwable throwable) {
//            //==========如果执行失败，则rollback()===========
//            //但是如何判断执行失败，是根据roundMethod()方法中catch{}接收到的异常来确定
//            //如果接收到异常，就调用rollback方法，如果没有，就不会进行catch{}中，而是直接执行try{}中的commit方法
//            //所以service层的insertAdmin()方法中，不能处理异常，只能抛出异常
//            //如果insertAdmin()方法不抛出异常，roundMethod()方法中的catch{}也就不会接收到异常，也就不会执行rollback()
//            //也就是说事务的回滚依赖的是insertAdmin()方法中的异常！！！！
//            throwable.printStackTrace();
//            throw new Exception("around advice has ?????");
//        }
//        return proceed;
//    }
//
//}
