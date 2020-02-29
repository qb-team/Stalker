package it.qbteam.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Generic access to an organization or a place of it.
 */
@ApiModel(description = "Generic access to an organization or a place of it.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-29T20:29:04.115+01:00[Europe/Berlin]")

public class Access   {
  @JsonProperty("entranceTimestamp")
  private OffsetDateTime entranceTimestamp;

  @JsonProperty("exitTimestamp")
  private OffsetDateTime exitTimestamp;

  public Access entranceTimestamp(OffsetDateTime entranceTimestamp) {
    this.entranceTimestamp = entranceTimestamp;
    return this;
  }

  /**
   * Date and time of the moment in which the user entered the place.
   * @return entranceTimestamp
  */
  @ApiModelProperty(required = true, value = "Date and time of the moment in which the user entered the place.")
  @NotNull

  @Valid

  public OffsetDateTime getEntranceTimestamp() {
    return entranceTimestamp;
  }

  public void setEntranceTimestamp(OffsetDateTime entranceTimestamp) {
    this.entranceTimestamp = entranceTimestamp;
  }

  public Access exitTimestamp(OffsetDateTime exitTimestamp) {
    this.exitTimestamp = exitTimestamp;
    return this;
  }

  /**
   * Date and time of the moment in which the user left the place.
   * @return exitTimestamp
  */
  @ApiModelProperty(required = true, value = "Date and time of the moment in which the user left the place.")
  @NotNull

  @Valid

  public OffsetDateTime getExitTimestamp() {
    return exitTimestamp;
  }

  public void setExitTimestamp(OffsetDateTime exitTimestamp) {
    this.exitTimestamp = exitTimestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Access access = (Access) o;
    return Objects.equals(this.entranceTimestamp, access.entranceTimestamp) &&
        Objects.equals(this.exitTimestamp, access.exitTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entranceTimestamp, exitTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Access {\n");
    
    sb.append("    entranceTimestamp: ").append(toIndentedString(entranceTimestamp)).append("\n");
    sb.append("    exitTimestamp: ").append(toIndentedString(exitTimestamp)).append("\n");
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
