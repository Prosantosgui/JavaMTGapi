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
"format",
"legality"
})
@Generated("jsonschema2pojo")
public class Legality {

    public Legality(String format, String legality, Map<String, Object> additionalProperties) {
        this.format = format;
        this.legality = legality;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("format")
    private String format;
    @JsonProperty("legality")
    private String legality;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
    * No args constructor for use in serialization
    *
    */
    public Legality() {
    }

    /**
    *
    * @param legality
    * @param format
    */
    public Legality(String format, String legality) {
    super();
    this.format = format;
    this.legality = legality;
    }

    @JsonProperty("format")
    public String getFormat() {
    return format;
    }

    @JsonProperty("format")
    public void setFormat(String format) {
    this.format = format;
    }

    @JsonProperty("legality")
    public String getLegality() {
    return legality;
    }

    @JsonProperty("legality")
    public void setLegality(String legality) {
    this.legality = legality;
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
