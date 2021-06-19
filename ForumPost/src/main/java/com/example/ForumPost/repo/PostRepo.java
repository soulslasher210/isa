package com.example.ForumPost.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ForumPost.model.Post;


@Repository
public interface PostRepo extends CrudRepository<Post, Long> {

	void deletePostById(Long id);

	Optional<Post> findPostById(Long id);

}
