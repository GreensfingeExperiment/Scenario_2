# 📰 Article View Counter – Greensfinge Experiment

This project simulates a simplified article view counter, commonly used in blogs or content platforms. It is part of an experiment designed to demonstrate how energy-saving strategies can be integrated into Java applications **without** using the **Greensfinge Framework**.

## 📦 Project Structure

The project follows the standard layered architecture with separate packages for service, entity and repository.

## ✅ Description

- `entity.Article`: Contains the business entity class.
- `service.ArticleService`: Contains the business logic to format the article view message.
- `repository.ArticleRepository`: Simulates a database to search the values.

### ❓ Remember the Task
How can we prevent the view counter from being executed without altering the actual counting logic ? In this case, the quantity of views is optional

---

## 🧪 Unit Tests

The test class `ArticleServiceTest` validates the behavior of the view counter logic.

In this task, you will see something like this, and the goal is to make all tests pass successfully.

![img.png](img.png)