package com.examples.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examples.domain.Post;

public interface PostRepo extends JpaRepository<Post, Long>{

}
