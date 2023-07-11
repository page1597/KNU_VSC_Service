package com.team4.versioncontrol.knu_vcs_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @GetMapping("/hello")
    public String test() {
        return "hello world!";
    }
}
