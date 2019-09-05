package com.cjj.stuspringbootdemo.service;

import com.cjj.stuspringbootdemo.domain.Role;
import com.cjj.stuspringbootdemo.domain.User;

import java.util.List;

public interface UserService {
    int deletUserById(Integer id);

    int insert(User user);

    User selectUserById(Integer id);

    boolean updateUserById(User user);

    List<Role> getRoleByUserName(String username);

    User selectByName(String name);
}
