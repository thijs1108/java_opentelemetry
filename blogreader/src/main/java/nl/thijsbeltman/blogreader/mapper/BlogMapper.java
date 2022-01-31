package nl.thijsbeltman.blogreader.mapper;

import nl.thijsbeltman.blogreader.model.Blog;
import nl.thijsbeltman.blogreader.rest.dto.BlogDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface BlogMapper {

    BlogMapper INSTANCE = Mappers.getMapper(BlogMapper.class);

    List<BlogDto> blogListToBlogDtoList(List<Blog> blogs);


}
