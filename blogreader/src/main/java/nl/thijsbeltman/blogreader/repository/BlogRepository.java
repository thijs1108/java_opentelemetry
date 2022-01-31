package nl.thijsbeltman.blogreader.repository;

import nl.thijsbeltman.blogreader.model.Blog;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BlogRepository extends CrudRepository<Blog, Integer> {

    List<Blog> findAll();

}
