package com.sparkarabic.accountservice.service;

import com.sparkarabic.accountservice.client.AuthServiceFeignClient;
import com.sparkarabic.accountservice.dto.UserDto;
import com.sparkarabic.accountservice.dto.UserRegistrationDto;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    private final AuthServiceFeignClient authServiceFeignClient;

    public AccountServiceImpl(AuthServiceFeignClient authServiceFeignClient) {
        this.authServiceFeignClient = authServiceFeignClient;
    }

    @Override
    public UserDto create(UserRegistrationDto user) {
        return authServiceFeignClient.createUser(user);
    }

    @Override
    public UserDto createDummy(UserRegistrationDto user) {
        return authServiceFeignClient.createDummyUser(user);
    }
}
