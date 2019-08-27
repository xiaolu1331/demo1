package com.example1.demo1.bootlaunch.Service;

import com.example1.demo1.bootlaunch.model.AjaxResponse;
import com.example1.demo1.bootlaunch.model.Article;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Slf4j
@Service
public class ArticleRestService {


   public String saveArticle(Article article) {

        log.info("saveArticle：{}",article);
        return  "测试";
    }
}
