package com.wang.blog.feign;

import com.wang.blog.feign.vo.Article;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author wangxiang
 * @since 2021/4/1 15:10
 */
@FeignClient(value = "article")
public interface ArticleFeign {
    @GetMapping("/article/info")
    Article get();
}
