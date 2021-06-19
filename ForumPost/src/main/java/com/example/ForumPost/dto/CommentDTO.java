package com.example.ForumPost.dto;

import java.util.ArrayList;


public class CommentDTO {
	private Long id;
	private String name;
	private String text;
	
	private ArrayList<CommentDTO> commentDTOs = new ArrayList<CommentDTO>();

	public CommentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CommentDTO(Long id, String name, String text, ArrayList<CommentDTO> commentDTOs) {
		super();
		this.id = id;
		this.name = name;
		this.text = text;
		this.commentDTOs = commentDTOs;
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

	public ArrayList<CommentDTO> getCommentDTOs() {
		return commentDTOs;
	}

	public void setCommentDTOs(ArrayList<CommentDTO> commentDTOs) {
		this.commentDTOs = commentDTOs;
	}
	
	
	
	
}
