package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Manufacturer;
import java.util.Date;
import java.util.UUID;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2018-12-12T14:49:47.026Z")
public class InventoryItem   {
  
  private UUID id = null;
  private String name = null;
  private Date releaseDate = null;
  private Manufacturer manufacturer = null;

  /**
   **/
  
  @ApiModelProperty(example = "d290f1ee-6c54-4b01-90e6-d701748f0851", required = true, value = "")
  @JsonProperty("id")
  @NotNull
  public UUID getId() {
    return id;
  }
  public void setId(UUID id) {
    this.id = id;
  }

  /**
   **/
  
  @ApiModelProperty(example = "Widget Adapter", required = true, value = "")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  
  @ApiModelProperty(example = "2016-08-29T09:12:33.001Z", required = true, value = "")
  @JsonProperty("releaseDate")
  @NotNull
  public Date getReleaseDate() {
    return releaseDate;
  }
  public void setReleaseDate(Date releaseDate) {
    this.releaseDate = releaseDate;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("manufacturer")
  @NotNull
  public Manufacturer getManufacturer() {
    return manufacturer;
  }
  public void setManufacturer(Manufacturer manufacturer) {
    this.manufacturer = manufacturer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InventoryItem inventoryItem = (InventoryItem) o;
    return Objects.equals(id, inventoryItem.id) &&
        Objects.equals(name, inventoryItem.name) &&
        Objects.equals(releaseDate, inventoryItem.releaseDate) &&
        Objects.equals(manufacturer, inventoryItem.manufacturer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, releaseDate, manufacturer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
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

