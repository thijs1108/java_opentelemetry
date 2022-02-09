package nl.thijsbeltman.blogreader.rest;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import nl.thijsbeltman.blogreader.rest.dto.BlogDto;
import nl.thijsbeltman.blogreader.service.BlogService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/blog")
@Slf4j
@RequiredArgsConstructor
public class BlogController {

    private final BlogService blogService;

    @GetMapping
    public ResponseEntity<List<BlogDto>> retrieveBlogs() {
        log.info("Recieved request for all blogs");
        List<BlogDto> allBlogs = blogService.getAllBlogs();
        log.info("Found {} blogs", allBlogs.size());
        return ResponseEntity.ok().body(allBlogs);
    }

}
