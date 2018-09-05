package com.cyq.springbootweb42.Controller;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
public class uploadController {
    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public @ResponseBody String upload(@RequestParam("file") MultipartFile multipartFile){
        System.out.println("success");
        try{
            FileUtils.writeByteArrayToFile(new File("e:/upload/"
                + multipartFile.getOriginalFilename()),multipartFile.getBytes());

            return "ok";
        }catch (IOException e){
            e.printStackTrace();
            return "wrong";
        }

    }
}
