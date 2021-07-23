package br.edu.infnet.app.mtg.service;

import java.util.List;

import br.edu.infnet.app.mtg.entity.Deck;

public interface DeckService {

    public List<Deck> getAllDecks();
    
    public Deck getDeckById(Long id);

    public Deck createDeck(Deck deck);
    
    public Deck updateDeck(Deck deck);
    
    public void deleteDeck(Long id);

}
