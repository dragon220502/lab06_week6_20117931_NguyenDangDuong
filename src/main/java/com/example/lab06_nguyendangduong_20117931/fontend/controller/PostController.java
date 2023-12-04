package com.example.lab06_nguyendangduong_20117931.fontend.controller;


import com.example.lab06_nguyendangduong_20117931.backend.models.Post;
import com.example.lab06_nguyendangduong_20117931.backend.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {
    @Autowired
    private PostService postService;

    @PostMapping("/save")
    public void save(@RequestBody Post p){
        postService.createOrUpdate(p);
    }

    @GetMapping("/findAll")
    public List<Post> findAll(){
        return postService.findAll();
    }
}
