package com.scscyber.fur.repository;

import com.scscyber.fur.model.dto.UserCreateDto;

public interface UserRepository {
    int checkExistsEmail(String email);
    void createUser(UserCreateDto userCreateDto);
}
