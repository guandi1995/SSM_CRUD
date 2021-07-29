package proxy.service.staticProxy;

import proxy.service.AdminService;
import proxy.service.AdminServiceImpl;

/**
 * 静态代理 static proxy
 * 静态代理对象 必须 implements 和target目标对象(AdminServiceImpl)一致的接口(AdminService)
 * @author Di Guan on 7/29/2021 6:05 PM
 */

public class StaticProxy implements AdminService {

    //目标target对象:AdminServiceImpl
    private AdminServiceImpl target;
    //有参构造，new StaticProxy代理对象时，传递target目标对象作为参数
    public StaticProxy(AdminServiceImpl target) {
        this.target = target;
    }

    @Override
    public void insertAdmin() {
        System.out.println("开启事务");
        try {
            target.insertAdmin();
            System.out.println("提交commit");
        }catch (Exception exception){
            System.out.println("回滚rollback");
        }
    }

    @Override
    public void updateAdmin() {
        System.out.println("开启事务");
        try {
            target.updateAdmin();
            System.out.println("提交commit");
        }catch (Exception exception){
            System.out.println("回滚rollback");
        }
    }

    @Override
    public void deleteAdmin() {
        System.out.println("开启事务");
        try {
            target.deleteAdmin();
            System.out.println("提交commit");
        }catch (Exception exception){
            System.out.println("回滚rollback");
        }
    }
}
