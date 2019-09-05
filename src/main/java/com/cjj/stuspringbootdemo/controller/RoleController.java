package com.cjj.stuspringbootdemo.controller;

import com.cjj.stuspringbootdemo.domain.Permission;
import com.cjj.stuspringbootdemo.domain.Role;
import com.cjj.stuspringbootdemo.service.PermissionService;
import com.cjj.stuspringbootdemo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @RequestMapping("/deletRoleById/{id}")
    @ResponseBody
    public Object deletRoleById(@PathVariable int id) throws Exception{
        int flag = roleService.deletRoleById(id);
        return flag;
    }

    @RequestMapping("/insert/{id}/{role_name}/{user_id}")
    @ResponseBody
    public Object insert(@PathVariable("id") int id,@PathVariable("role_name") String role_name,@PathVariable("user_id") int user_id) throws Exception{
        Role role = new Role();

        role.setId(id);
        role.setRole_name(role_name);
        role.setUser_id(user_id);

        int flag = roleService.insert(role);
        return flag;
    }

    @RequestMapping("/selectRoleById/{id}")
    @ResponseBody
    public Object selectRoleById(@PathVariable int id) throws Exception{
        Role role = roleService.selectRoleById(id);
        return role;
    }

    @RequestMapping("/updateRoleById/{id}")
    @ResponseBody
    public Object updateRoleById(@PathVariable int id) throws Exception{
        Role role = new Role();
        role.setId(id);
        role.setRole_name("testxxx");
        role.setUser_id(10);

        boolean flag = roleService.updateRoleById(role);
        return flag;
    }

    @RequestMapping("/getPermissionByRoleId/{id}")
    @ResponseBody
    public Object getPermissionByRoleId(@PathVariable Integer id) throws Exception{
        List<Permission> list_permission = roleService.getPermissionByRoleId(id);
        return list_permission;
    }
}
