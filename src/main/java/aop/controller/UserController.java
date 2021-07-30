package aop.controller;

import aop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Di Guan on 7/30/2021 11:27 AM
 */
@Controller
@RequestMapping("/user")
@ResponseBody
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/fetchUsers")
    public void fetchUsers(){
        userService.fetchUsers();
    }
    @RequestMapping("/insertUser")
    public void insertUser(){
        userService.insertUser();
    }
    @RequestMapping("/fetchUserByID")
    public void fetchUserByID(){
        userService.fetchUserByID();
    }
    @RequestMapping("/updateUser")
    public void updateUser(){
        userService.updateUser();
    }
    @RequestMapping("/deleteUser")
    public void deleteUser(){
        userService.deleteUserByID();
    }
}
