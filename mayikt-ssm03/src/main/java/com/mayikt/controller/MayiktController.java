package com.mayikt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MayiktController {

    @RequestMapping("/mayikt")
    public String mayikt(Integer id){
        int j = 1/id;
        return "id+"+id;
    }


}
