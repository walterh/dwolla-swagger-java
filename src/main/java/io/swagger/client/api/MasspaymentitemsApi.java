package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;

import io.swagger.client.model.*;

import java.util.*;

import io.swagger.client.model.MassPaymentItem;
import io.swagger.client.model.MassPaymentItemListResponse;

import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

import java.net.URL;
import java.net.MalformedURLException;

public class MasspaymentitemsApi {
  private ApiClient apiClient;

  private String[] authNames = new String[] { "oauth2" };

  public MasspaymentitemsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MasspaymentitemsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Get a mass payment item by id.
   * 
   * @param id ID of mass payment item to get.
   * @return MassPaymentItem
   */
  public MassPaymentItem byId (String id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling byId");
    }
    

    
    // if a URL is provided, extract the ID
    URL u;
    try {
      u = new URL(id);
      id = id.substring(id.lastIndexOf('/') + 1);
    }
    catch (MalformedURLException mue) {
      u = null;
    }
    

    // create path and map variables
    String path = "/mass-payment-items/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    final String[] accepts = {
      "application/vnd.dwolla.v1.hal+json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, this.authNames);
      if(response != null){
        return (MassPaymentItem) apiClient.deserialize(response, "", MassPaymentItem.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get a mass payment&#39;s items.
   * 
   * @param id Mass payment id to get items for.
   * @param limit How many results to return.
   * @param offset How many results to skip.
   * @param status What status to filter by.
   * @return MassPaymentItemListResponse
   */
  public MassPaymentItemListResponse getMassPaymentItems (String id, Integer limit, Integer offset, String status) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling getMassPaymentItems");
    }
    

    
    // if a URL is provided, extract the ID
    URL u;
    try {
      u = new URL(id);
      id = id.substring(id.lastIndexOf('/') + 1);
    }
    catch (MalformedURLException mue) {
      u = null;
    }
    

    // create path and map variables
    String path = "/mass-payments/{id}/items".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (limit != null)
      queryParams.put("limit", apiClient.parameterToString(limit));
    if (offset != null)
      queryParams.put("offset", apiClient.parameterToString(offset));
    if (status != null)
      queryParams.put("status", apiClient.parameterToString(status));
    

    

    final String[] accepts = {
      "application/vnd.dwolla.v1.hal+json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/vnd.dwolla.v1.hal+json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, this.authNames);
      if(response != null){
        return (MassPaymentItemListResponse) apiClient.deserialize(response, "", MassPaymentItemListResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
