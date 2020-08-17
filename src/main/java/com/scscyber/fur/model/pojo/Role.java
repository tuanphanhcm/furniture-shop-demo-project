package com.scscyber.fur.model.pojo;

import lombok.Data;


import javax.validation.constraints.NotBlank;

@Data
public class Role {
    @NotBlank(message = "Role ID could not be blank.")
    private int roleId;
    @NotBlank(message = "Role Name could not be blank.")
    private String roleName;
    private String roleDescription;
}
