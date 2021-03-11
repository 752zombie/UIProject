package com.example.demo.controllers;

import com.example.demo.models.Company;
import com.example.demo.models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@Controller
public class UploadController {

    ArrayList<Post> posts;

    public UploadController() {
        posts = new ArrayList<>();
    }

    @PostMapping("/process-sign-in")
    public String processSignIn(@RequestParam("inputEmail") String email, @RequestParam("inputPassword") String password, HttpSession session) {
        Company company = new Company(email);
        session.setAttribute("user", company);

        return "redirect:/";
    }

    @PostMapping("/upload-post")
    public String uploadPost(@RequestParam("title") String title, @RequestParam("description") String description,
                             @RequestParam("address") String address, @RequestParam("food-type") String foodType, Model model, HttpSession session) {

        Company company = (Company) session.getAttribute("user");

        try {
            Post post = new Post(foodType, description, address, company.getName(), title);
            posts.add(post);
            model.addAttribute("posts", posts);
        }
        catch (NullPointerException e) {
            return "redirect:/not-signed-in-error";
        }

        return "frontPage";
    }

    @GetMapping("/upload-post")
    public String uploadPage() {
        return "uploadPost";
    }

    @GetMapping("/not-signed-in-error")
    @ResponseBody
    public String notSignedInError() {
        return "Error: you must be signed in before you can upload a post";
    }



}
