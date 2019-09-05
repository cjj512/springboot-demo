package com.cjj.stuspringbootdemo.service.impl;

import com.cjj.stuspringbootdemo.dao.PermissionMapper;
import com.cjj.stuspringbootdemo.domain.Permission;
import com.cjj.stuspringbootdemo.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PermissionServiceImpl implements PermissionService {
    @Autowired
    private PermissionMapper dao;


    @Override
    public int deletPermissionById(Integer id) {
        return dao.deletPermissionById(id);
    }

    @Override
    public int insert(Permission permission) {
        return dao.insert(permission);
    }

    @Override
    public Permission selectPermissionById(Integer id) {
        return dao.selectPermissionById(id);
    }

    @Override
    public boolean updatePermissionById(Permission permission) {
        return dao.updatePermissionById(permission);
    }
}
