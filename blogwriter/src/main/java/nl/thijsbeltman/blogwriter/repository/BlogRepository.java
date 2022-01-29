package nl.thijsbeltman.blogwriter.repository;

import nl.thijsbeltman.blogwriter.model.Blog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends CrudRepository<Blog, Integer> {
}
