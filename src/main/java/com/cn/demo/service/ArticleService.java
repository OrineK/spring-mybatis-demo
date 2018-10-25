package com.cn.demo.service;

import com.cn.demo.model.Article;

/**
 * @Author: Orine
 * @Date: 2018/10/25
 */
public interface ArticleService {

    public int save(Article article);

    public Article findOneById(Integer id);
}
