package guru.springframework.sdjpaintro.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class PostComment {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "postcomment_seq")
    @SequenceGenerator(name = "postcomment_seq", sequenceName = "postcomment_seq", allocationSize = 1)
	private Long id;
	
	private String review;
	
	@ManyToOne(fetch = FetchType.LAZY,optional = false)
	@JoinColumn(name="post_id")
	private Post post;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	@Override
	public String toString() {
		return "PostComment [id=" + id + ", review=" + review + ", post=" + post + "]";
	}
	
	
	
}
