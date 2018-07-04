
package com.harish.mbta.model.v3.stops;

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
    "child_stops",
    "facilities",
    "parent_station"
})
public class Relationships {

    @JsonProperty("child_stops")
    private ChildStops childStops;
    @JsonProperty("facilities")
    private Facilities facilities;
    @JsonProperty("parent_station")
    private ParentStation parentStation;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("child_stops")
    public ChildStops getChildStops() {
        return childStops;
    }

    @JsonProperty("child_stops")
    public void setChildStops(ChildStops childStops) {
        this.childStops = childStops;
    }

    @JsonProperty("facilities")
    public Facilities getFacilities() {
        return facilities;
    }

    @JsonProperty("facilities")
    public void setFacilities(Facilities facilities) {
        this.facilities = facilities;
    }

    @JsonProperty("parent_station")
    public ParentStation getParentStation() {
        return parentStation;
    }

    @JsonProperty("parent_station")
    public void setParentStation(ParentStation parentStation) {
        this.parentStation = parentStation;
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
