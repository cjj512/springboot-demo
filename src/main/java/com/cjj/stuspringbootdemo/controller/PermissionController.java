package com.cjj.stuspringbootdemo.controller;

import com.cjj.stuspringbootdemo.domain.Permission;
import com.cjj.stuspringbootdemo.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/permission")
public class PermissionController {
    @Autowired
    private PermissionService permissionService;

    @RequestMapping("/deletPermissionById/{id}")
    @ResponseBody
    public Object deletPermissionById(@PathVariable int id) throws Exception{
        int flag = permissionService.deletPermissionById(id);
        return flag;
    }

    @RequestMapping("/insert/{id}/{permission}/{role_id}")
    @ResponseBody
    public Object insert(@PathVariable("id") int id,@PathVariable("permission") String permission,@PathVariable("role_id") int role_id) throws Exception{
        Permission permission1 = new Permission();
        permission1.setId(id);
        permission1.setPermission(permission);
        permission1.setRole_id(role_id);

        int flag = permissionService.insert(permission1);
        return flag;
    }

    @RequestMapping("/selectPermissionById/{id}")
    @ResponseBody
    public Object selectPermissionById(@PathVariable int id) throws Exception{
        Permission permission = permissionService.selectPermissionById(id);
        return permission;
    }

    @RequestMapping("/updatePermissionById/{id}")
    @ResponseBody
    public Object updatePermissionById(@PathVariable int id) throws Exception{
        Permission permission = new Permission();
        permission.setId(id);
        permission.setPermission("testxxx");
        permission.setRole_id(10);

        boolean flag = permissionService.updatePermissionById(permission);
        return flag;
    }
}
