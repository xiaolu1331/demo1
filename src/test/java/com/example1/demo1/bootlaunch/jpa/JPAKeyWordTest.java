package com.example1.demo1.bootlaunch.jpa;

import com.example1.demo1.bootlaunch.dao.Article;
import com.example1.demo1.bootlaunch.dao.ArticleRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JPAKeyWordTest
{
    @Resource
    private ArticleRepository articleRepository;
    @Test
    public void userTest() {
//     Article article=  articleRepository.findByAuthor("zimug");
//        System.out.println(article);


    }
}
