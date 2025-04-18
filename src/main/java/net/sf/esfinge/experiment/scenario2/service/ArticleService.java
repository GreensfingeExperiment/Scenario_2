package net.sf.esfinge.experiment.scenario2.service;

import net.sf.esfinge.experiment.scenario2.entity.Article;

import java.util.List;

public class ArticleService {

    private boolean toggle;

    public void findArticles(List<Article> param) {
        //USE the toggle logic
        param.add(new Article(50, "Article1"));
        param.add(new Article(53, "Article2"));
        param.add(new Article(2, "Article3"));
    }

    public void setToggle(boolean toggle) {
        this.toggle = toggle;
    }
}
