package com.wang.blog.controller;

import com.wang.blog.feign.vo.Article;
import com.wang.blog.feign.ArticleFeign;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author wangxiang
 * @since 2021/3/31 17:41
 */
@RestController
@RequestMapping("/facade/article")
@Slf4j
public class ArticleController {

    @Resource
    private RestTemplate template;

    @Resource
    private ArticleFeign articleFeign;

    @GetMapping("/info")
    public Article get() {
        return template.postForObject("http://ARTICLE/article/info", null, Article.class);
    }

    @GetMapping("/info2")
    public Article get2() {
        log.info("开始调用外部资源");
        return articleFeign.get();
    }
}
