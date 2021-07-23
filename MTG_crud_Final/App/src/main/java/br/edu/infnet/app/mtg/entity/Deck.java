package br.edu.infnet.app.mtg.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "decks")
public class Deck {
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

    @Column(name = "name")
	private String name;

    //o número único identificador de cada carta que vem da api
    // @Column(name="api_id")
    // private String apiId; 

    @Column(name = "creator")
	private String creator;

    @Column(name="description")
    private String description;

    @OneToMany(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "pc_fid", referencedColumnName = "id")
	List<CardSimples> cards = new ArrayList<>();

    public Deck(){

    }

    public Deck(String name, String description) {
        super();
        this.name = name;
        this.description = description;
    }

    public Deck(String name, String creator, String description) {
        this.name = name;
        this.creator = creator;
        this.description = description;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCreator() {
        return creator;
    }
    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public List<CardSimples> getCards() {
        return cards;
    }
    public void setCards(List<CardSimples> cards) {
        this.cards = cards;
    }

    @Override
    public String toString() {
        return "\nDeck id= "+id+": [ name=" + name + ", creator= " + creator + ", description= " + description + ", cards=" + cards + "]";
    }

}
