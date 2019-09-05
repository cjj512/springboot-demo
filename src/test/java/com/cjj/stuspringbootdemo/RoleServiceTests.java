package com.cjj.stuspringbootdemo;

import com.cjj.stuspringbootdemo.domain.Permission;
import com.cjj.stuspringbootdemo.domain.Role;
import com.cjj.stuspringbootdemo.service.PermissionService;
import com.cjj.stuspringbootdemo.service.RoleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoleServiceTests {

    @Autowired
    private RoleService roleService;

    //@Test
    public void deletRoleById() {

        int flag = roleService.deletRoleById(5);
        System.out.println(flag);
    }

   // @Test
    public void insert() {

        Role role = new Role();

        role.setId(6);
        role.setRole_name("陈榕");
        role.setUser_id(10);

        int flag = roleService.insert(role);
        System.out.println(flag);
    }

    //@Test
    public void selectRoleById() {

        Role role = roleService.selectRoleById(1);
        System.out.println(role);
    }

   // @Test
    public void updateRoleById(){
        Role role = new Role();
        role.setId(5);
        role.setRole_name("陈佳佳");
        role.setUser_id(100);

        boolean flag = roleService.updateRoleById(role);
        System.out.println(flag);
    }
    @Test
    public void getPermissionByRoleId(){
        List<Permission> list_permission = roleService.getPermissionByRoleId(1);
        System.out.println(list_permission.get(0));
    }

}
