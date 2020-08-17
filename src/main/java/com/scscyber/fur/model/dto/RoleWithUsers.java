package com.scscyber.fur.model.dto;

import com.scscyber.fur.model.pojo.User;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
public class RoleWithUsers {
    private int roleId;
    private String roleName;
    private String roleDescription;
    private List<User> users;

}
