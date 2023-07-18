package com.examples.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "post_details")
public class PostDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "post_details_seq")
    @SequenceGenerator(name = "post_details_seq", sequenceName = "post_details_seq", allocationSize = 1)
	private Long id;
	
	private Date createdOn;
	
	private String createdBy;
	


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	
	
}
