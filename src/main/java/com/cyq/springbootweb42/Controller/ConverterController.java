package com.cyq.springbootweb42.Controller;

import com.cyq.springbootweb42.Object.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConverterController {
    @RequestMapping(value = "/convert", produces = { "application/x-wisely" }) //①
    public @ResponseBody DemoObj convert(@RequestBody DemoObj demoObj) {
        System.out.println("传到后台没有");
        return demoObj;
    }
}
