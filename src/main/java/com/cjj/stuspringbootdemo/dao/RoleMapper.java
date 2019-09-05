package com.cjj.stuspringbootdemo.dao;

import com.cjj.stuspringbootdemo.domain.Permission;
import com.cjj.stuspringbootdemo.domain.Role;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleMapper {
    int deletRoleById(Integer id);

    int insert(Role role);

    Role selectRoleById(Integer id);

    boolean updateRoleById(Role role);

    List<Permission> getPermissionByRoleId(Integer id);
}
