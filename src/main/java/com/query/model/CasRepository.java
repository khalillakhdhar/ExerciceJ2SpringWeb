package com.query.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CasRepository extends JpaRepository<Cas, Integer> {
@Query("Select c FROM Cas c Order by c.nomComplet")
List<Cas> findEveryone(); // @Query => la méthode annoté = résultat de la requête au dessus
List<Cas> findByAdresseContaining(String adressContent);
@Query("Select c From Cas c WHERE etat LIKE 1")
List<Cas> filtreCas();
List<Cas> findByEtatAndCodePostale(int etat,int code);

}
