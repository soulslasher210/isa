package com.example.ForumPost.exceptions;

public class PostNotFoundException extends RuntimeException {
	public PostNotFoundException(String message) {
		super(message);
	}

}
