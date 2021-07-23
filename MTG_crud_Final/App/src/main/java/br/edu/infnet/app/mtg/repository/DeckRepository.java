package br.edu.infnet.app.mtg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.edu.infnet.app.mtg.entity.Deck;

@Repository
public interface DeckRepository extends JpaRepository<Deck , Long>{
    
}
