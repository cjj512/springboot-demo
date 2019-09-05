package com.cjj.stuspringbootdemo.service;

import com.cjj.stuspringbootdemo.domain.Permission;
import com.cjj.stuspringbootdemo.domain.Role;

import java.util.List;


public interface RoleService {
    int deletRoleById(Integer id);

    int insert(Role role);

    Role selectRoleById(Integer id);

    boolean updateRoleById(Role role);

    List<Permission> getPermissionByRoleId(Integer id);
}
