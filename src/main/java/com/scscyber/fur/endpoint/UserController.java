package com.scscyber.fur.endpoint;

import com.scscyber.fur.model.dto.MessageDto;
import com.scscyber.fur.model.dto.UserDto;
import com.scscyber.fur.service.itf.IUserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private final IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @PostMapping("create-by-email")
    public Object CreateUser(@Valid @RequestBody UserDto userDto, BindingResult result) {
        MessageDto messageDto = userService.CreateUserByEmail(userDto, result);
        if (!messageDto.IsError) {
            return new ResponseEntity<>(messageDto, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(messageDto, HttpStatus.OK);
    }
}
