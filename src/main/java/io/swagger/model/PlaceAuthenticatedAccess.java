package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Access;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Access to a place of an organization made with the authenticated trackingMode.
 */
@ApiModel(description = "Access to a place of an organization made with the authenticated trackingMode.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-27T15:59:20.699Z[GMT]")
public class PlaceAuthenticatedAccess   {
  @JsonProperty("access")
  private Access access = null;

  @JsonProperty("placeId")
  private Long placeId = null;

  @JsonProperty("ldapId")
  private Long ldapId = null;

  public PlaceAuthenticatedAccess access(Access access) {
    this.access = access;
    return this;
  }

  /**
   * Get access
   * @return access
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public Access getAccess() {
    return access;
  }

  public void setAccess(Access access) {
    this.access = access;
  }

  public PlaceAuthenticatedAccess placeId(Long placeId) {
    this.placeId = placeId;
    return this;
  }

  /**
   * Unique identifier of the place in which the user had access.
   * @return placeId
  **/
  @ApiModelProperty(required = true, value = "Unique identifier of the place in which the user had access.")
      @NotNull

    public Long getPlaceId() {
    return placeId;
  }

  public void setPlaceId(Long placeId) {
    this.placeId = placeId;
  }

  public PlaceAuthenticatedAccess ldapId(Long ldapId) {
    this.ldapId = ldapId;
    return this;
  }

  /**
   * Organization LDAP server's user unique identifier.
   * @return ldapId
  **/
  @ApiModelProperty(required = true, value = "Organization LDAP server's user unique identifier.")
      @NotNull

    public Long getLdapId() {
    return ldapId;
  }

  public void setLdapId(Long ldapId) {
    this.ldapId = ldapId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlaceAuthenticatedAccess placeAuthenticatedAccess = (PlaceAuthenticatedAccess) o;
    return Objects.equals(this.access, placeAuthenticatedAccess.access) &&
        Objects.equals(this.placeId, placeAuthenticatedAccess.placeId) &&
        Objects.equals(this.ldapId, placeAuthenticatedAccess.ldapId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(access, placeId, ldapId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaceAuthenticatedAccess {\n");
    
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    placeId: ").append(toIndentedString(placeId)).append("\n");
    sb.append("    ldapId: ").append(toIndentedString(ldapId)).append("\n");
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
