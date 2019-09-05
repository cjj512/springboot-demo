package com.cjj.stuspringbootdemo.service;

import com.cjj.stuspringbootdemo.domain.Permission;


public interface PermissionService {
    int deletPermissionById(Integer id);

    int insert(Permission permission);

    Permission selectPermissionById(Integer id);

    boolean updatePermissionById(Permission permission);
}
