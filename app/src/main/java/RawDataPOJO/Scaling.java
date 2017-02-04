
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
    "healthscale",
    "healthRegenScale",
    "manaScale",
    "manaRegenScale",
    "basicArmorScale",
    "abilityArmorScale"
})
public class Scaling {

    @JsonProperty("healthscale")
    private Double healthscale;
    @JsonProperty("healthRegenScale")
    private Double healthRegenScale;
    @JsonProperty("manaScale")
    private Integer manaScale;
    @JsonProperty("manaRegenScale")
    private Double manaRegenScale;
    @JsonProperty("basicArmorScale")
    private Integer basicArmorScale;
    @JsonProperty("abilityArmorScale")
    private Double abilityArmorScale;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("healthscale")
    public Double getHealthscale() {
        return healthscale;
    }

    @JsonProperty("healthscale")
    public void setHealthscale(Double healthscale) {
        this.healthscale = healthscale;
    }

    @JsonProperty("healthRegenScale")
    public Double getHealthRegenScale() {
        return healthRegenScale;
    }

    @JsonProperty("healthRegenScale")
    public void setHealthRegenScale(Double healthRegenScale) {
        this.healthRegenScale = healthRegenScale;
    }

    @JsonProperty("manaScale")
    public Integer getManaScale() {
        return manaScale;
    }

    @JsonProperty("manaScale")
    public void setManaScale(Integer manaScale) {
        this.manaScale = manaScale;
    }

    @JsonProperty("manaRegenScale")
    public Double getManaRegenScale() {
        return manaRegenScale;
    }

    @JsonProperty("manaRegenScale")
    public void setManaRegenScale(Double manaRegenScale) {
        this.manaRegenScale = manaRegenScale;
    }

    @JsonProperty("basicArmorScale")
    public Integer getBasicArmorScale() {
        return basicArmorScale;
    }

    @JsonProperty("basicArmorScale")
    public void setBasicArmorScale(Integer basicArmorScale) {
        this.basicArmorScale = basicArmorScale;
    }

    @JsonProperty("abilityArmorScale")
    public Double getAbilityArmorScale() {
        return abilityArmorScale;
    }

    @JsonProperty("abilityArmorScale")
    public void setAbilityArmorScale(Double abilityArmorScale) {
        this.abilityArmorScale = abilityArmorScale;
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
