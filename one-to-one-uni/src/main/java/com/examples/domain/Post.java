package com.examples.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "post_seq")
    @SequenceGenerator(name = "post_seq", sequenceName = "post_seq", allocationSize = 1)
	private Long id;
	
	private String title;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	//@MapsId
	@JoinColumn(name ="details_id")
	PostDetails details;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public PostDetails getDetails() {
		return details;
	}

	public void setDetails(PostDetails details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", title=" + title + ", details=" + details + "]";
	}



	
	
	
}
