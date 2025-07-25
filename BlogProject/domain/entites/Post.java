package com.blog.BlogProject.domain.entites;


import com.blog.BlogProject.domain.PostStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Post {


    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String title;


    @Column(nullable = false)
    private String content;


    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private PostStatus status;

    @Column(nullable = false)
    private Integer readingTime;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "author_id", nullable = false)
    private User author;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;


    @ManyToMany
    @JoinTable(
            name = "post_tags",
            joinColumns = @JoinColumn(name = "post_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id")
    )
    private Set<Tag> tags = new HashSet<>();


    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private LocalDateTime updatedAt;


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(id, post.id) && Objects.equals(title, post.title) && Objects.equals(content, post.content) && Objects.equals(status, post.status) && Objects.equals(readingTime, post.readingTime) && Objects.equals(author, post.author) && Objects.equals(createdAt, post.createdAt) && Objects.equals(updatedAt, post.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, content, status, readingTime, author, createdAt, updatedAt);
    }

    @PrePersist
    protected void onCreate(){
        LocalDateTime now = LocalDateTime.now();
        this.createdAt = now;
        this.updatedAt = now;
    }

    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = LocalDateTime.now();
    }
}
