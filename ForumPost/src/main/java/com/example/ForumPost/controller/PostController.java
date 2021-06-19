package com.example.ForumPost.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ForumPost.model.Post;
import com.example.ForumPost.service.PostService;

@RestController
@RequestMapping("")
public class PostController {
	private final PostService postService;
	
	public PostController(PostService postService) {
		this.postService=postService;
	}
	
	@GetMapping("/all")
	public ResponseEntity<Iterable<Post>> getAllPosts(){
		Iterable<Post> posts = postService.findAllPosts();
		return new ResponseEntity<>(posts,HttpStatus.OK);
	}
	@GetMapping("/find/{id}")
	public ResponseEntity<Post> getPostById(@PathVariable("id")Long id){
		Post posts = postService.findPostById(id);
		return new ResponseEntity<>(posts,HttpStatus.OK);
	}
	
	
	@PostMapping("/add")
	public ResponseEntity<Post> addPost(@RequestBody Post post){
		try {
			postService.addPost(post);
			return new ResponseEntity<Post>(post, HttpStatus.CREATED);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<Post>(HttpStatus.BAD_REQUEST);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Post> updatePost(@RequestBody Post post){
		Post updatedPost = postService.updatePost(post);
		return new ResponseEntity<>(updatedPost,HttpStatus.OK);
	}
	
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deletePost(@PathVariable("id")Long id){
		postService.deletePost(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	

}
