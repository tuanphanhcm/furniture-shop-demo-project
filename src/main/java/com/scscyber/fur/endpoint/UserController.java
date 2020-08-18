package com.scscyber.fur.endpoint;

import com.scscyber.fur.common.function.HandleErrors;
import com.scscyber.fur.model.dto.UserDto;
import com.scscyber.fur.service.itf.IUserService;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private final IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @PostMapping("create-by-email")
    public Object CreateUser(@Valid @RequestBody UserDto userDto, BindingResult result){
        List<String> error = HandleErrors.ErrorBindingResults(result);
    }
}
