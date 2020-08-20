package com.scscyber.fur.service;

import com.scscyber.fur.common.service.Interface.IEmailService;
import com.scscyber.fur.common.service.Interface.IHandleErrors;
import com.scscyber.fur.common.ultility.CalculatorHelper;
import com.scscyber.fur.common.ultility.PasswordHelper;
import com.scscyber.fur.model.dto.MessageDto;
import com.scscyber.fur.model.dto.UserCreateDto;
import com.scscyber.fur.model.dto.UserDto;
import com.scscyber.fur.mybatis.mapper.UserMapper;
import com.scscyber.fur.service.itf.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import java.util.Collections;
import java.util.List;

@Service
public class UserService implements IUserService {
    private final IHandleErrors handleErrors;
    private final UserMapper userMapper;
    private final IEmailService emailService;

    public UserService(IHandleErrors handleErrors, UserMapper userMapper, IEmailService emailService) {
        this.handleErrors = handleErrors;
        this.userMapper = userMapper;
        this.emailService = emailService;
    }

    @Override
    public MessageDto CreateUserByEmail(UserDto userDto, BindingResult bindingResult) {
        //get list error validation
        List<String> error = handleErrors.ErrorBindingResults(bindingResult);

        MessageDto messageResults = new MessageDto();

        //check error
        if (error != null && error.size() > 0) {
            messageResults.setIsError(true);
            messageResults.setMessages(error);
            return messageResults;
        }

        //check email exists
        int id = userMapper.checkExistsEmail(userDto.getEmail());
        if (id > 0) {
            messageResults.setIsError(true);
            messageResults.setMessages(Collections.singletonList("EmailExists"));
            return messageResults;
        }

        //generate password
        String password = CalculatorHelper.GeneratePassword();
        String hashPassword = PasswordHelper.HashPassword(password);

        //create user
        UserCreateDto userCreateDto = new UserCreateDto(userDto.getEmail(), hashPassword);
        userMapper.createUser(userCreateDto);
        emailService.SendEmailRegisterUser(userDto.getEmail(), password);

        return messageResults;
    }
}
