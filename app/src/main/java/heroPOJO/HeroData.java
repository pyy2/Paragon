
package heroPOJO;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "type",
    "attack",
    "traits",
    "scale",
    "releaseDate",
    "affinities",
    "difficulty",
    "stats",
    "images",
    "abilities"
})

public class HeroData {
    

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("type")
    private String type;
    @JsonProperty("attack")
    private String attack;
    @JsonProperty("traits")
    private List<String> traits = null;
    @JsonProperty("scale")
    private String scale;
    @JsonProperty("releaseDate")
    private String releaseDate;
    @JsonProperty("affinities")
    private List<String> affinities = new ArrayList<String>();
    @JsonProperty("difficulty")
    private Integer difficulty;
    @JsonProperty("stats")
    private Stats stats;
    @JsonProperty("images")
    private Images images;
    @JsonProperty("abilities")
    private List<Ability> abilities = new ArrayList<Ability>();
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
     *     The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The attack
     */
    @JsonProperty("attack")
    public String getAttack() {
        return attack;
    }

    /**
     * 
     * @param attack
     *     The attack
     */
    @JsonProperty("attack")
    public void setAttack(String attack) {
        this.attack = attack;
    }

    /**
     *
     * @return
     * The traits
     */
    @JsonProperty("traits")
    public List<String> getTraits() {
        return traits;
    }

    /**
     *
     * @param traits
     * The traits
     */
    @JsonProperty("traits")
    public void setTraits(List<String> traits) {
        this.traits = traits;
    }

    /**
     * 
     * @return
     *     The scale
     */
    @JsonProperty("scale")
    public String getScale() {
        return scale;
    }

    /**
     * 
     * @param scale
     *     The scale
     */
    @JsonProperty("scale")
    public void setScale(String scale) {
        this.scale = scale;
    }

    /**
     * 
     * @return
     *     The releaseDate
     */
    @JsonProperty("releaseDate")
    public String getReleaseDate() {
        return releaseDate;
    }

    /**
     * 
     * @param releaseDate
     *     The releaseDate
     */
    @JsonProperty("releaseDate")
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
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
     *     The difficulty
     */
    @JsonProperty("difficulty")
    public Integer getDifficulty() {
        return difficulty;
    }

    /**
     * 
     * @param difficulty
     *     The difficulty
     */
    @JsonProperty("difficulty")
    public void setDifficulty(Integer difficulty) {
        this.difficulty = difficulty;
    }

    /**
     * 
     * @return
     *     The stats
     */
    @JsonProperty("stats")
    public Stats getStats() {
        return stats;
    }

    /**
     * 
     * @param stats
     *     The stats
     */
    @JsonProperty("stats")
    public void setStats(Stats stats) {
        this.stats = stats;
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
     *     The abilities
     */
    @JsonProperty("abilities")
    public List<Ability> getAbilities() {
        return abilities;
    }

    /**
     * 
     * @param abilities
     *     The abilities
     */
    @JsonProperty("abilities")
    public void setAbilities(List<Ability> abilities) {
        this.abilities = abilities;
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
