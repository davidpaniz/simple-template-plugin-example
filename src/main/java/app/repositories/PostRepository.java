package app.repositories;

import java.util.List;

import app.models.Post;

public interface PostRepository {
	/*
	 * Delete the methods you don't want to expose
	 */
	 
	void create(Post entity);
	
	Post update(Post entity);
	
	void destroy(Post entity);
	
	Post find(Long id);
	
	List<Post> findAll();

}
