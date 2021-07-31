package transaction.service;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import transaction.exception.CustomException;
import transaction.message.Message;

import java.util.List;

/**
 * @author Di Guan on 7/31/2021 12:55 PM
 */
@Component("majorService")
public class MajorServiceImpl implements MajorService {

    @Override
    public List fetchAdmins() {
        System.out.println("fetch admins");
        return null;
    }

    /**
     * Spring事务管理的底层是一个环绕通知round advice
     * 所以around advice的方法中需要接收Exception，
     * insertAdmin()方法中catch{}不能处理异常，而是throw抛出异常
     * 这样around advice的方法中才可以接收到,并进行回滚rollback
     *
     * @Transaction 注解可以添加各种属性，具体cmd+@Transaction进行查看：
     * - 指明propagation事务传播机制:默认PROPAGATION_REQUIRED
     * - 指明isolation隔离级别: 默认与数据库隔离级别一致，MySQL默认隔离级别是Repeatable read
     * - 指明rollbackFor：rollback调用自定义Exception
     */

    @Transactional(propagation = Propagation.REQUIRED,
            rollbackFor = CustomException.class)
    public Message insertAdmin() throws CustomException{
        try {
            System.out.println("insert admin");
//            int i = 1/0;
            return new Message(true, "commit the change");
        }catch (Exception e){
//            return new Message(false, "fail to insert, rollback");
            throw new CustomException("Fail to Insert Admin");
        }
    }
}
