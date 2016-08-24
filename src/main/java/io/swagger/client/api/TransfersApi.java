package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;

import io.swagger.client.model.*;

import java.util.*;

import io.swagger.client.model.TransferListResponse;
import io.swagger.client.model.Unit$;
import io.swagger.client.model.TransferRequestBody;
import io.swagger.client.model.Transfer;
import io.swagger.client.model.UpdateTransfer;
import io.swagger.client.model.TransferFailure;

import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

import java.net.URL;
import java.net.MalformedURLException;

public class TransfersApi {
  private ApiClient apiClient;

  private String[] authNames = new String[] { "oauth2" };

  public TransfersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TransfersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Get an account&#39;s transfers.
   * 
   * @param id Account id to get transfers for.
   * @param limit How many results to return.
   * @param offset How many results to skip.
   * @return TransferListResponse
   */
  public TransferListResponse getAccountTransfers (String id, Integer limit, Integer offset) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling getAccountTransfers");
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
    String path = "/accounts/{id}/transfers".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (limit != null)
      queryParams.put("limit", apiClient.parameterToString(limit));
    if (offset != null)
      queryParams.put("offset", apiClient.parameterToString(offset));
    

    

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
        return (TransferListResponse) apiClient.deserialize(response, "", TransferListResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get a customer&#39;s transfers.
   * 
   * @param id Customer id to get transfers for.
   * @param limit How many results to return.
   * @param offset How many results to skip.
   * @return TransferListResponse
   */
  public TransferListResponse getCustomerTransfers (String id, Integer limit, Integer offset) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling getCustomerTransfers");
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
    String path = "/customers/{id}/transfers".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (limit != null)
      queryParams.put("limit", apiClient.parameterToString(limit));
    if (offset != null)
      queryParams.put("offset", apiClient.parameterToString(offset));
    

    

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
        return (TransferListResponse) apiClient.deserialize(response, "", TransferListResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Create a new transfer.
   * 
   * @param body Transfer request.
   * @return Unit$
   */
  public Unit$ create (TransferRequestBody body) throws ApiException {
    Object postBody = body;
    

    

    // create path and map variables
    String path = "/transfers".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    

    

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
      String response = apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, this.authNames);
      if(response != null){
        return (Unit$) apiClient.deserialize(response, "", Unit$.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get a transfer by id.
   * 
   * @param id ID of transfer to get.
   * @return Transfer
   */
  public Transfer byId (String id) throws ApiException {
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
    String path = "/transfers/{id}".replaceAll("\\{format\\}","json")
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
        return (Transfer) apiClient.deserialize(response, "", Transfer.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Update a transfer.
   * 
   * @param body Transfer to update.
   * @param id ID of transfer to get.
   * @return Transfer
   */
  public Transfer update (UpdateTransfer body, String id) throws ApiException {
    Object postBody = body;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling update");
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
    String path = "/transfers/{id}".replaceAll("\\{format\\}","json")
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
      String response = apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, this.authNames);
      if(response != null){
        return (Transfer) apiClient.deserialize(response, "", Transfer.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get a bank transfer failure by transfer id.
   * 
   * @param id ID of failed bank transfer to get.
   * @return TransferFailure
   */
  public TransferFailure failureById (String id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling failureById");
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
    String path = "/transfers/{id}/failure".replaceAll("\\{format\\}","json")
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
        return (TransferFailure) apiClient.deserialize(response, "", TransferFailure.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get a transfer&#39;s fees.
   * 
   * @param id Transfer id to get fees for.
   * @return TransferListResponse
   */
  public TransferListResponse getFeesBySource (String id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling getFeesBySource");
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
    String path = "/transfers/{id}/fees".replaceAll("\\{format\\}","json")
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
        return (TransferListResponse) apiClient.deserialize(response, "", TransferListResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
