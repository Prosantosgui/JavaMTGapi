package br.edu.infnet.app.mtg.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import br.edu.infnet.app.mtg.entity.Deck;
import br.edu.infnet.app.mtg.entity.entityAPI.Cards;
import br.edu.infnet.app.mtg.entity.entityAPI.Card;

@RestController
public class RestClient {

    @Autowired
    RestTemplate restTemplate;

    public RestClient() {}
     
    public List<Deck> callAPIGetAllDecks() throws JsonParseException, JsonMappingException, IOException {

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        HttpEntity<String> entity = new HttpEntity<String>(httpHeaders);
        ResponseEntity<String> response1 = restTemplate.exchange("http://localhost:8080/api/decks", HttpMethod.GET, entity, String.class);

        ObjectMapper mapper = new ObjectMapper();
        List<Deck> listaDecks = mapper.readValue(response1.getBody(), new TypeReference<List<Deck>>(){});

		return listaDecks;

    }
   
    public List<Card> MTGAPICallout() throws JsonParseException, JsonMappingException, IOException{
        
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        
        HttpEntity<String> entity = new HttpEntity<String>(httpHeaders);
        
        ResponseEntity<String> response1 = (restTemplate.exchange("https://api.magicthegathering.io/v1/cards", HttpMethod.GET, entity, String.class));
        
        ObjectMapper mapper = new ObjectMapper();
        Cards result = mapper.readValue(response1.getBody(), new TypeReference<Cards>(){});
        List<Card> result2 = result.getCards(); 
        
        return result2;
    }

    public Deck callGetDeckByIdAPI(Long id) throws JsonParseException, JsonMappingException, IOException {
        System.out.println("--- Entrou callout byId");
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        
        HttpEntity<String> entity = new HttpEntity<String>(httpHeaders);
        ResponseEntity<Deck> response1 = restTemplate.exchange("http://localhost:8080/api/decks/"+id, HttpMethod.GET, entity, Deck.class);

        return response1.getBody();

    }


}
