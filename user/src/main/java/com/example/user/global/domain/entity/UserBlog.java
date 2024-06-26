package com.example.user.global.domain.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;


@Entity
@Table(name = "USER_BLOGS")
@NoArgsConstructor
@AllArgsConstructor
@Getter @Builder
public class UserBlog {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "USER_BLOG_ID")
    private UUID id;
    @Column(name = "NICKNAME")
    private String nickname;
    @Column(name = "BLOG_NAME")
    private String blogName;

    @Column(name="POST_ID")
    private Long postId;

    @Column(name="NEIGHBOR_ID")
    @OneToMany(mappedBy = "userBlog")
    private List<Neighbor> neighbors;

}
