package com.course.system.controller;

import com.course.common.domain.Test;
import com.course.common.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {

    @Resource
     private TestService testService;
    @GetMapping("/test")
    public List<Test> test(){
        return testService.list();
    }
    @GetMapping("/ww")
    public String ds(){
        return "s";
    }




}
