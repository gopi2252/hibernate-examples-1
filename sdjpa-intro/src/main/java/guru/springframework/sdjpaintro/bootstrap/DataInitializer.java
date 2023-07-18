package guru.springframework.sdjpaintro.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import guru.springframework.sdjpaintro.domain.Post;
import guru.springframework.sdjpaintro.domain.PostComment;
import guru.springframework.sdjpaintro.repository.PostCommentRepo;
import guru.springframework.sdjpaintro.repository.PostRepo;

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
		
//		Post post = new Post();
//		post.setTitle("Spring data jpa");
//		postRepo.save(post);
//		
//		PostComment comment = new PostComment();
//		comment.setReview("Excellent");
//		comment.setPost(post);
//		postCommentRepo.save(comment);
		
		PostComment comment = postCommentRepo.findById(3L).get();
		
		System.out.println(comment);
		
		System.out.println(comment.getPost());
	}
	
}
