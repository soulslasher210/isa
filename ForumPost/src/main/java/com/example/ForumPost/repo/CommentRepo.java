package com.example.ForumPost.repo;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ForumPost.model.Comment;
import com.example.ForumPost.model.Post;

@Repository
public interface CommentRepo extends CrudRepository<Comment, Long> {
	
	
	
	void deleteCommentById(Long id);
	List<Comment> findByPost(Post post, Sort sort);
	
}
