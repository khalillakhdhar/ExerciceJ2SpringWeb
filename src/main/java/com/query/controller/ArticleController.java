package com.query.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.query.model.Article;
import com.query.services.ArticleService;

@RestController
@RequestMapping("article")
public class ArticleController {
@Autowired
ArticleService articleapi;
@GetMapping
public List<Article> showAll()
{
return articleapi.showAll();	
}
@GetMapping("/{auteur}")
public List<Article> findauthors(@PathVariable String auteur)
{
	return articleapi.filtreAuteur(auteur);
}
@GetMapping("/{type}/{author}")
public List<Article> findbyfilters(@PathVariable String type, String author)
{
return articleapi.filtertypeorauth(type, author);	
}
@PostMapping
public Article saveOne(@RequestBody @Valid Article article)
{
	return articleapi.saveArticle(article);
}
@DeleteMapping("/{id}")
public void DeleteArticle(@PathVariable int id)
{
articleapi.deleteArticle(id);	
}
	
}
