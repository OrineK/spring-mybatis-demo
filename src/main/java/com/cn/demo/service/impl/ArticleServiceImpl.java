package com.cn.demo.service.impl;

import com.cn.demo.dao.ArticleMapper;
import com.cn.demo.model.Article;
import com.cn.demo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Orine
 * @Date: 2018/10/25
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public int save(Article article) {
        return articleMapper.insert(article);
    }

    @Override
    public Article findOneById(Integer id) {
        return articleMapper.selectByPrimaryKey(id);
    }
}
