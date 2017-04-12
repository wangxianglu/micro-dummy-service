package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lout on 2017/4/12.
 */
@RestController
@RequestMapping("/sample")
public class DemoController {

    @RequestMapping("/result")
    public String getResult(){
        return "success";
    }

}
