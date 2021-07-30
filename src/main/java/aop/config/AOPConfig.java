package aop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * java文件配置AOP
 *
 * @author Di Guan on 7/30/2021 8:34 PM
 */

@Configuration//声明这时一个Java配置类
@ComponentScan("aop")//声明注解扫描的包，扫描aop包下所有文件
@EnableAspectJAutoProxy//开启AOP注解
public class AOPConfig {

}
