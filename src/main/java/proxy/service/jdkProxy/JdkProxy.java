package proxy.service.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理
 * @author Di Guan on 7/29/2021 7:02 PM
 */

public class JdkProxy {
    private Object target;
    public JdkProxy(Object target) {
        this.target = target;
    }
    public Object getProxyInstance(){
        //创建InvocationHandler接口，并重写invoke方法
        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("开启事务");
                try {
                    method.invoke(target, args);
                    System.out.println("提交commit");
                }catch (Exception exception){
                    System.out.println("回滚rollback");
                }
                return null;
            }
        };

        Object proxy = Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), invocationHandler);

        return proxy;
    }
}
