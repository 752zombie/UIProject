package com.example.demo.controllers;

import com.example.demo.models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class UploadController {

    ArrayList<Post> posts;

    public UploadController() {
        posts = new ArrayList<>();
    }

    @PostMapping("/process-sign-in")
    public String processSignIn(@RequestParam("inputEmail") String email, @RequestParam("inputPassword") String password) {

        return "uploadPost";
    }

    @PostMapping("upload-post")
    public String uploadPost(@RequestParam("title") String title, @RequestParam("description") String description,
                             @RequestParam("address") String address, @RequestParam("food-type") String foodType, Model model) {

        Post post = new Post(foodType, description, address, "Netto", title);
        posts.add(post);
        model.addAttribute("posts", posts);

        return "frontPage";
    }

}
