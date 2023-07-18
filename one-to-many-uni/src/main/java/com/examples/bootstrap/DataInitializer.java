package com.examples.bootstrap;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.examples.domain.Post;
import com.examples.domain.PostComment;
import com.examples.repository.PostCommentRepo;
import com.examples.repository.PostRepo;


@Component
public class DataInitializer implements CommandLineRunner{

	private PostRepo postRepo;
	
	private PostCommentRepo postCommentRepo;
	
	public DataInitializer(PostRepo postRepo, PostCommentRepo postCommentRepo) {
		super();
		this.postRepo = postRepo;
		this.postCommentRepo = postCommentRepo;
	}


	@Transactional
	@Override
	public void run(String... args) throws Exception {
		
		PostComment comment = new PostComment();
		comment.setReview("Excellent");
		//postCommentRepo.save(comment);
		
		Post post = new Post();
		post.setTitle("Spring data jpa");
		post.setComments(Arrays.asList(comment));
		postRepo.save(post);
		
		
		
//		PostComment comment = postCommentRepo.findById(3L).get();
//		
//		System.out.println(comment);
//		
//		System.out.println(comment.getPost());
	}
	
}
