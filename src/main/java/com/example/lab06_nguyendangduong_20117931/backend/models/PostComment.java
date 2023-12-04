package com.example.lab06_nguyendangduong_20117931.backend.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "post_comment")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
@Data
public class PostComment {
    @Id
    @Column(columnDefinition = "bigint(20)")
    private long id;
    @Column(columnDefinition = "tinytext")

    @Lob
    private String content;

    @Column(name = "created_at", columnDefinition = "datetime(6)")
    private Instant createdAt;
    @Column(columnDefinition = "bit(1)")
    private boolean published;
    @Column(name = "published_at", columnDefinition = "datetime(6)")
    private Instant publishedAt;
    @Column(columnDefinition = "varchar(100)")
    private String title;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private PostComment parent;

    @OneToMany(mappedBy = "parent")
    private Set<PostComment> postComments = new LinkedHashSet<>();

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;
}
