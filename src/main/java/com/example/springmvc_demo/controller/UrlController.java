package com.example.springmvc_demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * PathVariable和Param的区别
 */
@RestController
public class UrlController {

    //http://localhost:8080/test/id
    @RequestMapping("test/{id}")
    public void test1(@PathVariable("id") String id) {
        System.out.println("id:" + id);
    }

    //http://localhost:8080/test?id=1
    @RequestMapping("test")
    public void test2(@RequestParam("id") String id1) {
        System.out.println("id1: " + id1);
    }
}
