package com.example.lab06_nguyendangduong_20117931.backend.service;


import com.example.lab06_nguyendangduong_20117931.backend.models.User;
import com.example.lab06_nguyendangduong_20117931.backend.responsitories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void createOrUpdate(User u){
        userRepository.save(u);
    }

    public void delete(long id){
        userRepository.deleteById(id);
    }

    public User findOne(long id){
        return userRepository.findById(id).get();
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }
}
