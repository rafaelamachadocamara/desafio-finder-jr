package com.desafiofinderjr.desafioFinderUp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafiofinderjr.desafioFinderUp.model.Produtos;

@Repository
public interface ProdutosRepository extends JpaRepository<Produtos, Long> {

}
