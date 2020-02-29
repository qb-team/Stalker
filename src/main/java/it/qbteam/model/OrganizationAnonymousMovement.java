package it.qbteam.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import it.qbteam.model.Movement;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Movement to an organization made with the authenticated trackingMode.
 */
@ApiModel(description = "Movement to an organization made with the authenticated trackingMode.")

public class OrganizationAnonymousMovement   {
  @JsonProperty("movement")
  private Movement movement;

  @JsonProperty("organizationId")
  private Long organizationId;

  public OrganizationAnonymousMovement movement(Movement movement) {
    this.movement = movement;
    return this;
  }

  /**
   * Get movement
   * @return movement
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Movement getMovement() {
    return movement;
  }

  public void setMovement(Movement movement) {
    this.movement = movement;
  }

  public OrganizationAnonymousMovement organizationId(Long organizationId) {
    this.organizationId = organizationId;
    return this;
  }

  /**
   * Unique identifier of the organization in which the user had access.
   * @return organizationId
  */
  @ApiModelProperty(required = true, value = "Unique identifier of the organization in which the user had access.")
  @NotNull


  public Long getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(Long organizationId) {
    this.organizationId = organizationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationAnonymousMovement organizationAnonymousMovement = (OrganizationAnonymousMovement) o;
    return Objects.equals(this.movement, organizationAnonymousMovement.movement) &&
        Objects.equals(this.organizationId, organizationAnonymousMovement.organizationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(movement, organizationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationAnonymousMovement {\n");
    
    sb.append("    movement: ").append(toIndentedString(movement)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
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

