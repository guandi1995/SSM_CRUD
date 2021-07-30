package aop.mapper;

import org.springframework.stereotype.Repository;

/**
 * @author Di Guan on 7/30/2021 11:18 AM
 */
@Repository
public class AdminMapperImpl implements AdminMapper{
    @Override
    public void fetchAdmins() {
        System.out.println("fetch all admins");
    }

    @Override
    public void insertAdmin() {
        System.out.println("insert admin");
    }

    @Override
    public void deleteAdminByID() {
        System.out.println("delete admin");
    }

    @Override
    public void fetchAdminByID() {
        System.out.println("fetch admin by id");
    }

    @Override
    public void updateAdmin() {
        System.out.println("update admin");
    }
}
