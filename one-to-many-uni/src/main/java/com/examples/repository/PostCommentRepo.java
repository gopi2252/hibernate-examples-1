package com.examples.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examples.domain.PostComment;

public interface PostCommentRepo extends JpaRepository<PostComment, Long>{

}
