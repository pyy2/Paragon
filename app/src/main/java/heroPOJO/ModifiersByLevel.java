
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

})
public class ModifiersByLevel {

    private String damage;
    /**
     *
     * @return
     *     The damage
     */
    @JsonProperty("damage")
    public String getDamage() {
        return damage;
    }

    /**
     *
     * @param damage
     *     The damage
     */
    @JsonProperty("damage")
    public void setDamage(String damage) {
        this.damage = damage;
    }


    private String cooldown;
    /**
     *
     * @return
     *     The cooldown
     */
    @JsonProperty("cooldown")
    public String getCooldown() {
        return cooldown;
    }

    /**
     *
     * @param cooldown
     *     The cooldown
     */
    @JsonProperty("cooldown")
    public void setCooldown(String cooldown) {
        this.cooldown = cooldown;
    }

    private String maxhealthpercent;
    /**
     *
     * @return
     *     The maxhealthpercent
     */
    @JsonProperty("maxhealthpercent")
    public String getMaxhealthpercent() {
        return maxhealthpercent;
    }

    /**
     *
     * @param maxhealthpercent
     *     The maxhealthpercent
     */
    @JsonProperty("maxhealthpercent")
    public void setMaxhealthpercent(String maxhealthpercent) {
        this.maxhealthpercent = maxhealthpercent;
    }

    private String energycost;
    /**
     *
     * @return
     *     The energycost
     */
    @JsonProperty("energycost")
    public String getEnergycost() {
        return energycost;
    }

    /**
     *
     * @param energycost
     *     The energycost
     */
    @JsonProperty("energycost")
    public void setEnergycost(String energycost) {
        this.energycost = energycost;
    }

    private String duration;
    /**
     *
     * @return
     *     The duration
     */
    @JsonProperty("duration")
    public String getDuration() {
        return duration;
    }

    /**
     *
     * @param duration
     *     The duration
     */
    @JsonProperty("duration")
    public void setDuration(String duration) {
        this.duration = duration;
    }

    private String movespeed;
    /**
     *
     * @return
     *     The movespeed
     */
    @JsonProperty("movespeed")
    public String getMovespeed() {
        return movespeed;
    }

    /**
     *
     * @param movespeed
     *     The movespeed
     */
    @JsonProperty("movespeed")
    public void setMovespeed(String movespeed) {
        this.movespeed = movespeed;
    }

    private String slowdur;
    /**
     *
     * @return
     *     The slowdur
     */
    @JsonProperty("slowdur")
    public String getSlowdur() {
        return slowdur;
    }

    /**
     *
     * @param slowdur
     *     The slowdur
     */
    @JsonProperty("slowdur")
    public void setSlowdur(String slowdur) {
        this.slowdur = slowdur;
    }


    private String eclrating;
    /**
     *
     * @return
     *     The eclrating
     */
    @JsonProperty("eclrating")
    public String getEclrating() {
        return eclrating;
    }

    /**
     *
     * @param eclrating
     *     The eclrating
     */
    @JsonProperty("eclrating")
    public void setEclrating(String eclrating) {
        this.eclrating = eclrating;
    }

    private String cdr;
    /**
     *
     * @return
     *     The cdr
     */
    @JsonProperty("cdr")
    public String getCdr() {
        return cdr;
    }

    /**
     *
     * @param cdr
     *     The cdr
     */
    @JsonProperty("cdr")
    public void setCdr(String cdr) {
        this.cdr = cdr;
    }

    private String healthpassive;
    /**
     *
     * @return
     *     The healthpassive
     */
    @JsonProperty("healthpassive")
    public String getHealthpassive() {
        return healthpassive;
    }

    /**
     *
     * @param healthpassive
     *     The healthpassive
     */
    @JsonProperty("healthpassive")
    public void setHealthpassive(String healthpassive) {
        this.healthpassive = healthpassive;
    }

    private String damagepassive;
    /**
     *
     * @return
     *     The damagepassive
     */
    @JsonProperty("damagepassive")
    public String getDamagepassive() {
        return damagepassive;
    }

    /**
     *
     * @param damagepassive
     *     The damagepassive
     */
    @JsonProperty("damagepassive")
    public void setDamagepassive(String damagepassive) {
        this.damagepassive = damagepassive;
    }

    private String damageabilityprimary;
    /**
     *
     * @return
     *     The damageabilityprimary
     */
    @JsonProperty("damageabilityprimary")
    public String getDamageabilityprimary() {
        return damageabilityprimary;
    }

    /**
     *
     * @param damageabilityprimary
     *     The damageabilityprimary
     */
    @JsonProperty("damageabilityprimary")
    public void setDamageabilityprimary(String damageabilityprimary) {
        this.damageabilityprimary = damageabilityprimary;
    }

    private String slowsecondary;
    /**
     *
     * @return
     *     The slowsecondary
     */
    @JsonProperty("slowsecondary")
    public String getSlowsecondary() {
        return slowsecondary;
    }

