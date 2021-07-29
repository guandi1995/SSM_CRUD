package proxy.service;

/**
 * @author Di Guan on 7/29/2021 5:57 PM
 */

public class AdminServiceImpl implements AdminService{

    @Override
    public void insertAdmin() {
        System.out.println("call mapper to insert student");
    }

    @Override
    public void updateAdmin() {
        System.out.println("call mapper to update student");
    }

    @Override
    public void deleteAdmin() {
        System.out.println("call mapper to delete student");
    }
}
