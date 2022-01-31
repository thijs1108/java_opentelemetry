package nl.thijsbeltman.blogreader.service;

import lombok.RequiredArgsConstructor;
import nl.thijsbeltman.blogreader.mapper.BlogMapper;
import nl.thijsbeltman.blogreader.model.Blog;
import nl.thijsbeltman.blogreader.repository.BlogRepository;
import nl.thijsbeltman.blogreader.rest.dto.BlogDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BlogService {

    private final BlogRepository blogRepository;

    public List<BlogDto> getAllBlogs() {
        List<Blog> all = blogRepository.findAll();
        return BlogMapper.INSTANCE.blogListToBlogDtoList(all);
    }
}
