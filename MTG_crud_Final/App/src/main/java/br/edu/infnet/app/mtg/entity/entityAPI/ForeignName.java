package br.edu.infnet.app.mtg.entity.entityAPI;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"name",
"text",
"type",
"flavor",
"imageUrl",
"language",
"multiverseid"
})
@Generated("jsonschema2pojo")
public class ForeignName {

    @JsonProperty("name")
    private String name;
    @JsonProperty("text")
    private String text;
    @JsonProperty("type")
    private String type;
    @JsonProperty("flavor")
    private String flavor;
    @JsonProperty("imageUrl")
    private String imageUrl;
    @JsonProperty("language")
    private String language;
    @JsonProperty("multiverseid")
    private Integer multiverseid;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
    return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
    this.name = name;
    }

    /**
    * No args constructor for use in serialization
    *
    */
    public ForeignName() {
    }

    /**
    *
    * @param flavor
    * @param multiverseid
    * @param imageUrl
    * @param name
    * @param language
    * @param text
    * @param type
    */
    public ForeignName(String name, String text, String type, String flavor, String imageUrl, String language, Integer multiverseid) {
    super();
    this.name = name;
    this.text = text;
    this.type = type;
    this.flavor = flavor;
    this.imageUrl = imageUrl;
    this.language = language;
    this.multiverseid = multiverseid;
    }

    @JsonProperty("text")
    public String getText() {
    return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
    this.text = text;
    }

    @JsonProperty("type")
    public String getType() {
    return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
    this.type = type;
    }

    @JsonProperty("flavor")
    public String getFlavor() {
    return flavor;
    }

    @JsonProperty("flavor")
    public void setFlavor(String flavor) {
    this.flavor = flavor;
    }

    @JsonProperty("imageUrl")
    public String getImageUrl() {
    return imageUrl;
    }

    @JsonProperty("imageUrl")
    public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    }

    @JsonProperty("language")
    public String getLanguage() {
    return language;
    }

    @JsonProperty("language")
    public void setLanguage(String language) {
    this.language = language;
    }

    @JsonProperty("multiverseid")
    public Integer getMultiverseid() {
    return multiverseid;
    }

    @JsonProperty("multiverseid")
    public void setMultiverseid(Integer multiverseid) {
    this.multiverseid = multiverseid;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
    }

}
