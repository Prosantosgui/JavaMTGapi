package br.edu.infnet.app.mtg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.app.mtg.entity.CardSimples;
import br.edu.infnet.app.mtg.repository.CardRepository;

@Service
public class CardServiceImpl implements CardService{

    @Autowired
    CardRepository cardRepository;

    @Override
    public List<CardSimples> getAllCards(){
        return cardRepository.findAll();
    }

    @Override
    public void saveDeck(CardSimples card){
        cardRepository.save(card);
    }

    @Override
    public CardSimples getCardById(Long id){
        return cardRepository.getById(id);
    }
    
    @Override
    public void deleteCardById(Long id){
        cardRepository.deleteById(id);
    }
    
}
