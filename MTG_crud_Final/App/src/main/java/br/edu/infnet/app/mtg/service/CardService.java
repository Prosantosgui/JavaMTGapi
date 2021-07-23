package br.edu.infnet.app.mtg.service;

import java.util.List;

import br.edu.infnet.app.mtg.entity.CardSimples;

public interface CardService {

    public List<CardSimples> getAllCards();

    public void saveDeck(CardSimples _card);

    public CardSimples getCardById(Long id);
    
    public void deleteCardById(Long id);



}
