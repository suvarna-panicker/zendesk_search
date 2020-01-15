package com.search.map;

import com.search.model.Organizations;

import java.util.HashMap;
import java.util.List;

public class OrganizationsMap {
  
  
  private HashMap<Integer, Organizations> idMap;
  
  private HashMap<String, Integer> urlMap;
  
  private HashMap<String, Integer> externalIdMap;
  
  private HashMap<String, Integer> nameMap;
  
  private HashMap<List<String>, Integer> domainNamesMap;
  
  private HashMap<String, Integer> createdAtMap;
  
  private HashMap<String, Integer> detailsMap;
  
  private HashMap<Boolean, Integer> sharedTicketsMap;
  
  private HashMap<List<String>, Integer> tagsMap;
  
  public HashMap<Integer, Organizations> getIdMap() {
    return idMap;
  }
  
  public void setIdMap(HashMap<Integer, Organizations> idMap) {
    this.idMap = idMap;
  }
  
  public HashMap<String, Integer> getUrlMap() {
    return urlMap;
  }
  
  public void setUrlMap(HashMap<String, Integer> urlMap) {
    this.urlMap = urlMap;
  }
  
  public HashMap<String, Integer> getExternalIdMap() {
    return externalIdMap;
  }
  
  public void setExternalIdMap(HashMap<String, Integer> externalIdMap) {
    this.externalIdMap = externalIdMap;
  }
  
  public HashMap<String, Integer> getNameMap() {
    return nameMap;
  }
  
  public void setNameMap(HashMap<String, Integer> nameMap) {
    this.nameMap = nameMap;
  }
  
  public HashMap<List<String>, Integer> getDomainNamesMap() {
    return domainNamesMap;
  }
  
  public void setDomainNamesMap(HashMap<List<String>, Integer> domainNamesMap) {
    this.domainNamesMap = domainNamesMap;
  }
  
  public HashMap<String, Integer> getCreatedAtMap() {
    return createdAtMap;
  }
  
  public void setCreatedAtMap(HashMap<String, Integer> createdAtMap) {
    this.createdAtMap = createdAtMap;
  }
  
  public HashMap<String, Integer> getDetailsMap() {
    return detailsMap;
  }
  
  public void setDetailsMap(HashMap<String, Integer> detailsMap) {
    this.detailsMap = detailsMap;
  }
  
  public HashMap<Boolean, Integer> getSharedTicketsMap() {
    return sharedTicketsMap;
  }
  
  public void setSharedTicketsMap(HashMap<Boolean, Integer> sharedTicketsMap) {
    this.sharedTicketsMap = sharedTicketsMap;
  }
  
  public HashMap<List<String>, Integer> getTagsMap() {
    return tagsMap;
  }
  
  public void setTagsMap(HashMap<List<String>, Integer> tagsMap) {
    this.tagsMap = tagsMap;
  }
}
