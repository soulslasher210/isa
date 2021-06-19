package com.example.ForumPost.service;





import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.ForumPost.model.Comment;
import com.example.ForumPost.repo.CommentRepo;
import com.example.ForumPost.repo.PostRepo;

@Service
public class CommentService {
	
	
	private CommentRepo commentRepo;
	private PostRepo postRepo;
	
	
	
	@Autowired
	public CommentService(CommentRepo commentRepo) {
		this.commentRepo = commentRepo;
		
	}

	public Iterable<Comment> findAllComments(){
		return commentRepo.findAll();
	}
	
	public Comment addComment(Comment comment) {
		return commentRepo.save(comment);
	}

	@Transactional
	public void deleteComment (Long id) {
		commentRepo.deleteCommentById(id);
	}

}
