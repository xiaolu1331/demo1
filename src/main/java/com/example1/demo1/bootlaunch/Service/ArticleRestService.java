package com.example1.demo1.bootlaunch.Service;

import com.example1.demo1.bootlaunch.model.ArticleVo;
import org.springframework.stereotype.Repository;

import java.util.List;



public interface ArticleRestService {


    ArticleVo saveArticle(ArticleVo article) ;

      void deleteArticle(Long id);
      void uodateArticle(ArticleVo article);
        ArticleVo getArticle(Long id);
        List<ArticleVo> setAll();
       ArticleVo getAll();
}
