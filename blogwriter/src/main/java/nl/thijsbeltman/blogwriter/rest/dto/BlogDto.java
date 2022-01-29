package nl.thijsbeltman.blogwriter.rest.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class BlogDto {

    @NotNull
    private String writer;
    @NotNull
    private String title;
    @NotNull
    private String content;

}
