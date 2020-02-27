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
 * Administrator
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-27T15:59:20.699Z[GMT]")
public class Administrator   {
  @JsonProperty("administratorId")
  private String administratorId = null;

  @JsonProperty("ldapId")
  private Integer ldapId = null;

  public Administrator administratorId(String administratorId) {
    this.administratorId = administratorId;
    return this;
  }

  /**
   * Authentication service's administrator unique identifier.
   * @return administratorId
  **/
  @ApiModelProperty(required = true, value = "Authentication service's administrator unique identifier.")
      @NotNull

    public String getAdministratorId() {
    return administratorId;
  }

  public void setAdministratorId(String administratorId) {
    this.administratorId = administratorId;
  }

  public Administrator ldapId(Integer ldapId) {
    this.ldapId = ldapId;
    return this;
  }

  /**
   * Organization LDAP server's administrator unique identifier.
   * @return ldapId
  **/
  @ApiModelProperty(value = "Organization LDAP server's administrator unique identifier.")
  
    public Integer getLdapId() {
    return ldapId;
  }

  public void setLdapId(Integer ldapId) {
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
    Administrator administrator = (Administrator) o;
    return Objects.equals(this.administratorId, administrator.administratorId) &&
        Objects.equals(this.ldapId, administrator.ldapId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(administratorId, ldapId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Administrator {\n");
    
    sb.append("    administratorId: ").append(toIndentedString(administratorId)).append("\n");
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
