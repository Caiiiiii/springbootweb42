package com.cyq.springbootweb42.Controller;

import com.cyq.springbootweb42.Object.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdviceController {
    @RequestMapping("/advice")
    public String getSomething(@ModelAttribute("msg") String msg) throws Exception{
        throw new IllegalArgumentException("参数有误,"+"来自@ModelAttribute："+msg);
    }
}
