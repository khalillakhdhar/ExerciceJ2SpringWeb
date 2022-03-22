package com.query;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.query.model.Article;
import com.query.model.Cas;
import com.query.model.CasRepository;
import com.query.services.ArticleService;

@SpringBootApplication
public class ExerciceJ2SpringWebApplication implements CommandLineRunner {
@Autowired
ArticleService articleService;
@Autowired
CasRepository cases;

	public static void main(String[] args) {
		SpringApplication.run(ExerciceJ2SpringWebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		cases.save(new Cas("teste1", "20999888", "New york USA", 1, 22));
//		cases.save(new Cas("GWB", "22994455", "Toronto Canada", -1, 01));
//		cases.save(new Cas("Ali express", "02994455", "Atalanta USA", -1, 22));
//		List<Cas> covids=cases.findEveryone();
//		System.out.println("la liste des cas trié par nom");
//		showListCas(covids);
//		List<Cas> selected=cases.findByAdresseContaining("USA");
//		System.out.println("liste des cas aux état unis");
//		showListCas(selected);
//		List<Cas> testPos=cases.filtreCas();
//		System.out.println("---la liste des cas positifs!---");
//		showListCas(testPos);
//		List<Cas> CasparRegion=cases.findByEtatAndCodePostale(1, 22);
//		System.out.println("liste des cas + dans le 22");
//		showListCas(CasparRegion);
//		
		// TODO Auto-generated method stub
		articleService.saveArticle(new Article("12/1/2021", "Kim jung", false, "l'art de programmation java","programmation"));
		articleService.saveArticle(new Article("10/11/2020", "mark zukerburg", true, "marketing digitale et programmation web","E-learning"));
		articleService.saveArticle(new Article("14/4/2019", "pivotal team", true, "java les bases et les premier pas ","programmation"));
//		List<Article> publishedList=articleService.filtrePublication();
//		showList(publishedList);
//		System.out.println("liste des article de pivotal team");
//		List<Article> ListAuthor=articleService.filtreAuteur("pivotal team");
//		showList(ListAuthor);
//		System.out.println("Article parlant de JAVA");
//		List<Article> ListJava=articleService.searchJava();
//		showList(ListJava);
	}
public void showListArticle(List<Article> articles)
{
	articles.forEach(System.out::println);
	}
public void showListCas(List<Cas> covidcases)
{
	covidcases.forEach(System.out::println);
	}
}
