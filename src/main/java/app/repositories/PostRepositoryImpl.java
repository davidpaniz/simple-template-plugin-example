package app.repositories;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;
import app.models.Post;

@Component
public class PostRepositoryImpl
    extends Repository<Post, Long>
    implements PostRepository {

	PostRepositoryImpl(EntityManager entityManager) {
		super(entityManager);
	}
}
