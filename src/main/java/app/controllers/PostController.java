package app.controllers;

import java.util.List;

import app.models.Post;
import app.repositories.PostRepository;
import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;

@Resource
public class PostController {

	private final Result result;
	private final PostRepository repository;
	private final Validator validator;

	PostController(Result result, PostRepository repository, Validator validator) {
		this.result = result;
		this.repository = repository;
		this.validator = validator;
	}

	@Get("/posts")
	public List<Post> index() {
		return repository.findAll();
	}

	@br.com.caelum.vraptor.Post("/posts")
	public void create(Post post) {
		validator.validate(post);
		validator.onErrorUsePageOf(this).newPost();
		repository.create(post);
		result.redirectTo(this).index();
	}

	@Get("/posts/new")
	public Post newPost() {
		return new Post();
	}

	@Put("/posts/{post.id}")
	public void update(Post post) {
		validator.validate(post);
		validator.onErrorUsePageOf(this).edit(post);
		repository.update(post);
		result.redirectTo(this).index();
	}

	@Get("/posts/{post.id}/edit")
	public Post edit(Post post) {
		return repository.find(post.getId());
	}

	@Get("/posts/{post.id}")
	public Post show(Post post) {
		return repository.find(post.getId());
	}

	@Delete("/posts/{post.id}")
	public void destroy(Post post) {
		repository.destroy(repository.find(post.getId()));
		result.redirectTo(this).index();
	}
}