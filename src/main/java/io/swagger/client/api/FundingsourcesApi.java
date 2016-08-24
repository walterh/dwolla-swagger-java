package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;

import io.swagger.client.model.*;

import java.util.*;

import io.swagger.client.model.FundingSourceListResponse;
import io.swagger.client.model.FundingSource;
import io.swagger.client.model.CreateFundingSourceRequest;
import io.swagger.client.model.Unit$;
import io.swagger.client.model.RemoveBankRequest;
import io.swagger.client.model.FundingSourceBalance;
import io.swagger.client.model.MicroDepositsInitiated;
import io.swagger.client.model.MicroDeposits;
import io.swagger.client.model.VerifyMicroDepositsRequest;

import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

import java.net.URL;
import java.net.MalformedURLException;

public class FundingsourcesApi {
  private ApiClient apiClient;

  private String[] authNames = new String[] { "oauth2" };

  public FundingsourcesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FundingsourcesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Get an account&#39;s funding sources.
   * 
   * @param id Account id to get funding sources for.
   * @param removed Filter funding sources by this value.
   * @return FundingSourceListResponse
   */
  public FundingSourceListResponse getAccountFundingSources (String id, Boolean removed) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling getAccountFundingSources");
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
    String path = "/accounts/{id}/funding-sources".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (removed != null)
      queryParams.put("removed", apiClient.parameterToString(removed));
    

    

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
        return (FundingSourceListResponse) apiClient.deserialize(response, "", FundingSourceListResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get a customer&#39;s funding sources.
   * 
   * @param id Customer id to get funding sources for.
   * @param removed Filter funding sources by this value.
   * @return FundingSourceListResponse
   */
  public FundingSourceListResponse getCustomerFundingSources (String id, Boolean removed) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling getCustomerFundingSources");
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
    String path = "/customers/{id}/funding-sources".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (removed != null)
      queryParams.put("removed", apiClient.parameterToString(removed));
    

    

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
        return (FundingSourceListResponse) apiClient.deserialize(response, "", FundingSourceListResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Create a new funding source.
   * 
   * @param body Funding source to create.
   * @param id Customer id to create funding source for.
   * @return FundingSource
   */
  public FundingSource createCustomerFundingSource (CreateFundingSourceRequest body, String id) throws ApiException {
    Object postBody = body;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling createCustomerFundingSource");
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
    String path = "/customers/{id}/funding-sources".replaceAll("\\{format\\}","json")
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
        return (FundingSource) apiClient.deserialize(response, "", FundingSource.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Create a new funding source.
   * 
   * @param body Funding source to create.
   * @return FundingSource
   */
  public FundingSource createFundingSource (CreateFundingSourceRequest body) throws ApiException {
    Object postBody = body;
    

    

    // create path and map variables
    String path = "/funding-sources".replaceAll("\\{format\\}","json");

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
        return (FundingSource) apiClient.deserialize(response, "", FundingSource.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get a funding source by id.
   * 
   * @param id Funding source ID to get.
   * @return FundingSource
   */
  public FundingSource id (String id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling id");
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
    String path = "/funding-sources/{id}".replaceAll("\\{format\\}","json")
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
        return (FundingSource) apiClient.deserialize(response, "", FundingSource.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Remove a funding source.
   * 
   * @param body request body to remove a funding source
   * @param id Funding source ID to remove.
   * @return FundingSource
   */
  public FundingSource softDelete (RemoveBankRequest body, String id) throws ApiException {
    Object postBody = body;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling softDelete");
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
    String path = "/funding-sources/{id}".replaceAll("\\{format\\}","json")
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
      String response = apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, this.authNames);
      if(response != null){
        return (FundingSource) apiClient.deserialize(response, "", FundingSource.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get the balance of a funding source.
   * 
   * @param id Funding source ID to get the balance for.
   * @return FundingSourceBalance
   */
  public FundingSourceBalance getBalance (String id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling getBalance");
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
    String path = "/funding-sources/{id}/balance".replaceAll("\\{format\\}","json")
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
        return (FundingSourceBalance) apiClient.deserialize(response, "", FundingSourceBalance.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Verify pending verifications exist.
   * 
   * @param id Funding source ID to check for pending validation deposits for.
   * @return MicroDepositsInitiated
   */
  public MicroDepositsInitiated verifyMicroDepositsExist (String id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling verifyMicroDepositsExist");
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
    String path = "/funding-sources/{id}/micro-deposits".replaceAll("\\{format\\}","json")
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
        return (MicroDepositsInitiated) apiClient.deserialize(response, "", MicroDepositsInitiated.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Initiate or verify micro deposits for bank verification.
   * 
   * @param body Optional micro deposit amounts for verification
   * @param id Funding source ID to initiate or verify micro deposits for.
   * @return MicroDeposits
   */
  public MicroDeposits microDeposits (VerifyMicroDepositsRequest body, String id) throws ApiException {
    Object postBody = body;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling microDeposits");
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
    String path = "/funding-sources/{id}/micro-deposits".replaceAll("\\{format\\}","json")
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
      String response = apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, this.authNames);
      if(response != null){
        return (MicroDeposits) apiClient.deserialize(response, "", MicroDeposits.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
