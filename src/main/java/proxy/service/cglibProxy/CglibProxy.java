package proxy.service.cglibProxy;

import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * CGLIB proxy动态代理类
 *
 * @author Di Guan on 7/29/2021 9:00 PM
 */

public class CglibProxy implements MethodInterceptor {

    private Object target;
    public CglibProxy(Object target) {
        this.target = target;
    }
    //为target对象生成代理对象
    public Object getProxyInstance(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback((Callback) this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("开启事务");
        try {
            method.invoke(target, args);
            System.out.println("commit提交");
        }catch (Exception exception){
            System.out.println("rollback回滚");
        }
        return null;
    }
}
