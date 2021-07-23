/*
@Controller (é um @Component)
    Um Controller é responsável tanto por receber requisições como por enviar 
    a resposta ao usuário, algo bem parecido com o Servlet do JSP. Porém, é feito 
    de forma mais elegante e fácil. O Controller se responsabiliza por informar 
    a View, os atributos que serão visíveis para a mesma e também por receber 
    parâmetros vindos da View. E, por último, responder ao usuário o que foi requisitado.
@RestController
    Spring 4.0 introduced the @RestController annotation in order to simplify 
    the creation of RESTful web services. It's a convenient annotation that combines 
    @Controller and @ResponseBody, which eliminates the need to annotate every request 
    handling method of the controller class with the @ResponseBody annotation.
*/
package br.edu.infnet.app.mtg.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.edu.infnet.app.mtg.entity.*;
import br.edu.infnet.app.mtg.service.DeckService;
import br.edu.infnet.app.mtg.exception.ResourceNotFoundException;

import javax.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class DeckAPIController {
    
            //JOGAR AS IMPLEMENTACOES DOS MÉTODOS DO CONTROLLER PARA O SERVICE

    @Autowired
    private DeckService deckService;

    @GetMapping("/api/decks")
    public List<Deck> getAllDecks(){
        return deckService.getAllDecks();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Deck> getDeckById(@PathVariable(value = "id") Long id) throws ResourceNotFoundException{
        Deck deck =  deckService.getDeckById(id);
        return ResponseEntity.ok().body(deck);
    }

    // @GetMapping("/api/decks/{id}")
    // public Deck getDeckById(@PathVariable(value = "id") Long id) throws ResourceNotFoundException{
    //     return deckService.getDeckById(id);
    // }

    @PostMapping("/api/decks")
    public Deck createDeck(@Valid @RequestBody Deck deck) {
        return deckService.createDeck(deck);
    }

    @PutMapping("/api/decks/{id}")
    public ResponseEntity<Deck> updateDeck(@PathVariable(value = "id") Long id, @Valid @RequestBody Deck deckInfo) throws ResourceNotFoundException{
        Deck deck =  deckService.getDeckById(id); //.orElseThrow tbm
        deck.setName(deckInfo.getName());
        deck.setCreator(deckInfo.getCreator());
        deck.setDescription(deckInfo.getDescription());

        final Deck updatedDeck = deckService.updateDeck(deck);

        return ResponseEntity.ok(updatedDeck);
    }

    //DELETE A DECK BY ID
    @DeleteMapping("/api/decks/{id}")
    public Map<String, Boolean> deleteDeck(@PathVariable(value = "id") Long id) throws ResourceNotFoundException {
        //Deck deleteDeck =  deckService.getDeckById(id); //.orElseThrow tbm
        deckService.deleteDeck(id);
        Map<String, Boolean> response = new HashMap<>();
        response.put("Deleted deck id: "+id,Boolean.TRUE);

        return response;
        
    }
    
}
