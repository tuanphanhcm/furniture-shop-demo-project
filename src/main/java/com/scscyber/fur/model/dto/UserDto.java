package com.scscyber.fur.model.dto;

import com.scscyber.fur.common.model.ConstantValue;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
public class UserDto {
    @NotBlank(message = "Email is required")
    @Email(regexp = ConstantValue.EmailRegex, message = "Email is not valid")
    private String email;
}
