package com.example.WWW_Week06.repositories;


import com.example.lab06_nguyendangduong_20117931.backend.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
