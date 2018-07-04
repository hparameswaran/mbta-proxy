
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
    "address",
    "description",
    "latitude",
    "location_type",
    "longitude",
    "name",
    "platform_code",
    "platform_name",
    "wheelchair_boarding"
})
public class Attributes {

    @JsonProperty("address")
    private Object address;
    @JsonProperty("description")
    private Object description;
    @JsonProperty("latitude")
    private Double latitude;
    @JsonProperty("location_type")
    private Integer locationType;
    @JsonProperty("longitude")
    private Double longitude;
    @JsonProperty("name")
    private String name;
    @JsonProperty("platform_code")
    private Object platformCode;
    @JsonProperty("platform_name")
    private Object platformName;
    @JsonProperty("wheelchair_boarding")
    private Integer wheelchairBoarding;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("address")
    public Object getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(Object address) {
        this.address = address;
    }

    @JsonProperty("description")
    public Object getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(Object description) {
        this.description = description;
    }

    @JsonProperty("latitude")
    public Double getLatitude() {
        return latitude;
    }

    @JsonProperty("latitude")
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    @JsonProperty("location_type")
    public Integer getLocationType() {
        return locationType;
    }

    @JsonProperty("location_type")
    public void setLocationType(Integer locationType) {
        this.locationType = locationType;
    }

    @JsonProperty("longitude")
    public Double getLongitude() {
        return longitude;
    }

    @JsonProperty("longitude")
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("platform_code")
    public Object getPlatformCode() {
        return platformCode;
    }

    @JsonProperty("platform_code")
    public void setPlatformCode(Object platformCode) {
        this.platformCode = platformCode;
    }

    @JsonProperty("platform_name")
    public Object getPlatformName() {
        return platformName;
    }

    @JsonProperty("platform_name")
    public void setPlatformName(Object platformName) {
        this.platformName = platformName;
    }

    @JsonProperty("wheelchair_boarding")
    public Integer getWheelchairBoarding() {
        return wheelchairBoarding;
    }

    @JsonProperty("wheelchair_boarding")
    public void setWheelchairBoarding(Integer wheelchairBoarding) {
        this.wheelchairBoarding = wheelchairBoarding;
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
