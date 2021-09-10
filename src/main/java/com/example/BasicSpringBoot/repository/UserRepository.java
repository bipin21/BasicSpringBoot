package com.example.BasicSpringBoot.repository;

import com.example.BasicSpringBoot.domain.Post;
import com.example.BasicSpringBoot.domain.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    @Query("select u.posts from User u where u.id = :id")
    List<Post> findPosts(@Param("id") Long id);

    @Query("select u from User u where u.posts.size > :number")
    List<User> UserWithMorePosts(@Param("number") int number);
}
