package nl.thijsbeltman.blogwriter.mapper;

import nl.thijsbeltman.blogwriter.model.Blog;
import nl.thijsbeltman.blogwriter.rest.dto.BlogDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BlogMapper {

    BlogMapper INSTANCE = Mappers.getMapper(BlogMapper.class);

    BlogDto blogToBlogDto(Blog blog);

    Blog blogDtoToBlog(BlogDto blogDto);

}
