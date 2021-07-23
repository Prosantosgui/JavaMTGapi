package br.edu.infnet.app.mtg.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name="cards")
@JsonIgnoreProperties(ignoreUnknown = true)
public class CardSimples {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

    private String name;
    
    private String imageUrl;

    public CardSimples() {

    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public CardSimples(String name, String imageUrl) {
        super();
        this.name = name;
        this.imageUrl = imageUrl;
    }

    public long getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "[id=" + id + ", name=" + name + ", imageUrl=" + imageUrl + "]";
    }
  

}
