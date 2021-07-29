package proxy.test;

import org.junit.Test;
import proxy.service.AdminService;
import proxy.service.AdminServiceImpl;
import proxy.service.cglibProxy.CglibProxy;
import proxy.service.jdkProxy.JdkProxy;
import proxy.service.staticProxy.StaticProxy;

/**
 * @author Di Guan on 7/29/2021 6:13 PM
 */

public class TestForProxy {
    /**
     * test for static proxy
     */
    @Test
    public void test01(){
        //创建target对象
        AdminServiceImpl target = new AdminServiceImpl();
        //创建proxy对象，将target传递到有参构造中
        StaticProxy proxy = new StaticProxy(target);
        //直接调用proxy对象的方法(因为静态代理对象必须implements与目标对象一致的接口)
        proxy.insertAdmin();
        proxy.updateAdmin();
        proxy.deleteAdmin();
    }

    /**
     * test for JDK proxy
     */
    @Test
    public void test02(){
        AdminServiceImpl target = new AdminServiceImpl();
        AdminService proxy = (AdminService) new JdkProxy(target).getProxyInstance();
        proxy.insertAdmin();
        proxy.updateAdmin();
        proxy.deleteAdmin();
    }

    /**
     * test for Cglib proxy
     */
    @Test
    public void test03(){
        AdminServiceImpl target = new AdminServiceImpl();
        AdminService proxy = (AdminService) new CglibProxy(target).getProxyInstance();
        proxy.insertAdmin();
        proxy.updateAdmin();
        proxy.deleteAdmin();
    }
}
