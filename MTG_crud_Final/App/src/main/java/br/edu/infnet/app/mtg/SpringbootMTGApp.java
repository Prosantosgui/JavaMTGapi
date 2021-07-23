package br.edu.infnet.app.mtg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import br.edu.infnet.app.mtg.controller.RestClient;
import br.edu.infnet.app.mtg.service.DeckService;

@SpringBootApplication
public class SpringbootMTGApp implements CommandLineRunner { 

	@Autowired
	DeckService deckService;

	@Autowired
	RestClient restClient;

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder){
		return builder.build();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMTGApp.class, args);
	}

	private Logger logger = LoggerFactory.getLogger(this.getClass()); //to send output to the log (the console)


	@Override
	public void run(String... args) throws Exception {

		System.out.println("*");
		logger.info("\nAll decks in database: {}", deckService.getAllDecks());
		System.out.println("*");

	}

}
