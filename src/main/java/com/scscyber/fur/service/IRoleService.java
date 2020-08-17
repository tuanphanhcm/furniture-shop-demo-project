package com.scscyber.fur.service;

import com.scscyber.fur.model.dto.RoleWithUsers;
import com.scscyber.fur.model.pojo.Role;

import java.util.List;

public interface IRoleService {
    List<Role> getAllRole();
    Role getRoleById(int id);
    Role getRoleByName(String roleName);
    List<RoleWithUsers> getAllRoleWithUsers();
}
