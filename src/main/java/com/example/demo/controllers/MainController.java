package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class MainController {

@GetMapping("/")

    public String frontPage(Model model){
        model.addAttribute("posts", UploadController.posts);
        return "frontPage.html";
}

@GetMapping("/sign-in")
    public String signIn(){

    return "signin.html";

}

@GetMapping("/sign-out")
    public String signOut(HttpSession session) {

    session.invalidate();
    return "redirect:/";
}


}
