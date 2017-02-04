
package cardPOJO;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "description",
    "stat",
    "value",
    "passive",
    "unique",
    "cooldown"
})
public class Effect {

    @JsonProperty("description")
    private String description;
    @JsonProperty("stat")
    private String stat;
    @JsonProperty("value")
    private Integer value;
    @JsonProperty("passive")
    private Boolean passive;
    @JsonProperty("unique")
    private Boolean unique;
    @JsonProperty("cooldown")
    private Integer cooldown;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The stat
     */
    @JsonProperty("stat")
    public String getStat() {
        return stat;
    }

    /**
     * 
     * @param stat
     *     The stat
     */
    @JsonProperty("stat")
    public void setStat(String stat) {
        this.stat = stat;
    }

    /**
     * 
     * @return
     *     The value
     */
    @JsonProperty("value")
    public Integer getValue() {
        return value;
    }

    /**
     * 
     * @param value
     *     The value
     */
    @JsonProperty("value")
    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * 
     * @return
     *     The passive
     */
    @JsonProperty("passive")
    public Boolean getPassive() {
        return passive;
    }

    /**
     * 
     * @param passive
     *     The passive
     */
    @JsonProperty("passive")
    public void setPassive(Boolean passive) {
        this.passive = passive;
    }

    /**
     * 
     * @return
     *     The unique
     */
    @JsonProperty("unique")
    public Boolean getUnique() {
        return unique;
    }

    /**
     * 
     * @param unique
     *     The unique
     */
    @JsonProperty("unique")
    public void setUnique(Boolean unique) {
        this.unique = unique;
    }

    /**
     * 
     * @return
     *     The cooldown
     */
    @JsonProperty("cooldown")
    public Integer getCooldown() {
        return cooldown;
    }

    /**
     * 
     * @param cooldown
     *     The cooldown
     */
    @JsonProperty("cooldown")
    public void setCooldown(Integer cooldown) {
        this.cooldown = cooldown;
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
