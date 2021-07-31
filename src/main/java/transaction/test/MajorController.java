package transaction.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import transaction.service.MajorService;


/**
 * @author Di Guan on 7/31/2021 12:55 PM
 */

public class MajorController {

    @Test
    public void test() throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config/applicationContext.xml");
        MajorService majorService = (MajorService) context.getBean("majorService");
        //执行service层insertMajor()
        majorService.insertAdmin();
    }
}
