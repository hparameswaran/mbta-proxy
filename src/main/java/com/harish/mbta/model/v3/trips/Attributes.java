
package com.harish.mbta.model.v3.trips;

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
    "block_id",
    "direction_id",
    "headsign",
    "name",
    "wheelchair_accessible"
})
public class Attributes {

    @JsonProperty("block_id")
    private String blockId;
    @JsonProperty("direction_id")
    private Integer directionId;
    @JsonProperty("headsign")
    private String headsign;
    @JsonProperty("name")
    private String name;
    @JsonProperty("wheelchair_accessible")
    private Integer wheelchairAccessible;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("block_id")
    public String getBlockId() {
        return blockId;
    }

    @JsonProperty("block_id")
    public void setBlockId(String blockId) {
        this.blockId = blockId;
    }

    @JsonProperty("direction_id")
    public Integer getDirectionId() {
        return directionId;
    }

    @JsonProperty("direction_id")
    public void setDirectionId(Integer directionId) {
        this.directionId = directionId;
    }

    @JsonProperty("headsign")
    public String getHeadsign() {
        return headsign;
    }

    @JsonProperty("headsign")
    public void setHeadsign(String headsign) {
        this.headsign = headsign;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("wheelchair_accessible")
    public Integer getWheelchairAccessible() {
        return wheelchairAccessible;
    }

    @JsonProperty("wheelchair_accessible")
    public void setWheelchairAccessible(Integer wheelchairAccessible) {
        this.wheelchairAccessible = wheelchairAccessible;
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
