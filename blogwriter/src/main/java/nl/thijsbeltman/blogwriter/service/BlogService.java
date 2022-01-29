package nl.thijsbeltman.blogwriter.service;

import lombok.RequiredArgsConstructor;
import nl.thijsbeltman.blogwriter.model.Blog;
import nl.thijsbeltman.blogwriter.repository.BlogRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BlogService {

    private final BlogRepository blogRepository;

    public void create(Blog blog) {
        blogRepository.save(blog);
    }

}
