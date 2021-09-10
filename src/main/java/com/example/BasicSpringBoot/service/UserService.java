package com.example.BasicSpringBoot.service;

import com.example.BasicSpringBoot.domain.Post;
import com.example.BasicSpringBoot.domain.User;

import java.util.List;
import java.util.Optional;


public interface UserService {

    public List<User> getAllUsers();

    public Optional<User> getUserById(long id);

    public User save(User user);

    public List<Post> findPosts(long id);

    public List<User> UserWithMorePosts(int number);
}
