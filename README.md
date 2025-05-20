# 📰 Article View Counter – Greensfinge Experiment

This project simulates a simplified article view counter, commonly used in blogs or content platforms. It is part of an experiment designed to demonstrate how energy-saving strategies can be integrated into Java applications **without** using the **Greensfinge Framework**.

## 📦 Project Structure

The project follows the standard layered architecture with separate packages for service, entity and repository.

## ✅ Description

- `entity.Article`: Contains the business entity class.
- `service.ArticleService`: Contains the business logic to format the article view message.
- `repository.ArticleRepository`: Simulates a database to search the values.

### ❓ Task

In the ArticleService class, the testFindArticleView() method searches for an article, a product, and the number of views. Currently, this method also returns the number of pages. To save energy when the user does not need the page count, you should implement functionality to make this optional.

To implement this functionality, when the new method saveConsumptionEnergy() is called with the parameter "true", the number of pages should be disabled. The method saveConsumptionEnergy() is empty and you need to implement it as part of your task.

---

## 🧪 Unit Tests

The test class `ArticleServiceTest` validates the behavior of the view counter logic.

When you open the project, to make sure that everything is correctly configured, you need to run the tests and teh result should be the one in teh pecture: on test will pass and the other not. When you make all tests pass successfully, your task is complete.

> `IMPORTANT: You cannot change the test code!`

![img.png](img.png)