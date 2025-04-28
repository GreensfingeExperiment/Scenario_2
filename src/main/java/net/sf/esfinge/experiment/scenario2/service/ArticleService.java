package net.sf.esfinge.experiment.scenario2.service;

import net.sf.esfinge.experiment.scenario2.entity.Article;
import net.sf.esfinge.experiment.scenario2.repository.ArticleRepository;

import java.util.List;

public class ArticleService {

    private final ArticleRepository repository = new ArticleRepository();

    public void findArticles(List<Article> param) {
        repository.findArticle(param);
    }
}
