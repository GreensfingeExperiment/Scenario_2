package net.sf.esfinge.experiment.scenario1;

import net.sf.esfinge.experiment.scenario1.controller.ArticleController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ArticleControllerTest {

    private final ArticleController articleController = new ArticleController();
    private static final String RECOMMENDATION = "This article has been viewed 542 times.";

    @Test
    void testFindQtyArticleView() {
        String recommendation = articleController.findQtyArticleView();

        assertEquals(RECOMMENDATION, recommendation);
    }

    @Test
    void testFindQtyArticleWithDifferentQtyViews() {
        articleController.setToggle(true);

        String recommendation = articleController.findQtyArticleView();

        assertNotEquals(RECOMMENDATION, recommendation);
    }

}
