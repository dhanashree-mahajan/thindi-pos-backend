package com.thindipos.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/staff")
public class StaffTestController {

    @GetMapping("/test")
    public String staffTest() {
        return "STAFF access successful";
    }
}