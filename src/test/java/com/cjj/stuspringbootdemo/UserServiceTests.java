package com.cjj.stuspringbootdemo;

import com.cjj.stuspringbootdemo.domain.Role;
import com.cjj.stuspringbootdemo.domain.User;
import com.cjj.stuspringbootdemo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTests {

    @Autowired
    private UserService userService;

    //@Test
    public void selectByPrimaryKey() {

        User user = userService.selectUserById(1);
        System.out.println(user.getName());
    }

    //@Test
    public void getRoleByUserName() {

        List<Role> list_role = userService.getRoleByUserName("cr");
        System.out.println(list_role);
    }

    @Test
    public void selectByName() {

        User user = userService.selectByName("cr");
        System.out.println(user);
    }
}
