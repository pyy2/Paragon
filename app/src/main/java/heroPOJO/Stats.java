
package heroPOJO;

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
    "Mobility",
    "basicattack",
    "durability",
    "abilityattack"
})
public class Stats {
    private Integer mobility;
    /**
     *
     * @return
     *     The mobility
     */
    @JsonProperty("Mobility")
    public Integer getMobility() {
        return mobility;
    }

    /**
     *
     * @param mobility
     *     The mobility
     */
    @JsonProperty("Mobility")
    public void setMobility(Integer mobility) {
        this.mobility = mobility;
    }

    private Integer basicattack;
    /**
     *
     * @return
     *     The basicattack
     */
    @JsonProperty("BasicAttack")
    public Integer getBasicAttack() {
        return basicattack;
    }

    /**
     *
     * @param basicattack
     *     The basicattack
     */
    @JsonProperty("BasicAttack")
    public void setBasicAttack(Integer basicattack) {
        this.basicattack = basicattack;
    }

    private Integer durability;
    /**
     *
     * @return
     *     The durability
     */
    @JsonProperty("Durability")
    public Integer getDurability() {
        return durability;
    }

    /**
     *
     * @param durability
     *     The durability
     */
    @JsonProperty("Durability")
    public void setDurability(Integer durability) {
        this.durability = durability;
    }

    private Integer abilityattack;
    /**
     *
     * @return
     *     The abilityattack
     */
    @JsonProperty("AbilityATtack")
    public Integer getAbilityAttack() {
        return abilityattack;
    }

    /**
     *
     * @param abilityattack
     *     The abilityattack
     */
    @JsonProperty("AbilityAttack")
    public void setAbilityAttack(Integer abilityattack) {
        this.abilityattack = abilityattack;
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
