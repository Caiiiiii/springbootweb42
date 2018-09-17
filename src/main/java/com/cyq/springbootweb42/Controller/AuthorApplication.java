package com.cyq.springbootweb42.Controller;

import com.cyq.springbootweb42.Object.AuthorSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@SpringBootApplication
@ComponentScan("com.cyq.springbootweb42.Object")
public class AuthorApplication {

    @Autowired
    private AuthorSettings authorSettings;

    @RequestMapping("/authorApplication")
    public String index(){
        return "author name is:"+ authorSettings.getName()+" and author age is "+authorSettings.getAge();
    }
}
