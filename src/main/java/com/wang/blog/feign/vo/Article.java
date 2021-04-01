package com.wang.blog.feign.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wangxiang
 * @since 2021/3/31 17:40
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Article {
    private long id;
    private String name;
}
