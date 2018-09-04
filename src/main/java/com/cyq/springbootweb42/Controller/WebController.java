package com.cyq.springbootweb42.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        System.out.println("嘤嘤嘤");
        return "/index";
    }
}
