package com.scscyber.fur.model.pojo;

import lombok.Data;

@Data
public class User {
    private int userId;
    private String loginName;
    private String password;
    private String email;
    private String phone;
    private String citizenId;
    private boolean isResetPassword;
}
