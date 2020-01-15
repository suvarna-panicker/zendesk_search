package com.search.map;

import com.search.model.Tickets;

import java.util.HashMap;
import java.util.List;

public class TicketsMap {
  
  private HashMap<String, Tickets> idMap;
  
  private HashMap<String, String> urlMap;
  
  private HashMap<String, String> externalIdMap;
  
  private HashMap<String, String> createdAtMap;
  
  private HashMap<String, String> typeMap;
  
  private HashMap<String, String> subjectMap;
  
  private HashMap<String, String> descriptionMap;
  
  private HashMap<String, String> priorityMap;
  
  private HashMap<String, String> statusMap;
  
  private HashMap<Integer, String> submitterIdMap;
  
  private HashMap<Integer, String> assigneeIdMap;
  
  private HashMap<Integer, String> organizationIdMap;
  
  private HashMap<List<String>, String> tagsMap;
  
  private HashMap<Boolean, String> hasIncidentsMap;
  
  private HashMap<String, String> dueAtMap;
  
  private HashMap<String, String> viaMap;
  
  public HashMap<String, Tickets> getIdMap() {
    return idMap;
  }
  
  public void setIdMap(HashMap<String, Tickets> idMap) {
    this.idMap = idMap;
  }
  
  public HashMap<String, String> getUrlMap() {
    return urlMap;
  }
  
  public void setUrlMap(HashMap<String, String> urlMap) {
    this.urlMap = urlMap;
  }
  
  public HashMap<String, String> getExternalIdMap() {
    return externalIdMap;
  }
  
  public void setExternalIdMap(HashMap<String, String> externalIdMap) {
    this.externalIdMap = externalIdMap;
  }
  
  public HashMap<String, String> getCreatedAtMap() {
    return createdAtMap;
  }
  
  public void setCreatedAtMap(HashMap<String, String> createdAtMap) {
    this.createdAtMap = createdAtMap;
  }
  
  public HashMap<String, String> getTypeMap() {
    return typeMap;
  }
  
  public void setTypeMap(HashMap<String, String> typeMap) {
    this.typeMap = typeMap;
  }
  
  public HashMap<String, String> getSubjectMap() {
    return subjectMap;
  }
  
  public void setSubjectMap(HashMap<String, String> subjectMap) {
    this.subjectMap = subjectMap;
  }
  
  public HashMap<String, String> getDescriptionMap() {
    return descriptionMap;
  }
  
  public void setDescriptionMap(HashMap<String, String> descriptionMap) {
    this.descriptionMap = descriptionMap;
  }
  
  public HashMap<String, String> getPriorityMap() {
    return priorityMap;
  }
  
  public void setPriorityMap(HashMap<String, String> priorityMap) {
    this.priorityMap = priorityMap;
  }
  
  public HashMap<String, String> getStatusMap() {
    return statusMap;
  }
  
  public void setStatusMap(HashMap<String, String> statusMap) {
    this.statusMap = statusMap;
  }
  
  public HashMap<Integer, String> getSubmitterIdMap() {
    return submitterIdMap;
  }
  
  public void setSubmitterIdMap(HashMap<Integer, String> submitterIdMap) {
    this.submitterIdMap = submitterIdMap;
  }
  
  public HashMap<Integer, String> getAssigneeIdMap() {
    return assigneeIdMap;
  }
  
  public void setAssigneeIdMap(HashMap<Integer, String> assigneeIdMap) {
    this.assigneeIdMap = assigneeIdMap;
  }
  
  public HashMap<Integer, String> getOrganizationIdMap() {
    return organizationIdMap;
  }
  
  public void setOrganizationIdMap(HashMap<Integer, String> organizationIdMap) {
    this.organizationIdMap = organizationIdMap;
  }
  
  public HashMap<List<String>, String> getTagsMap() {
    return tagsMap;
  }
  
  public void setTagsMap(HashMap<List<String>, String> tagsMap) {
    this.tagsMap = tagsMap;
  }
  
  public HashMap<Boolean, String> getHasIncidentsMap() {
    return hasIncidentsMap;
  }
  
  public void setHasIncidentsMap(HashMap<Boolean, String> hasIncidentsMap) {
    this.hasIncidentsMap = hasIncidentsMap;
  }
  
  public HashMap<String, String> getDueAtMap() {
    return dueAtMap;
  }
  
  public void setDueAtMap(HashMap<String, String> dueAtMap) {
    this.dueAtMap = dueAtMap;
  }
  
  public HashMap<String, String> getViaMap() {
    return viaMap;
  }
  
  public void setViaMap(HashMap<String, String> viaMap) {
    this.viaMap = viaMap;
  }
}
