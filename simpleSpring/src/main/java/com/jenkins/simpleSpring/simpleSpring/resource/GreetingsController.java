package com.jenkins.simpleSpring.simpleSpring.resource;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@EnableAutoConfiguration
public class GreetingsController {

    @RequestMapping("/simpleSpring/hello")
    @ResponseBody
    public String sayHello(){
        return "hello Spring";
    }

}

