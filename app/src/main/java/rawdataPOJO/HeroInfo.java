
package rawdataPOJO;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
        "stats",
        "scaling",
    "lore"
})
public class HeroInfo {

    @JsonProperty("name")
    private String name;
    @JsonProperty("stats")
    private Stats stats;
    @JsonProperty("scaling")
    private Scaling scaling;
    @JsonProperty("lore")
    private List<String> lore = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("stats")
    public Stats getStats() {
        return stats;
    }

    @JsonProperty("stats")
    public void setStats(Stats stats) {
        this.stats = stats;
    }

    @JsonProperty("scaling")
    public Scaling getScaling() {
        return scaling;
    }

    @JsonProperty("scaling")
    public void setScaling(Scaling scaling) {
        this.scaling = scaling;
    }

    @JsonProperty("lore")
    public List<String> getLore() {
        return lore;
    }

    @JsonProperty("lore")
    public void setLore(List<String> lore) {
        this.lore = lore;
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
