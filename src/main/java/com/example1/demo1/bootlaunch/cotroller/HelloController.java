package com.example1.demo1.bootlaunch.cotroller;

import com.example1.demo1.bootlaunch.model.Article;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
public class HelloController {
    @RequestMapping("hello")
    public Article hello() {

        Article article=new Article();
        article.setAuthor("字母哥");
        Article article1 = article.builder().id(3l).author("哈哈").build();
        log.info("测试一下"+article1);
        return article1;
    }


}
