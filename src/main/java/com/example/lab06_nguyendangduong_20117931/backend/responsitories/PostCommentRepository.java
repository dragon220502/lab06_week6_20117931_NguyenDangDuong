package com.example.lab06_nguyendangduong_20117931.backend.responsitories;


import com.example.lab06_nguyendangduong_20117931.backend.models.PostComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostCommentRepository extends JpaRepository<PostComment, Long> {
}
