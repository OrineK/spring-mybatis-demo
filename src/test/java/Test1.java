import com.cn.demo.model.Article;
import com.cn.demo.service.ArticleService;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * @Author: Orine
 * @Date: 2018/10/25
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-mybatis.xml"})
public class Test1 {

    private static final Logger LOGGER = Logger.getLogger(Test1.class);

    @Autowired
    private ArticleService articleService;

    @Before
    public void save() {
        Article article = new Article();
        article.setTitle("c");
        article.setContent("ccc");
        article.setCreateTime(new Date());
        int i = articleService.save(article);
        LOGGER.info(i);
    }

    @Test
    public void findArticle() {
        LOGGER.info(articleService.findOneById(1).toString());
    }
}
