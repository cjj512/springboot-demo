package com.cjj.stuspringbootdemo.service.impl;

import com.cjj.stuspringbootdemo.dao.PermissionMapper;
import com.cjj.stuspringbootdemo.dao.RoleMapper;
import com.cjj.stuspringbootdemo.domain.Permission;
import com.cjj.stuspringbootdemo.domain.Role;
import com.cjj.stuspringbootdemo.service.PermissionService;
import com.cjj.stuspringbootdemo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper dao;


    @Override
    public int deletRoleById(Integer id) {
        return dao.deletRoleById(id);
    }

    @Override
    public int insert(Role role) {
        return dao.insert(role);
    }

    @Override
    public Role selectRoleById(Integer id) {
        return dao.selectRoleById(id);
    }

    @Override
    public boolean updateRoleById(Role role) {
        return dao.updateRoleById(role);
    }

    @Override
    public List<Permission> getPermissionByRoleId(Integer id) {
        return dao.getPermissionByRoleId(id);
    }
}
