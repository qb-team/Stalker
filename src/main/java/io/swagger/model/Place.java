package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Area of an organization subjected to tracking.
 */
@ApiModel(description = "Area of an organization subjected to tracking.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-27T15:59:20.699Z[GMT]")
public class Place   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("organizationId")
  private Long organizationId = null;

  @JsonProperty("trackingArea")
  private String trackingArea = null;

  public Place id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for a place of an organization.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique identifier for a place of an organization.")
      @NotNull

    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Place name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name describing the place. If not set by user it gets automatically filled.
   * @return name
  **/
  @ApiModelProperty(value = "Name describing the place. If not set by user it gets automatically filled.")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Place organizationId(Long organizationId) {
    this.organizationId = organizationId;
    return this;
  }

  /**
   * Unique identifier of the organization the place is part of.
   * @return organizationId
  **/
  @ApiModelProperty(required = true, value = "Unique identifier of the organization the place is part of.")
      @NotNull

    public Long getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(Long organizationId) {
    this.organizationId = organizationId;
  }

  public Place trackingArea(String trackingArea) {
    this.trackingArea = trackingArea;
    return this;
  }

  /**
   * rea subjected to movement tracking of people. It is a collection of (longitude, latitude) pairs consisting in a polygon. The string is expressed in JSON format.
   * @return trackingArea
  **/
  @ApiModelProperty(required = true, value = "rea subjected to movement tracking of people. It is a collection of (longitude, latitude) pairs consisting in a polygon. The string is expressed in JSON format.")
      @NotNull

    public String getTrackingArea() {
    return trackingArea;
  }

  public void setTrackingArea(String trackingArea) {
    this.trackingArea = trackingArea;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Place place = (Place) o;
    return Objects.equals(this.id, place.id) &&
        Objects.equals(this.name, place.name) &&
        Objects.equals(this.organizationId, place.organizationId) &&
        Objects.equals(this.trackingArea, place.trackingArea);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, organizationId, trackingArea);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Place {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    trackingArea: ").append(toIndentedString(trackingArea)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
