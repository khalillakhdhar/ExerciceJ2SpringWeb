package com.query.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ArticleRepository extends JpaRepository<Article, Integer> {
// requête dérivé (derived queries)
List<Article> findByAuteur(String auteur);
List<Article> findByResumeContaining(String content);
List<Article> findByTypeOrAuteur(String type,String auteur);
List<Article> findByPublicationTrue();
// jpql query
@Query("Select a From Article a WHERE a.resume LIKE '%java%'")
List<Article> findJava();
}
