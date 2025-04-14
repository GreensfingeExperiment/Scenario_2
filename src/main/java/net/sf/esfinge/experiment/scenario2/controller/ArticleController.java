package net.sf.esfinge.experiment.scenario2.controller;

import net.sf.esfinge.experiment.scenario2.service.ArticleService;

public class ArticleController {

    private final ArticleService service = new ArticleService();

    public String findQtyArticleView() {
        return service.findQtyArticleView();
    }

    public void setToggle(boolean toggle) {
        service.setToggle(toggle);
    }
}
