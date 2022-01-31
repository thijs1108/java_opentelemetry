package nl.thijsbeltman.blogreader.rest.dto;

import lombok.Data;

@Data
public class BlogDto {

    private String writer;
    private String title;
    private String content;

}
