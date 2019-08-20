package com.sparkarabic.accountservice.controller;

import com.sparkarabic.accountservice.dto.UserDto;
import com.sparkarabic.accountservice.dto.UserRegistrationDto;
import com.sparkarabic.accountservice.service.AccountService;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping
    public UserDto createNewAccount(@RequestBody UserRegistrationDto user) {
        return accountService.create(user);
    }

    @PostMapping ("/dummy")
    public UserDto createDummy(@RequestBody UserRegistrationDto user) {
        return accountService.createDummy(user);
    }

}
