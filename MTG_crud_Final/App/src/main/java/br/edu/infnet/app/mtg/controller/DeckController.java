package br.edu.infnet.app.mtg.controller;

import br.edu.infnet.app.mtg.entity.CardSimples;
import br.edu.infnet.app.mtg.entity.Deck;
import br.edu.infnet.app.mtg.entity.entityAPI.Card;
import br.edu.infnet.app.mtg.exception.ResourceNotFoundException;
import br.edu.infnet.app.mtg.service.DeckService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class DeckController {
    
    @Autowired
    private DeckService deckService;

    @Autowired
    private RestClient restClient;

    @GetMapping("/decks")
    public String getAllDecks(Model model) throws JsonParseException, JsonMappingException, IOException {
        model.addAttribute("allDecks", deckService.getAllDecks());
        return "decks";
    }

    @GetMapping("/decks/{id}")
    public String getDeckById(@PathVariable(value = "id") Long id, Model model) throws ResourceNotFoundException, JsonParseException, JsonMappingException, IOException{
        model.addAttribute("deck", deckService.getDeckById(id));       
        return "deck";
    }
                  
    @GetMapping("/decks/new")
    public String createDeck(Model model) {
        model.addAttribute("deck", new Deck());
        return "newdeck";
    }
    @PostMapping("/decks/save")
    public String saveDeck(@ModelAttribute("deck") Deck deck) {
        deckService.createDeck(deck);
        return "redirect:/decks";
    }
     
    @GetMapping("/decks/{id}/delete")
	public String deleteDeck(@PathVariable("id") Long id) {
		deckService.deleteDeck(id);
		return "redirect:/decks";
	}
 
    // EDIT                          
    @GetMapping("/decks/{id}/edit")
    public String editDeck(@PathVariable("id") Long id, Model model) {
		Deck deck = deckService.getDeckById(id);
        model.addAttribute("deck", deck);
		return "editdeck";
    }
    @PostMapping("/decks/edit")                             
    public String saveEdit(Deck deck){               
        deckService.updateDeck(deck);
        return "redirect:/decks";
    }

    @GetMapping("decks/{id}/addcard")
    public String addCard(@PathVariable(value = "id") Long id, Model model) throws ResourceNotFoundException, JsonParseException, JsonMappingException, IOException{
        model.addAttribute("deck", deckService.getDeckById(id));
        model.addAttribute("cards", restClient.MTGAPICallout());
        model.addAttribute("cardA", new Card());
        //model.addAttribute("cardSimples", new Card());
        //model.addAttribute("cardAdd", new Card ());
        return "addcard";
    }
    @PostMapping("decks/{id}/addcard")
    public String postCard(@PathVariable("id") Long id, @ModelAttribute("cardA") Card card){
        System.out.println("*");
        System.out.println("****      ADD CARD CONTROLLER     ******");
        System.out.println("*");
        System.out.println("*   CARD: "+card);
        System.out.println("*   CARD NAME: "+card.getName());
        CardSimples c = new CardSimples(card.getName(), card.getImageUrl());
        System.out.println("*   NEW CARD: "+c);
        Deck deck = deckService.getDeckById(id);
        deck.getCards().add(c);
        System.out.println("*   DECK: "+deck);
        deckService.updateDeck(deck);
        System.out.println("*   DECK: "+deck);
        return "redirect:/decks/"+id;
    }
}
