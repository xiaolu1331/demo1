package com.example1.demo1.bootlaunch.model;

import com.fasterxml.jackson.annotation.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonPropertyOrder(value={"content","title"})
public class ArticleVo {

    @JsonIgnore
    private  Long  id;
 @JsonProperty("auther")
    private String author;
    private String title;
    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    private List<Reader> reader;
}
