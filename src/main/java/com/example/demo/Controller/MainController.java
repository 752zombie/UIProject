package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

@GetMapping("/")
    @ResponseBody
    public String index(){


    return "hello";
}

@GetMapping("/signin")
    public String signIn(){

    return "signin.html";

}


}
