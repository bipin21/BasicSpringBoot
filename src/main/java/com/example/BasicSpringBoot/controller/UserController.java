package com.example.BasicSpringBoot.controller;

import com.example.BasicSpringBoot.domain.Post;
import com.example.BasicSpringBoot.domain.User;
import com.example.BasicSpringBoot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public Optional<User> getById(@PathVariable("id") long id){
        return userService.getUserById(id);
    }

    @PostMapping
    @PutMapping
    public User save(@RequestBody User user){
        return userService.save(user);
    }

    @GetMapping("/{id}/posts")
    public List<Post> UserPosts(@PathVariable("id") long id){
        return userService.findPosts(id);
    }

   // get users who have more than 1 posts
    @GetMapping("usersWithMoreThanOnePosts")
    public List<User> UserWithMorePosts(@RequestParam("number") int number){
        return userService.UserWithMorePosts(number);
    }



}
