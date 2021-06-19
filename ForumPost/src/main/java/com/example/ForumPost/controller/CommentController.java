package com.example.ForumPost.controller;





import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.ForumPost.model.Comment;
import com.example.ForumPost.service.CommentService;


@RestController
@RequestMapping("/comment")
public class CommentController {
	
	private final CommentService commentService;
	
	public CommentController(CommentService commentService) {
		this.commentService = commentService;
		
	}
	
	@GetMapping("/all")
	public ResponseEntity<Iterable<Comment>>getAllComments(){
		Iterable<Comment>comments = commentService.findAllComments();
		return new ResponseEntity<>(comments,HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Comment> addComment(@RequestBody Comment comment){
		
		try {
		commentService.addComment(comment) ;
		return new ResponseEntity<Comment>(comment,HttpStatus.CREATED);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<Comment>(HttpStatus.NOT_FOUND);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?>deleteComment(@PathVariable("id")Long id){
		commentService.deleteComment(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
