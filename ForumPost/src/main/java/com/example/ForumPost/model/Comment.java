package com.example.ForumPost.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Comment implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private String text;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	@JoinColumn(name="post_id")
	@JsonIgnore
	private Post post;

	
	
	
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Comment(Long id, String name, String text, Post post) {
		super();
		this.id = id;
		this.name = name;
		this.text = text;
		this.post = post;
	}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getText() {
		return text;
	}




	public void setText(String text) {
		this.text = text;
	}




	public Post getPost() {
		return post;
	}




	public void setPost(Post post) {
		this.post = post;
	}
	
	
	
	
	
	
	

}
