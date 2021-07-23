package br.edu.infnet.app.mtg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.app.mtg.entity.Deck;
import br.edu.infnet.app.mtg.repository.DeckRepository;

@Service
public class DeckServiceImpl implements DeckService{

    @Autowired
    DeckRepository deckRepository;

    @Override
    public List<Deck> getAllDecks(){
        return deckRepository.findAll();
    }

    @Override
    public Deck getDeckById(Long id){
        return deckRepository.getById(id);
    }

    @Override
    public Deck createDeck(Deck deck){
        return deckRepository.save(deck);
    }
    
    @Override
    public Deck updateDeck(Deck deck){
        return deckRepository.saveAndFlush(deck);
    }

    @Override
    public void deleteDeck(Long id){
        deckRepository.deleteById(id);
    }

}
