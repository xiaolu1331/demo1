package com.example1.demo1.bootlaunch.Service;

import com.example1.demo1.bootlaunch.dao.Article;
import com.example1.demo1.bootlaunch.dao.ArticleRepository;
import com.example1.demo1.bootlaunch.model.AjaxResponse;
import com.example1.demo1.bootlaunch.model.ArticleVo;
import com.example1.demo1.bootlaunch.utils.DozerUtils;
import org.dozer.Mapper;
import org.hibernate.annotations.Source;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleRestJPAServiceImpl implements ArticleRestService {

    @Source
    private ArticleRepository articleRepository;

    @Source
    private Mapper dozerMapper;

    @Override
    public ArticleVo saveArticle(ArticleVo article) {
        Article articlePO = dozerMapper.map(article, Article.class);
        articleRepository.save(articlePO);
        return article;
    }

    @Override
    public void deleteArticle(Long id) {
        articleRepository.deleteById(id);
    }

    @Override
    public void uodateArticle(ArticleVo article) {
        Article articlePO = dozerMapper.map(article, Article.class);
        articleRepository.save(articlePO);
    }

    @Override
    public ArticleVo getArticle(Long id) {

        Optional<Article> article = articleRepository.findById(id);
        return dozerMapper.map(article.get(),ArticleVo.class);
    }

    @Override
    public List<ArticleVo> setAll() {
        List<Article> articleLis = articleRepository.findAll();
        return DozerUtils.mapList(articleLis,ArticleVo.class);
    }

    public ArticleVo getAll(){

        return  null;
    }

}

