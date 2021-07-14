package com.desafiofinderjr.desafioFinderUp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafiofinderjr.desafioFinderUp.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
