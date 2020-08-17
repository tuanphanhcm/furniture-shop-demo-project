package com.scscyber.fur.model.base;

import lombok.Data;

import java.util.Date;

@Data
public class BaseObject {
    private String deletedYn;
    private String createUser;
    private Date createDate;
    private String updateUser;
    private Date updateDate;
}
