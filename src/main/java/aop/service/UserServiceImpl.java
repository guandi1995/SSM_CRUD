package aop.service;

import aop.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * target对象
 * @author Di Guan on 7/30/2021 11:20 AM
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public void fetchUsers() {
        userMapper.fetchUsers();
    }

    //指定pointcut切入点为该insertUser()方法
    @Override
    public void insertUser() {
//        设置异常
//        int i = 1/0;
        userMapper.insertUser();
    }

    @Override
    public void deleteUserByID() {
        userMapper.deleteUserByID();
    }

    @Override
    public void fetchUserByID() {
        userMapper.fetchUserByID();
    }

    @Override
    public void updateUser() {
        userMapper.updateUser();
    }
}
