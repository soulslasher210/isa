package com.example.ForumPost.dto;

import java.util.ArrayList;

public class PostDTO {
	
	private Long id;
	private String name;
	private String title;
	private String text;
	private String forumCode;
	
	private ArrayList<CommentDTO> comment = new ArrayList<CommentDTO>();

	public PostDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PostDTO(Long id, String name, String title, String text, String forumCode, ArrayList<CommentDTO> comment) {
		super();
		this.id = id;
		this.name = name;
		this.title = title;
		this.text = text;
		this.forumCode = forumCode;
		this.comment = comment;
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

	public ArrayList<CommentDTO> getComment() {
		return comment;
	}

	public void setComment(ArrayList<CommentDTO> comment) {
		this.comment = comment;
	}

	
	
	
}
