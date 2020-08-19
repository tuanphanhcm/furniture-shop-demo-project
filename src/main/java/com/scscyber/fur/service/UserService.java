package com.scscyber.fur.service;

import com.scscyber.fur.common.function.Interface.IHandleErrors;
import com.scscyber.fur.model.dto.MessageDto;
import com.scscyber.fur.model.dto.UserDto;
import com.scscyber.fur.service.itf.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import java.util.List;

@Service
public class UserService implements IUserService {
    private final IHandleErrors handleErrors;

    public UserService(IHandleErrors handleErrors) {
        this.handleErrors = handleErrors;
    }

    @Override
    public MessageDto CreateUserByEmail(UserDto userDto, BindingResult bindingResult) {
        List<String> error = handleErrors.ErrorBindingResults(bindingResult);
        MessageDto messageResults = new MessageDto();
        if (error != null && error.size() > 0) {
            messageResults.IsError = true;
            messageResults.Messages = error;
        }

        return messageResults;
    }
}
