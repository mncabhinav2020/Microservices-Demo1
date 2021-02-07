package com.dailycodebuffer.cloud.getway.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallMethodController {

    @GetMapping("/userServiceFallback")
    public String userServiceFallBackMethod() {
        return "user service taking longer then expected." +
                "Please try again...";
    }

    @GetMapping("/departmentServiceFallback")
    public String departmentServiceFallBackMethod() {
        return "department service taking longer then expected." +
                "Please try again...";
    }
}
