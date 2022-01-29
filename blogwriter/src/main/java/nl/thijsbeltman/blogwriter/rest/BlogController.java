package nl.thijsbeltman.blogwriter.rest;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import nl.thijsbeltman.blogwriter.mapper.BlogMapper;
import nl.thijsbeltman.blogwriter.model.Blog;
import nl.thijsbeltman.blogwriter.rest.dto.BlogDto;
import nl.thijsbeltman.blogwriter.service.BlogService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/blog")
@Slf4j
@RequiredArgsConstructor
public class BlogController {

    private final BlogService blogService;

    @PostMapping
    public ResponseEntity<Void> writeBlog(@Valid @RequestBody BlogDto blogDto) {
        log.info("Recieved blogDto: {}" , blogDto);
        Blog blog = BlogMapper.INSTANCE.blogDtoToBlog(blogDto);
        log.info("Mapped to blog: {}", blog);
        blogService.create(blog);
        return ResponseEntity.ok().build();
    }

}
