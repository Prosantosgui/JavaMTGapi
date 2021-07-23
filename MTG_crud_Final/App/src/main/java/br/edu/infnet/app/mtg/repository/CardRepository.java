package br.edu.infnet.app.mtg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.app.mtg.entity.CardSimples;

@Repository
public interface CardRepository extends JpaRepository<CardSimples, Long>{
    
}
