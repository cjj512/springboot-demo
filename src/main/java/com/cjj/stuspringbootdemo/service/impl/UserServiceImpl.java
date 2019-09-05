package com.cjj.stuspringbootdemo.service.impl;

import com.cjj.stuspringbootdemo.dao.UserMapper;
import com.cjj.stuspringbootdemo.domain.Role;
import com.cjj.stuspringbootdemo.domain.User;
import com.cjj.stuspringbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper dao;

    public int deletUserById(Integer id) {
        return dao.deletUserById(id);
    }

    @Override
    public int insert(User user) {
        return dao.insert(user);
    }

    @Override
    public User selectUserById(Integer id) {
        return dao.selectUserById(id);
    }

    @Override
    public boolean updateUserById(User user) {
        return dao.updateUserById(user);
    }

    @Override
    public List<Role> getRoleByUserName(String username) {
        return dao.getRoleByUserName(username);
    }

    @Override
    public User selectByName(String name) {
        return dao.selectByName(name);
    }
}
