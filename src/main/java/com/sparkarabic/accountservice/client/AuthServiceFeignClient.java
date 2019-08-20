package com.sparkarabic.accountservice.client;

import com.sparkarabic.accountservice.dto.UserDto;
import com.sparkarabic.accountservice.dto.UserRegistrationDto;
import com.sparkarabic.accountservice.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "auth-service")
public interface AuthServiceFeignClient {

    @PostMapping(value = "/uaa/user")
    UserDto createUser(@RequestBody UserRegistrationDto user);

    @PostMapping(value = "/uaa/user/dummy")
    UserDto createDummyUser(@RequestBody UserRegistrationDto user);


}
