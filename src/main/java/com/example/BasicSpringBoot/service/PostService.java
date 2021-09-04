package com.example.BasicSpringBoot.service;

import com.example.BasicSpringBoot.domain.Post;

import java.util.List;
import java.util.Optional;

public interface PostService {

    public List<Post> getAll();


    public Optional<Post> getById(int id);
}