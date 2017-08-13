package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *     SpringBoot Demo
 * </p>
 *
 * @Author Gui Jin Kang
 * @Date 2017/8/5 21:25
 * @ProjectName SpringDemo
 * @Version 1.0
 */
@SpringBootApplication
@RestController
@RequestMapping("/spring")
public class Application {

    @RequestMapping("/method")
    public  String method(){
        return "URL is /spring/method";
    }

    @RequestMapping("/method/add")
    public String add(){
        return "URL is /spring/method/add";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id){
        return String.format("delete %d",id);
    }

    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}
