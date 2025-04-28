package net.sf.esfinge.experiment.scenario2;

import net.sf.esfinge.experiment.scenario2.entity.Article;
import net.sf.esfinge.experiment.scenario2.service.ArticleService;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArticleServiceTest {

    private final ArticleService articleService = new ArticleService();

    @Test
    void testFindQtyArticleView() {
        List<Article> articles = new ArrayList<>();
        articleService.findArticles(articles);

        assertEquals(1, articles.size());
        assertEquals("Como fazer um bolo simples", articles.get(0).getName());
        assertEquals(45, articles.get(0).getView());
    }

    @Test
    void testFindQtyArticleUsingToggle() {
        List<Article> articles = new ArrayList<>();
        articleService.findArticles(articles);

        assertEquals(0, articles.size());
    }

}
