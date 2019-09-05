package com.cjj.stuspringbootdemo.dao;

import com.cjj.stuspringbootdemo.domain.Role;
import com.cjj.stuspringbootdemo.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    int deletUserById(Integer id);

    int insert(User user);

    User selectUserById(Integer id);

    boolean updateUserById(User user);

    List<Role> getRoleByUserName(String username);

    User selectByName(String name);


}
