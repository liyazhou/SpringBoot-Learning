package com.didispace.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class HelloController {

//    http://127.0.0.1:8080/hello
    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
    //    http://127.0.0.1:8080/test
    @RequestMapping("/test")
    public String test(HttpServletRequest request, HttpServletResponse response) {
        System.out.println(request.getRequestURL());
        return "test";
    }
}