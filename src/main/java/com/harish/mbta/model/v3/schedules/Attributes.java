
package com.harish.mbta.model.v3.schedules;

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
    "arrival_time",
    "departure_time",
    "drop_off_type",
    "pickup_type",
    "stop_sequence",
    "timepoint"
})
public class Attributes {

    @JsonProperty("arrival_time")
    private String arrivalTime;
    @JsonProperty("departure_time")
    private String departureTime;
    @JsonProperty("drop_off_type")
    private Integer dropOffType;
    @JsonProperty("pickup_type")
    private Integer pickupType;
    @JsonProperty("stop_sequence")
    private Integer stopSequence;
    @JsonProperty("timepoint")
    private Boolean timepoint;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("arrival_time")
    public String getArrivalTime() {
        return arrivalTime;
    }

    @JsonProperty("arrival_time")
    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    @JsonProperty("departure_time")
    public String getDepartureTime() {
        return departureTime;
    }

    @JsonProperty("departure_time")
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    @JsonProperty("drop_off_type")
    public Integer getDropOffType() {
        return dropOffType;
    }

    @JsonProperty("drop_off_type")
    public void setDropOffType(Integer dropOffType) {
        this.dropOffType = dropOffType;
    }

    @JsonProperty("pickup_type")
    public Integer getPickupType() {
        return pickupType;
    }

    @JsonProperty("pickup_type")
    public void setPickupType(Integer pickupType) {
        this.pickupType = pickupType;
    }

    @JsonProperty("stop_sequence")
    public Integer getStopSequence() {
        return stopSequence;
    }

    @JsonProperty("stop_sequence")
    public void setStopSequence(Integer stopSequence) {
        this.stopSequence = stopSequence;
    }

    @JsonProperty("timepoint")
    public Boolean getTimepoint() {
        return timepoint;
    }

    @JsonProperty("timepoint")
    public void setTimepoint(Boolean timepoint) {
        this.timepoint = timepoint;
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
