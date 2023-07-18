package com.examples.bootstrap;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.examples.domain.Post;
import com.examples.domain.PostDetails;
import com.examples.repository.PostDetailsRepo;
import com.examples.repository.PostRepo;


@Component
public class DataInitializer implements CommandLineRunner{

	private PostRepo postRepo;
	
	private PostDetailsRepo postDetailsRepo;
	
	public DataInitializer(PostRepo postRepo, PostDetailsRepo postDetailsRepo) {
		super();
		this.postRepo = postRepo;
		this.postDetailsRepo = postDetailsRepo;
	}


	@Transactional
	@Override
	public void run(String... args) throws Exception {
		
		PostDetails details = new PostDetails();
		
		details.setCreatedBy("kranthi");
		details.setCreatedOn(new Date());
		
		Post post = new Post();
		post.setTitle("Spring data jpa");
		post.setDetails(details);
		
		
		postRepo.save(post);
		
		
//		Post post = new Post();
//		post.setTitle("Spring data jpa");
//		
//		PostDetails details = new PostDetails();
//		
//		details.setCreatedBy("kranthi");
//		details.setCreatedOn(new Date());
//		details.setPost(post);
//		postDetailsRepo.save(details);
//		
		
//		PostComment comment = postCommentRepo.findById(3L).get();
//		
//		System.out.println(comment);
//		
//		System.out.println(comment.getPost());
	}
	
}
