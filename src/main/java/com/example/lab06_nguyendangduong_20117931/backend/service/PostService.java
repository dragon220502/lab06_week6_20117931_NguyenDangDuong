package com.example.lab06_nguyendangduong_20117931.backend.service;


import com.example.lab06_nguyendangduong_20117931.backend.models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    private com.example.WWW_Week06.repositories.PostRepository postRepository;

    public void createOrUpdate(Post p){
        postRepository.save(p);
    }

    public void delete(long id){
        postRepository.deleteById(id);
    }

    public Post findOne(long id){
        return postRepository.findById(id).get();
    }

    public List<Post> findAll(){
        return postRepository.findAll();
    }
}
