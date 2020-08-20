package com.scscyber.fur.model.dto;

import lombok.Data;

import java.util.Date;

@Data
public class UserCreateDto {
    private String email;
    private String password;
    private Date date;

    public UserCreateDto(String email, String password) {
        this.email = email;
        this.password = password;
        this.date = new Date();
    }
}
