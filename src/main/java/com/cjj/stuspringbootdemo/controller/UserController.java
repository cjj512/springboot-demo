package com.cjj.stuspringbootdemo.controller;

import com.cjj.stuspringbootdemo.domain.Role;
import com.cjj.stuspringbootdemo.domain.User;
import com.cjj.stuspringbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/deletUserById/{id}")
    @ResponseBody
    public Object deletUserById(@PathVariable int id) throws Exception{
        int flag = userService.deletUserById(id);
        return flag;
    }

    @RequestMapping("/insert/{id}/{name}/{password}/{sal}")
    @ResponseBody
    public Object insert(@PathVariable("id") int id,@PathVariable("name") String name,@PathVariable("password") String password,@PathVariable("sal") Double sal) throws Exception{
        User user= new User();
        user.setId(id);
        user.setName(name);
        user.setPassword(password);
        user.setSal(sal);

        int flag = userService.insert(user);
        return flag;
    }

    @RequestMapping("/selectUserById/{id}")
    @ResponseBody
    public Object selectUserById(@PathVariable("id") int id) throws Exception{

        User user = userService.selectUserById(id);
        return user;
    }

    @RequestMapping("/updateUserById/{id}")
    @ResponseBody
    public Object updateUserById(@PathVariable("id") int id) throws Exception{

        User newuser = new User();
        newuser.setName("xxxx");
        newuser.setPassword("5555555");
        newuser.setSal(100.0);
        newuser.setId(1);
        boolean flag = userService.updateUserById(newuser);
        return flag;
    }

    @RequestMapping("/getRoleByUserName/{username}")
    @ResponseBody
    public Object getRoleByUserName(@PathVariable("username") String username) throws Exception{

        List<Role> list_role = userService.getRoleByUserName(username);
        return list_role;
    }

    @RequestMapping("/selectByName/{username}")
    @ResponseBody
    public Object selectByName(@PathVariable("username") String username) throws Exception{

        User user = userService.selectByName(username);
        return user;
    }
}
