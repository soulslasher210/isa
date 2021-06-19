package com.example.ForumPost.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Post implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String title;
	private String text;
	private String forumCode;
	
	
	@OneToMany(mappedBy = "post",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Comment>comments ;


	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Post(Long id, String name, String title, String text, String forumCode, Set<Comment> comments) {
		super();
		this.id = id;
		this.name = name;
		this.title = title;
		this.text = text;
		this.forumCode = forumCode;
		this.comments = comments;
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


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}


	public String getForumCode() {
		return forumCode;
	}


	public void setForumCode(String forumCode) {
		this.forumCode = forumCode;
	}




	public Set<Comment> getComments() {
		return comments;
	}




	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}





	




	




	
	
	
	
	
	

}