    /**
     *
     * @param slowsecondary
     *     The slowsecondary
     */
    @JsonProperty("slowsecondary")
    public void setSlowsecondary(String slowsecondary) {
        this.slowsecondary = slowsecondary;
    }

    private String slowlong;
    /**
     *
     * @return
     *     The slowlong
     */
    @JsonProperty("slowlong")
    public String getSlowlong() {
        return slowlong;
    }

    /**
     *
     * @param slowlong
     *     The slowlong
     */
    @JsonProperty("slowlong")
    public void setSlowlong(String slowlong) {
        this.slowlong = slowlong;
    }

    private String rootshort;
    /**
     *
     * @return
     *     The rootshort
     */
    @JsonProperty("rootshort")
    public String getRootshort() {
        return rootshort;
    }

    /**
     *
     * @param rootshort
     *     The rootshort
     */
    @JsonProperty("rootshort")
    public void setRootshort(String rootshort) {
        this.rootshort = rootshort;
    }

    private String damageabilityult;
    /**
     *
     * @return
     *     The damageabilityult
     */
    @JsonProperty("damageabilityult")
    public String getDamageabilityult() {
        return damageabilityult;
    }

    /**
     *
     * @param damageabilityult
     *     The damageabilityult
     */
    @JsonProperty("damageabilityult")
    public void setDamageabilityult(String damageabilityult) {
        this.damageabilityult = damageabilityult;
    }

    private String maxhealth;
    /**
     *
     * @return
     *     The maxhealth
     */
    @JsonProperty("maxhealth")
    public String getMaxhealth() {
        return maxhealth;
    }

    /**
     *
     * @param maxhealth
     *     The maxhealth
     */
    @JsonProperty("maxhealth")
    public void setMaxhealth(String maxhealth) {
        this.maxhealth = maxhealth;
    }

    private String physarmor;
    /**
     *
     * @return
     *     The physarmor
     */
    @JsonProperty("physarmor")
    public String getPhysarmor() {
        return physarmor;
    }

    /**
     *
     * @param physarmor
     *     The physarmor
     */
    @JsonProperty("physarmor")
    public void setPhysarmor(String physarmor) {
        this.physarmor = physarmor;
    }

    private String durationprimary;
    /**
     *
     * @return
     *     The durationprimary
     */
    @JsonProperty("durationprimary")
    public String getDurationprimary() {
        return durationprimary;
    }

    /**
     *
     * @param durationprimary
     *     The durationprimary
     */
    @JsonProperty("durationprimary")
    public void setDurationprimary(String durationprimary) {
        this.durationprimary = durationprimary;
    }

    private String slowamount;
    /**
     *
     * @return
     *     The slowamount
     */
    @JsonProperty("slowamount")
    public String getSlowamount() {
        return slowamount;
    }

    /**
     *
     * @param slowamount
     *     The slowamount
     */
    @JsonProperty("slowamount")
    public void setSlowamount(String slowamount) {
        this.slowamount = slowamount;
    }

    private String slowamount2;
    /**
     *
     * @return
     *     The slowamount2
     */
    @JsonProperty("slowamount2")
    public String getSlowamount2() {
        return slowamount2;
    }

    /**
     *
     * @param slowamount2
     *     The slowamount2
     */
    @JsonProperty("slowamount2")
    public void setSlowamount2(String slowamount2) {
        this.slowamount2 = slowamount2;
    }



    private String radius;
    /**
     *
     * @return
     *     The radius
     */
    @JsonProperty("radius")
    public String getRadius() {
        return radius;
    }

    /**
     *
     * @param radius
     *     The radius
     */
    @JsonProperty("radius")
    public void setRadius(String radius) {
        this.radius = radius;
    }

    private String bonuspercent;
    /**
     *
     * @return
     *     The bonuspercent
     */
    @JsonProperty("bonuspercent")
    public String getBonuspercent() {
        return bonuspercent;
    }

    /**
     *
     * @param bonuspercent
     *     The bonuspercent
     */
    @JsonProperty("bonuspercent")
    public void setBonuspercent(String bonuspercent) {
        this.bonuspercent = bonuspercent;
    }

    private String dashdist;
    /**
     *
     * @return
     *     The dashdist
     */
    @JsonProperty("dashdist")
    public String getDashdist() {
        return dashdist;
    }

    /**
     *
     * @param dashdist
     *     The dashdist
     */
    @JsonProperty("dashdist")
    public void setDashdist(String dashdist) {
        this.dashdist = dashdist;
    }

    private String shield;
    /**
     *
     * @return
     *     The shield
     */
    @JsonProperty("shield")
    public String getShield() {
        return shield;
    }

    /**
     *
     * @param shield
     *     The shield
     */
    @JsonProperty("shield")
    public void setShield(String shield) {
        this.shield = shield;
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
