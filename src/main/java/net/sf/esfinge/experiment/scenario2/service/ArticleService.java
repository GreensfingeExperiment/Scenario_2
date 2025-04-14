package net.sf.esfinge.experiment.scenario2.service;

import net.sf.esfinge.experiment.scenario2.repository.ArticleRepository;

public class ArticleService {

    private final ArticleRepository repository = new ArticleRepository();
    private boolean toggle;

    public String findQtyArticleView() {
        Integer views = repository.findQtyViews();

        //USE the toggle logic

        return String.format("This article has been viewed %d times.", views);
    }

    public void setToggle(boolean toggle){
        this.toggle = toggle;
    }
}
