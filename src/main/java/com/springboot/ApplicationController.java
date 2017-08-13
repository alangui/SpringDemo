package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @Author Gui Jin Kang
 * @Date 2017/8/5 23:42
 * @ProjectName SpringDemo
 * @Version 1.0
 */
@SpringBootApplication
@RequestMapping("/user")
@Controller
public class ApplicationController {

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name, Model model){
        model.addAttribute("name",name);
        return "hello";
    }

    public static void main(String[] args){
        SpringApplication.run(ApplicationController.class,args);
    }
}
