package com.scscyber.fur.service.itf;

import com.scscyber.fur.model.dto.MessageDto;
import com.scscyber.fur.model.dto.UserDto;
import org.springframework.validation.BindingResult;

public interface IUserService {
    MessageDto CreateUserByEmail(UserDto userDto, BindingResult bindingResult);
}
