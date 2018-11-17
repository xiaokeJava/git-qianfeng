package com.qianfeng.git.qianfeng.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("CitController")
public class GitController {
    @RequestMapping("git")
    public String git(){
        System.out.println("开心");
        return "";
    }
}
