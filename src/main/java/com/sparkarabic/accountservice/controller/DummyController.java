package com.sparkarabic.accountservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class DummyController {
    @GetMapping(name = "/dummy")
    public String dummy() {
        return "temp";

    }
}
