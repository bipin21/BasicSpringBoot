package com.example.BasicSpringBoot.service;

import com.example.BasicSpringBoot.domain.Post;

import java.util.List;
import java.util.Optional;

public interface PostService {

    public List<Post> findAll();

    public Optional<Post> getById(int id);

    public Post save(Post post);

    public int deleteById(int id);

    public void delete(Post post);
}
