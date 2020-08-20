package com.scscyber.fur.model.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class MessageDto {
    private List<String> Messages;
    private boolean IsError;

    public MessageDto(){
        IsError = false;
        Messages = new ArrayList<>();
    }
}
