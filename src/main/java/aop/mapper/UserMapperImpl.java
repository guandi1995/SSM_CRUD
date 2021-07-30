package aop.mapper;

import org.springframework.stereotype.Repository;

/**
 * @author Di Guan on 7/30/2021 11:16 AM
 */
@Repository
public class UserMapperImpl implements UserMapper{
    @Override
    public void fetchUsers() {
        System.out.println("fetch all users");
    }

    @Override
    public void insertUser() {
        System.out.println("insert user");
    }

    @Override
    public void deleteUserByID() {
        System.out.println("delete user by id");
    }

    @Override
    public void fetchUserByID() {
        System.out.println("fetch one user by id");
    }

    @Override
    public void updateUser() {
        System.out.println("update user");
    }
}
