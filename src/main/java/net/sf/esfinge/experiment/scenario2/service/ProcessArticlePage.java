package net.sf.esfinge.experiment.scenario2.service;

import net.sf.esfinge.experiment.scenario2.entity.Article;

import java.util.List;

public class ProcessArticlePage {

    public void calculateQuantityPages(StringBuilder sb, List<Article> articles) {
        sb.append(" contains ")
            .append(articles.size())
            .append(" pages and");
    }
}
