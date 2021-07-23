package br.edu.infnet.app.mtg.entity.entityAPI;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"name",
"manaCost",
"cmc",
"colors",
"colorIdentity",
"type",
"types",
"subtypes",
"rarity",
"set",
"setName",
"text",
"artist",
"number",
"power",
"toughness",
"layout",
"multiverseid",
"imageUrl",
"variations",
"foreignNames",
"printings",
"originalText",
"originalType",
"legalities",
"id",
"flavor"
})
@Generated("jsonschema2pojo")
public class Card {

    @JsonProperty("name")
    private String name;
    @JsonProperty("manaCost")
    private String manaCost;
    @JsonProperty("cmc")
    private Double cmc;
    @JsonProperty("colors")
    private List<String> colors = null;
    @JsonProperty("colorIdentity")
    private List<String> colorIdentity = null;
    @JsonProperty("type")
    private String type;
    @JsonProperty("types")
    private List<String> types = null;
    @JsonProperty("subtypes")
    private List<String> subtypes = null;
    @JsonProperty("rarity")
    private String rarity;
    @JsonProperty("set")
    private String set;
    @JsonProperty("setName")
    private String setName;
    @JsonProperty("text")
    private String text;
    @JsonProperty("artist")
    private String artist;
    @JsonProperty("number")
    private String number;
    @JsonProperty("power")
    private String power;
    @JsonProperty("toughness")
    private String toughness;
    @JsonProperty("layout")
    private String layout;
    @JsonProperty("multiverseid")
    private String multiverseid;
    @JsonProperty("imageUrl")
    private String imageUrl;
    @JsonProperty("variations")
    private List<String> variations = null;
    @JsonProperty("foreignNames")
    private List<ForeignName> foreignNames = null;
    @JsonProperty("printings")
    private List<String> printings = null;
    @JsonProperty("originalText")
    private String originalText;
    @JsonProperty("originalType")
    private String originalType;
    @JsonProperty("legalities")
    private List<Legality> legalities = null;
    @JsonProperty("id")
    private String id;
    @JsonProperty("flavor")
    private String flavor;
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

    @JsonProperty("manaCost")
    public String getManaCost() {
    return manaCost;
    }

    @JsonProperty("manaCost")
    public void setManaCost(String manaCost) {
    this.manaCost = manaCost;
    }

    @JsonProperty("cmc")
    public Double getCmc() {
    return cmc;
    }

    @JsonProperty("cmc")
    public void setCmc(Double cmc) {
    this.cmc = cmc;
    }

    @JsonProperty("colors")
    public List<String> getColors() {
    return colors;
    }

    @JsonProperty("colors")
    public void setColors(List<String> colors) {
    this.colors = colors;
    }

    @JsonProperty("colorIdentity")
    public List<String> getColorIdentity() {
    return colorIdentity;
    }

    @JsonProperty("colorIdentity")
    public void setColorIdentity(List<String> colorIdentity) {
    this.colorIdentity = colorIdentity;
    }

    @JsonProperty("type")
    public String getType() {
    return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
    this.type = type;
    }

    @JsonProperty("types")
    public List<String> getTypes() {
    return types;
    }

    @JsonProperty("types")
    public void setTypes(List<String> types) {
    this.types = types;
    }

    @JsonProperty("subtypes")
    public List<String> getSubtypes() {
    return subtypes;
    }

    @JsonProperty("subtypes")
    public void setSubtypes(List<String> subtypes) {
    this.subtypes = subtypes;
    }

    @JsonProperty("rarity")
    public String getRarity() {
    return rarity;
    }

    @JsonProperty("rarity")
    public void setRarity(String rarity) {
    this.rarity = rarity;
    }

    @JsonProperty("set")
    public String getSet() {
    return set;
    }

    @JsonProperty("set")
    public void setSet(String set) {
    this.set = set;
    }

    @JsonProperty("setName")
    public String getSetName() {
    return setName;
    }

    @JsonProperty("setName")
    public void setSetName(String setName) {
    this.setName = setName;
    }

    @JsonProperty("text")
    public String getText() {
    return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
    this.text = text;
    }

    @JsonProperty("artist")
    public String getArtist() {
    return artist;
    }

    @JsonProperty("artist")
    public void setArtist(String artist) {
    this.artist = artist;
    }

    @JsonProperty("number")
    public String getNumber() {
    return number;
    }

    @JsonProperty("number")
    public void setNumber(String number) {
    this.number = number;
    }

    @JsonProperty("power")
    public String getPower() {
    return power;
    }

    @JsonProperty("power")
    public void setPower(String power) {
    this.power = power;
    }

    @JsonProperty("toughness")
    public String getToughness() {
    return toughness;
    }

    @JsonProperty("toughness")
    public void setToughness(String toughness) {
    this.toughness = toughness;
    }

    @JsonProperty("layout")
    public String getLayout() {
    return layout;
    }

    @JsonProperty("layout")
    public void setLayout(String layout) {
    this.layout = layout;
    }

    @JsonProperty("multiverseid")
    public String getMultiverseid() {
    return multiverseid;
    }

    @JsonProperty("multiverseid")
    public void setMultiverseid(String multiverseid) {
    this.multiverseid = multiverseid;
    }

    @JsonProperty("imageUrl")
    public String getImageUrl() {
    return imageUrl;
    }

    @JsonProperty("imageUrl")
    public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    }

    @JsonProperty("variations")
    public List<String> getVariations() {
    return variations;
    }

    @JsonProperty("variations")
    public void setVariations(List<String> variations) {
    this.variations = variations;
    }

    @JsonProperty("foreignNames")
    public List<ForeignName> getForeignNames() {
    return foreignNames;
    }

    @JsonProperty("foreignNames")
    public void setForeignNames(List<ForeignName> foreignNames) {
    this.foreignNames = foreignNames;
    }

    @JsonProperty("printings")
    public List<String> getPrintings() {
    return printings;
    }

    @JsonProperty("printings")
    public void setPrintings(List<String> printings) {
    this.printings = printings;
    }

    @JsonProperty("originalText")
    public String getOriginalText() {
    return originalText;
    }

    @JsonProperty("originalText")
    public void setOriginalText(String originalText) {
    this.originalText = originalText;
    }

    @JsonProperty("originalType")
    public String getOriginalType() {
    return originalType;
    }

    @JsonProperty("originalType")
    public void setOriginalType(String originalType) {
    this.originalType = originalType;
    }

    @JsonProperty("legalities")
    public List<Legality> getLegalities() {
    return legalities;
    }

    @JsonProperty("legalities")
    public void setLegalities(List<Legality> legalities) {
    this.legalities = legalities;
    }

    @JsonProperty("id")
    public String getId() {
    return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
    this.id = id;
    }

    @JsonProperty("flavor")
    public String getFlavor() {
    return flavor;
    }

    @JsonProperty("flavor")
    public void setFlavor(String flavor) {
    this.flavor = flavor;
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