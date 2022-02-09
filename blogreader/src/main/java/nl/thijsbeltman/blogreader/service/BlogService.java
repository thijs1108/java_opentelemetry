package nl.thijsbeltman.blogreader.service;

import lombok.RequiredArgsConstructor;
import nl.thijsbeltman.blogreader.mapper.BlogMapper;
import nl.thijsbeltman.blogreader.model.Blog;
import nl.thijsbeltman.blogreader.repository.BlogRepository;
import nl.thijsbeltman.blogreader.rest.dto.BlogDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.random.RandomGenerator;

@Service
@RequiredArgsConstructor
public class BlogService {

    private final BlogRepository blogRepository;

    public List<BlogDto> getAllBlogs() {
        List<Blog> all = blogRepository.findAll();
        Random random = new Random();
        if (random.nextFloat() > 0.75) {
            throw new RuntimeException("failed");
        }
        return BlogMapper.INSTANCE.blogListToBlogDtoList(all);
    }
}
