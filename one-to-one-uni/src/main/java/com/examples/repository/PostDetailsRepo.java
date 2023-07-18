package com.examples.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examples.domain.PostDetails;

public interface PostDetailsRepo extends JpaRepository<PostDetails, Long>{

}
