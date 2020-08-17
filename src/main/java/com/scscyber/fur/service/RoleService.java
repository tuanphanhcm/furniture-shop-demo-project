package com.scscyber.fur.service;

import com.scscyber.fur.model.dto.RoleWithUsers;
import com.scscyber.fur.model.pojo.Role;
import com.scscyber.fur.mybatis.mapper.RoleMapper;
import com.scscyber.fur.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService implements IRoleService {

    @Autowired
    private final RoleMapper roleMapper;

    public RoleService(RoleMapper roleMapper) {
        this.roleMapper = roleMapper;
    }

    @Override
    public List<Role> getAllRole() {
        return roleMapper.getAllRole();
    }

    @Override
    public Role getRoleById(int id) {
        return roleMapper.getRoleById(id);
    }

    @Override
    public Role getRoleByName(String roleName) {
        return roleMapper.getRoleByName(roleName);
    }

    @Override
    public List<RoleWithUsers> getAllRoleWithUsers() {
        return roleMapper.getAllRoleWithUsers();
    }
}
