package cardPOJO;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "medium_stats",
        "large",
        "large_stats",
        "icon",
        "medium"
})
public class Images {

    private String medium_stats;
    /**
     *
     * @return
     *     The medium_stats
     */
    @JsonProperty("medium_stats")
    public String getMedium_stats() {
        return medium_stats;
    }

    /**
     *
     * @param medium_stats
     *     The medium_stats
     */
    @JsonProperty("medium_stats")
    public void setMedium_stats(String medium_stats) {
        this.medium_stats = medium_stats;
    }

    private String large;
    /**
     *
     * @return
     *     The large
     */
    @JsonProperty("large")
    public String getLarge() {
        return large;
    }

    /**
     *
     * @param large
     *     The large
     */
    @JsonProperty("large")
    public void setLarge(String large) {
        this.large = large;
    }

    private String large_stats;
    /**
     *
     * @return
     *     The large_stats
     */
    @JsonProperty("large_stats")
    public String getLarge_stats() {
        return large_stats;
    }

    /**
     *
     * @param large_stats
     *     The large_stats
     */
    @JsonProperty("large_stats")
    public void setLarge_stats(String large_stats) {
        this.large_stats = large_stats;
    }

    private String icon;
    /**
     *
     * @return
     *     The icon
     */
    @JsonProperty("icon")
    public String getIcon() {
        return icon;
    }

    /**
     *
     * @param icon
     *     The icon
     */
    @JsonProperty("icon")
    public void setIcon(String icon) {
        this.icon = icon;
    }

    private String medium;
    /**
     *
     * @return
     *     The medium
     */
    @JsonProperty("medium")
    public String getMedium() {
        return medium;
    }

    /**
     *
     * @param medium
     *     The medium
     */
    @JsonProperty("medium")
    public void setMedium(String medium) {
        this.medium = medium;
    }

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
