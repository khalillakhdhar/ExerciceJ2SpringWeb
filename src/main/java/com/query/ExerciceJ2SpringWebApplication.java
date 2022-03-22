package com.query;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.query.model.Article;
import com.query.services.ArticleService;

@SpringBootApplication
public class ExerciceJ2SpringWebApplication implements CommandLineRunner {
@Autowired
ArticleService articleService;

	public static void main(String[] args) {
		SpringApplication.run(ExerciceJ2SpringWebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		articleService.saveArticle(new Article("12/1/2021", "Kim jung", false, "l'art de programmation java","programmation"));
		articleService.saveArticle(new Article("10/11/2020", "mark zukerburg", true, "marketing digitale et programmation web","E-learning"));
		articleService.saveArticle(new Article("14/4/2019", "pivotal team", true, "java les bases et les premier pas ","programmation"));
		List<Article> publishedList=articleService.filtrePublication();
		showList(publishedList);
		System.out.println("liste des article de pivotal team");
		List<Article> ListAuthor=articleService.filtreAuteur("pivotal team");
		showList(ListAuthor);
		System.out.println("Article parlant de JAVA");
		List<Article> ListJava=articleService.searchJava();
		showList(ListJava);
	}
public void showList(List<Article> articles)
{
	articles.forEach(System.out::println);
	}
}
