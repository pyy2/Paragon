
package RawDataPOJO;

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
    "health",
    "healthRegen",
    "mana",
    "manaRegen",
    "attackSpeed",
    "basicArmor",
    "abilityArmor"
})
public class Stat {

    @JsonProperty("health")
    private Integer health;
    @JsonProperty("healthRegen")
    private Double healthRegen;
    @JsonProperty("mana")
    private Integer mana;
    @JsonProperty("manaRegen")
    private Double manaRegen;
    @JsonProperty("attackSpeed")
    private Integer attackSpeed;
    @JsonProperty("basicArmor")
    private Integer basicArmor;
    @JsonProperty("abilityArmor")
    private Integer abilityArmor;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("health")
    public Integer getHealth() {
        return health;
    }

    @JsonProperty("health")
    public void setHealth(Integer health) {
        this.health = health;
    }

    @JsonProperty("healthRegen")
    public Double getHealthRegen() {
        return healthRegen;
    }

    @JsonProperty("healthRegen")
    public void setHealthRegen(Double healthRegen) {
        this.healthRegen = healthRegen;
    }

    @JsonProperty("mana")
    public Integer getMana() {
        return mana;
    }

    @JsonProperty("mana")
    public void setMana(Integer mana) {
        this.mana = mana;
    }

    @JsonProperty("manaRegen")
    public Double getManaRegen() {
        return manaRegen;
    }

    @JsonProperty("manaRegen")
    public void setManaRegen(Double manaRegen) {
        this.manaRegen = manaRegen;
    }

    @JsonProperty("attackSpeed")
    public Integer getAttackSpeed() {
        return attackSpeed;
    }

    @JsonProperty("attackSpeed")
    public void setAttackSpeed(Integer attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    @JsonProperty("basicArmor")
    public Integer getBasicArmor() {
        return basicArmor;
    }

    @JsonProperty("basicArmor")
    public void setBasicArmor(Integer basicArmor) {
        this.basicArmor = basicArmor;
    }

    @JsonProperty("abilityArmor")
    public Integer getAbilityArmor() {
        return abilityArmor;
    }

    @JsonProperty("abilityArmor")
    public void setAbilityArmor(Integer abilityArmor) {
        this.abilityArmor = abilityArmor;
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
