package com.example1.demo1.bootlaunch.cotroller;

import com.example1.demo1.bootlaunch.Service.ArticleRestService;
import com.example1.demo1.bootlaunch.model.AjaxResponse;
import com.example1.demo1.bootlaunch.model.ArticleVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping("/rest")
public class ArticleRestController {

// @Resource(name = "ArticleRestJPAServiceImpl")
@Resource
 ArticleRestService articleRestService;


//    @RequestMapping(value = "/article", method = POST, produces = "application/json")
    @PostMapping("/article")
    public AjaxResponse saveArticle(@RequestBody ArticleVo article) {
//        public AjaxResponse saveArticle(@RequestParam String  id,
//                                        @RequestParam String author) {
        articleRestService.saveArticle(article);
//        log.info("saveArticle：{}",article);
        return  AjaxResponse.success(article);
    }
 
//    @RequestMapping(value = "/article/{id}", method = DELETE, produces = "application/json")
    @DeleteMapping("/article/{id}")
    public AjaxResponse deleteArticle(@PathVariable Long id) {

//        log.info("deleteArticle：{}",id);
        articleRestService.deleteArticle(id);
        return AjaxResponse.success(id);
    }
 
//    @RequestMapping(value = "/article/{id}", method = PUT, produces = "application/json")
    @PutMapping("/article/{id}")
    public AjaxResponse updateArticle(@PathVariable Long id, @RequestBody ArticleVo article) {
        article.setId(id);

//        log.info("updateArticle：{}",article);
        articleRestService.uodateArticle(article);
        return AjaxResponse.success(article);
    }
 
//    @RequestMapping(value = "/article/{id}", method = GET, produces = "application/json")
    @GetMapping("/article/{id}")
    public AjaxResponse getArticle(@PathVariable Long id) {

//        ArticleVo article1 = ArticleVo.builder().id(1L).author("zimug").content("spring boot 2.深入浅出").title("t1").build();

        return AjaxResponse.success(articleRestService.getArticle(id));
    }

    //    @RequestMapping(value = "/article/{id}", method = GET, produces = "application/json")
    @GetMapping("/article")
    public AjaxResponse getAll() {

//        ArticleVo article1 = ArticleVo.builder().id(1L).author("zimug").content("spring boot 2.深入浅出").title("t1").build();

        return AjaxResponse.success(articleRestService.getAll());
    }
}