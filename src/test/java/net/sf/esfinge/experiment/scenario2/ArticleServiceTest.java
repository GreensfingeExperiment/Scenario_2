package net.sf.esfinge.experiment.scenario2;

import net.sf.esfinge.experiment.scenario2.entity.Article;
import net.sf.esfinge.experiment.scenario2.service.ArticleService;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ArticleServiceTest {

    private final ArticleService articleService = new ArticleService();

    @Test
    void testFindQtyArticleView() {
        List<Article> articles = new ArrayList<>();
        articleService.findArticles(articles);

        assertEquals(3, articles.size());
    }

    @Test
    void testFindQtyArticleUsingToggle() {
        articleService.setToggle(true);

        List<Article> articles = new ArrayList<>();
        articleService.findArticles(articles);

        assertNotEquals(3, articles.size());
    }

}
