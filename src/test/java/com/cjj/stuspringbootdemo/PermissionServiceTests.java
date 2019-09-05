package com.cjj.stuspringbootdemo;

import com.cjj.stuspringbootdemo.domain.Permission;
import com.cjj.stuspringbootdemo.domain.User;
import com.cjj.stuspringbootdemo.service.PermissionService;
import com.cjj.stuspringbootdemo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PermissionServiceTests {

    @Autowired
    private PermissionService permissionService;

   // @Test
    public void deletPermissionById() {

        int flag = permissionService.deletPermissionById(5);
        System.out.println(flag);
    }

    //@Test
    public void insert() {

        Permission permission = new Permission();

        permission.setId(5);
        permission.setPermission("test");
        permission.setRole_id(5);

        int flag = permissionService.insert(permission);
        System.out.println(flag);
    }

    //@Test
    public void selectPermissionById() {

        Permission permission = permissionService.selectPermissionById(5);
        System.out.println(permission);
    }

    @Test
    public void updatePermissionById(){
        Permission permission = new Permission();
        permission.setId(5);
        permission.setPermission("testxxx");
        permission.setRole_id(10);

        boolean flag = permissionService.updatePermissionById(permission);
        System.out.println(flag);
    }
}
