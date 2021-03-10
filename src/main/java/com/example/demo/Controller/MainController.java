package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

@GetMapping("/NoWaste")

    public String frontPage(){


    return "frontPage.html";
}

@GetMapping("/signin")
    public String signIn(){

    return "signin.html";

}


}
