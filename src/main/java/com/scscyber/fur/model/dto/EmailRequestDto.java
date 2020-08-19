package com.scscyber.fur.model.dto;

import lombok.Data;

@Data
public class EmailRequestDto {
    private String mailTo;
    private String subject;
    private String text;
}
