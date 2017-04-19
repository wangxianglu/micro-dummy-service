package com.example.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lout on 2017/4/12.
 */
@RestController
public class DemoController {

    @RequestMapping("/admin")
    public String getResult(){
        return "admin-success";
    }

    @RequestMapping("/person/me")
    public String getResults(){
        return "user-success";
    }
}
