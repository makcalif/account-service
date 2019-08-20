package com.sparkarabic.accountservice.service;

import com.sparkarabic.accountservice.dto.UserDto;
import com.sparkarabic.accountservice.dto.UserRegistrationDto;

public interface AccountService {

    /**
     * Invokes Auth Service user creation
     *
     * @param user
     * @return created account
     */
    UserDto create(UserRegistrationDto user);

    UserDto createDummy(UserRegistrationDto user);

}
