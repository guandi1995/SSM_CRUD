package aop.controller;

import aop.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Di Guan on 7/30/2021 11:27 AM
 */
@Controller
@RequestMapping("/admin")
@ResponseBody
public class AdminController {
    @Autowired
    private AdminService adminService;

    @RequestMapping("/fetchAdmins")
    public void fetchAdmins(){
        adminService.fetchAdmins();
    }
    @RequestMapping("/insertAdmin")
    public void insertAdmin(){
        adminService.insertAdmin();
    }
    @RequestMapping("/fetchAdminByID")
    public void fetchAdminByID(){
        adminService.fetchAdminByID();
    }
    @RequestMapping("/updateAdmin")
    public void updateAdmin(){
        adminService.updateAdmin();
    }
    @RequestMapping("/deleteAdmin")
    public void deleteAdmin(){
        adminService.deleteAdminByID();
    }
}
