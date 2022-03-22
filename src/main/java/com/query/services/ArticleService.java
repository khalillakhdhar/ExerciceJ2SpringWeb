package com.query.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.query.model.Article;
import com.query.model.ArticleRepository;

@Service
public class ArticleService {

	@Autowired
	ArticleRepository articleRepo;
	
	public List<Article> showAll()
	{
		return articleRepo.findAll();
	}
	
	public Article saveArticle(Article article)
	{
		return articleRepo.save(article);
	}
	public void deleteArticle(int id)
	{
		articleRepo.deleteById(id);
		
	}
	public List<Article> filtreAuteur(String auteur)
	{
		return articleRepo.findByAuteur(auteur);
	}
	public List<Article> filtreResume(String resume)
	{
		return articleRepo.findByResumeContaining(resume);
	}
	
	public List<Article> filtrePublication()
	{
		return articleRepo.findByPublicationTrue();
	}
	public List<Article> searchJava()
	{
		return articleRepo.findJava();
	}
}
