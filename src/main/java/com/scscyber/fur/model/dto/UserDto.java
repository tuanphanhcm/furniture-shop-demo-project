package com.scscyber.fur.model.dto;

import com.scscyber.fur.common.model.ConstantValue;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
public class UserDto {
    @NotBlank(message = "EmailRequired")
    @Email(regexp = ConstantValue.EmailRegex, message = "EmailNotValid")
    private String email;
}
