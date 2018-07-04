
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
    "prediction",
    "route",
    "stop",
    "trip"
})
public class Relationships {

    @JsonProperty("prediction")
    private Prediction prediction;
    @JsonProperty("route")
    private Route route;
    @JsonProperty("stop")
    private Stop stop;
    @JsonProperty("trip")
    private Trip trip;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("prediction")
    public Prediction getPrediction() {
        return prediction;
    }

    @JsonProperty("prediction")
    public void setPrediction(Prediction prediction) {
        this.prediction = prediction;
    }

    @JsonProperty("route")
    public Route getRoute() {
        return route;
    }

    @JsonProperty("route")
    public void setRoute(Route route) {
        this.route = route;
    }

    @JsonProperty("stop")
    public Stop getStop() {
        return stop;
    }

    @JsonProperty("stop")
    public void setStop(Stop stop) {
        this.stop = stop;
    }

    @JsonProperty("trip")
    public Trip getTrip() {
        return trip;
    }

    @JsonProperty("trip")
    public void setTrip(Trip trip) {
        this.trip = trip;
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
