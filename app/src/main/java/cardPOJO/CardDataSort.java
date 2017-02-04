
package cardPOJO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "slotType",
    "images",
    "rarity",
    "affinities",
    "cost",
    "upgradeSlots",
    "damageType",
    "effects",
    "maxedEffects"
})
public class CardDataSort {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("slotType")
    private String slotType;
    @JsonProperty("images")
    private Images images;
    @JsonProperty("rarity")
    private String rarity;
    @JsonProperty("affinities")
    private List<String> affinities = null;
    @JsonProperty("cost")
    private Integer cost;
    @JsonProperty("upgradeSlots")
    private Integer upgradeSlots;
    @JsonProperty("damageType")
    private String damageType;
    @JsonProperty("effects")
    private List<Effect> effects = null;
    @JsonProperty("maxedEffects")
    private List<MaxedEffect> maxedEffects = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The slotType
     */
    @JsonProperty("slotType")
    public String getSlotType() {
        return slotType;
    }

    /**
     * 
     * @param slotType
     *     The slotType
     */
    @JsonProperty("slotType")
    public void setSlotType(String slotType) {
        this.slotType = slotType;
    }

    /**
     * 
     * @return
     *     The images
     */
    @JsonProperty("images")
    public Images getImages() {
        return images;
    }

    /**
     * 
     * @param images
     *     The images
     */
    @JsonProperty("images")
    public void setImages(Images images) {
        this.images = images;
    }

    /**
     * 
     * @return
     *     The rarity
     */
    @JsonProperty("rarity")
    public String getRarity() {
        return rarity;
    }

    /**
     * 
     * @param rarity
     *     The rarity
     */
    @JsonProperty("rarity")
    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    /**
     * 
     * @return
     *     The affinities
     */
    @JsonProperty("affinities")
    public List<String> getAffinities() {
        return affinities;
    }

    /**
     * 
     * @param affinities
     *     The affinities
     */
    @JsonProperty("affinities")
    public void setAffinities(List<String> affinities) {
        this.affinities = affinities;
    }

    /**
     * 
     * @return
     *     The cost
     */
    @JsonProperty("cost")
    public Integer getCost() {
        return cost;
    }

    /**
     * 
     * @param cost
     *     The cost
     */
    @JsonProperty("cost")
    public void setCost(Integer cost) {
        this.cost = cost;
    }

    /**
     * 
     * @return
     *     The upgradeSlots
     */
    @JsonProperty("upgradeSlots")
    public Integer getUpgradeSlots() {
        return upgradeSlots;
    }

    /**
     * 
     * @param upgradeSlots
     *     The upgradeSlots
     */
    @JsonProperty("upgradeSlots")
    public void setUpgradeSlots(Integer upgradeSlots) {
        this.upgradeSlots = upgradeSlots;
    }

    /**
     * 
     * @return
     *     The damageType
     */
    @JsonProperty("damageType")
    public String getDamageType() {
        return damageType;
    }

    /**
     * 
     * @param damageType
     *     The damageType
     */
    @JsonProperty("damageType")
    public void setDamageType(String damageType) {
        this.damageType = damageType;
    }

    /**
     * 
     * @return
     *     The effects
     */
    @JsonProperty("effects")
    public List<Effect> getEffects() {
        return effects;
    }

    /**
     * 
     * @param effects
     *     The effects
     */
    @JsonProperty("effects")
    public void setEffects(List<Effect> effects) {
        this.effects = effects;
    }

    /**
     * 
     * @return
     *     The maxedEffects
     */
    @JsonProperty("maxedEffects")
    public List<MaxedEffect> getMaxedEffects() {
        return maxedEffects;
    }

    /**
     * 
     * @param maxedEffects
     *     The maxedEffects
     */
    @JsonProperty("maxedEffects")
    public void setMaxedEffects(List<MaxedEffect> maxedEffects) {
        this.maxedEffects = maxedEffects;
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
