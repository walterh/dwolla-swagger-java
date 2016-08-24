package io.swagger.client.model;

import io.swagger.client.model.HalLink;
import java.util.*;
import java.util.Map;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;



@ApiModel(description = "")
public class TransferFailure  {
  
  private Map<String, HalLink> links = new HashMap<String, HalLink>() ;
  private Object embedded = null;
  private String code = null;
  private String description = null;
  private String locationHeader;


  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("_links")
  public Map<String, HalLink> getLinks() {
    return links;
  }
  public void setLinks(Map<String, HalLink> links) {
    this.links = links;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("_embedded")
  public Object getEmbedded() {
    return embedded;
  }
  public void setEmbedded(Object embedded) {
    this.embedded = embedded;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  


  /**
   * Used to deserialize Location field in
   * HTTP headers, primarily for HAL-styled
   * POST requests.
   **/
  @JsonProperty("Location")
  public String getLocationHeader() { return locationHeader; }
  public void setLocationHeader(ArrayList<String> locationHeader) { this.locationHeader = locationHeader.get(0); }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferFailure {\n");
    
    sb.append("  links: ").append(links).append("\n");
    sb.append("  embedded: ").append(embedded).append("\n");
    sb.append("  code: ").append(code).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
