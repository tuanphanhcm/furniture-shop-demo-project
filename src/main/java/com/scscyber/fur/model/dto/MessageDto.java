package com.scscyber.fur.model.dto;

import lombok.Data;

import java.util.List;
@Data
public class MessageDto {
    public List<String> Messages;
    public boolean IsError;
}
