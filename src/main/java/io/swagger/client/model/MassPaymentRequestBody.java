package io.swagger.client.model;

import java.util.*;
import io.swagger.client.model.MassPaymentItemRequestBody;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;



@ApiModel(description = "")
public class MassPaymentRequestBody  {
  
  private Object links = null;
  private List<MassPaymentItemRequestBody> items = new ArrayList<MassPaymentItemRequestBody>() ;
  private Object metadata = null;
  private String locationHeader;


  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("_links")
  public Object getLinks() {
    return links;
  }
  public void setLinks(Object links) {
    this.links = links;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("items")
  public List<MassPaymentItemRequestBody> getItems() {
    return items;
  }
  public void setItems(List<MassPaymentItemRequestBody> items) {
    this.items = items;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("metadata")
  public Object getMetadata() {
    return metadata;
  }
  public void setMetadata(Object metadata) {
    this.metadata = metadata;
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
    sb.append("class MassPaymentRequestBody {\n");
    
    sb.append("  links: ").append(links).append("\n");
    sb.append("  items: ").append(items).append("\n");
    sb.append("  metadata: ").append(metadata).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
