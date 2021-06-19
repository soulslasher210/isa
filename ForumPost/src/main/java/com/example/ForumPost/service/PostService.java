package com.example.ForumPost.service;


import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ForumPost.model.Post;
import com.example.ForumPost.repo.PostRepo;
import com.example.ForumPost.exceptions.PostNotFoundException;
@Service
public class PostService {
	
	private final PostRepo postRepo;
	
	@Autowired
	public PostService(PostRepo postRepo) {
		this.postRepo = postRepo;
	}
	
	public Post addPost(Post post) {
		post.setForumCode(UUID.randomUUID().toString());
		return postRepo.save(post);
	}
	
	public Iterable<Post> findAllPosts(){
		return postRepo.findAll();
	}
	public Post updatePost(Post post) {
		return postRepo.save(post);
	}
	
	
	public Post findPostById(Long id) {
		return postRepo.findPostById(id).orElseThrow(()->new PostNotFoundException("Post by id"+id+"was not found"));
	}
	
	@Transactional
	public void deletePost(Long id) {
		postRepo.deletePostById(id);
	}
}
