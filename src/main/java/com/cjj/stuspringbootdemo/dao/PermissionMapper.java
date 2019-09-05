package com.cjj.stuspringbootdemo.dao;

import com.cjj.stuspringbootdemo.domain.Permission;
import com.cjj.stuspringbootdemo.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionMapper {
    int deletPermissionById(Integer id);

    int insert(Permission permission);

    Permission selectPermissionById(Integer id);

    boolean updatePermissionById(Permission permission);
}
