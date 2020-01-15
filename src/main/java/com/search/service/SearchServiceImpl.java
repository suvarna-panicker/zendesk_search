package com.search.service;

import com.search.map.OrganizationsMap;
import com.search.map.TicketsMap;
import com.search.map.UsersMap;
import com.search.mapper.SearchMapper;
import com.search.model.Organizations;
import com.search.model.Tickets;
import com.search.model.Users;

public class SearchServiceImpl implements SearchService {
  
  private OrganizationsMap organizationsMap;
  private TicketsMap ticketsMap;
  private UsersMap usersMap;
  
  public void initializeSearchMaps(Organizations[] organizations, Tickets[] tickets, Users[] users) {
    
    this.organizationsMap = SearchMapper.mapOrganizations(organizations);
    this.ticketsMap = SearchMapper.mapTickets(tickets);
    this.usersMap = SearchMapper.mapUsers(users);
  }
  
  public Organizations searchOrganizationById(int id) {
    return organizationsMap.getIdMap().get(id);
  }
  
  public <T> Organizations searchOrganizationsByField(T value, String field) {
    int id;
    switch (field) {
      case "url":
        id = organizationsMap.getUrlMap().get(value);
        return searchOrganizationById(id);
      case "external_id":
        id = organizationsMap.getExternalIdMap().get(value);
        return searchOrganizationById(id);
      case "name":
        id = organizationsMap.getNameMap().get(value);
        return searchOrganizationById(id);
      case "domain_names":
        id = organizationsMap.getDomainNamesMap().get(value);
        return searchOrganizationById(id);
      case "details":
        id = organizationsMap.getDetailsMap().get(value);
        return searchOrganizationById(id);
      case "shared_tickets":
        id = organizationsMap.getSharedTicketsMap().get(value);
        return searchOrganizationById(id);
      case "tags":
        id = organizationsMap.getTagsMap().get(value);
        return searchOrganizationById(id);
      default:
        return null;
    }
  }
  
  public Users searchUsersById(String id) {
    return usersMap.getIdMap().get(id);
  }
  
  public <T> Users searchUsersByField(T value, String field) {
    String id;
    switch (field) {
      case "url":
        id = usersMap.getUrlMap().get(value);
        return searchUsersById(id);
      case "external_id":
        id = usersMap.getExternalIdMap().get(value);
        return searchUsersById(id);
      case "name":
        id = usersMap.getNameMap().get(value);
        return searchUsersById(id);
      case "alias":
        id = usersMap.getAliasMap().get(value);
        return searchUsersById(id);
      case "created_at":
        id = usersMap.getCreatedAtMap().get(value);
        return searchUsersById(id);
      case "active":
        id = usersMap.getActiveMap().get(value);
        return searchUsersById(id);
      case "verified":
        id = usersMap.getVerifiedMap().get(value);
        return searchUsersById(id);
      case "shared":
        id = usersMap.getSharedMap().get(value);
        return searchUsersById(id);
      case "locale":
        id = usersMap.getLocaleMap().get(value);
        return searchUsersById(id);
      case "timezone":
        id = usersMap.getTimezoneMap().get(value);
        return searchUsersById(id);
      case "last_login_at":
        id = usersMap.getLastLoginAtMap().get(value);
        return searchUsersById(id);
      case "email":
        id = usersMap.getEmailMap().get(value);
        return searchUsersById(id);
      case "phone":
        id = usersMap.getPhoneMap().get(value);
        return searchUsersById(id);
      case "signature":
        id = usersMap.getSignatureMap().get(value);
        return searchUsersById(id);
      case "organization_id":
        id = usersMap.getOrganizationIdMap().get(value);
        return searchUsersById(id);
      case "tags":
        id = usersMap.getTagsMap().get(value);
        return searchUsersById(id);
      case "suspended":
        id = usersMap.getSuspendedMap().get(value);
        return searchUsersById(id);
      case "role":
        id = usersMap.getRoleMap().get(value);
        return searchUsersById(id);
      default:
        return null;
    }
  }
  
  public Tickets searchTicketsById(String id) {
    return ticketsMap.getIdMap().get(id);
  }
  
  public <T> Tickets searchTicketsByField(T value, String field) {
    String id = null;
    switch (field) {
      case "url":
        id = ticketsMap.getUrlMap().get(value);
        return searchTicketsById(id);
      case "external_id":
        id = ticketsMap.getExternalIdMap().get(value);
        return searchTicketsById(id);
      case "created_at":
        id = ticketsMap.getCreatedAtMap().get(value);
        return searchTicketsById(id);
      case "type":
        id = ticketsMap.getTypeMap().get(value);
        return searchTicketsById(id);
      case "subject":
        id = ticketsMap.getSubjectMap().get(value);
        return searchTicketsById(id);
      case "description":
        id = ticketsMap.getDescriptionMap().get(value);
        return searchTicketsById(id);
      case "priority":
        id = ticketsMap.getPriorityMap().get(value);
        return searchTicketsById(id);
      case "status":
        id = ticketsMap.getStatusMap().get(value);
        return searchTicketsById(id);
      case "submitter_id":
        id = ticketsMap.getSubmitterIdMap().get(value);
        return searchTicketsById(id);
      case "assignee_id":
        id = ticketsMap.getAssigneeIdMap().get(value);
        return searchTicketsById(id);
      case "organization_id":
        id = ticketsMap.getOrganizationIdMap().get(value);
        return searchTicketsById(id);
      case "tags":
        id = ticketsMap.getTagsMap().get(value);
        return searchTicketsById(id);
      case "has_incidents":
        id = ticketsMap.getHasIncidentsMap().get(value);
        return searchTicketsById(id);
      case "due_at":
        id = ticketsMap.getDueAtMap().get(value);
        return searchTicketsById(id);
      case "via":
        id = ticketsMap.getViaMap().get(value);
        return searchTicketsById(id);
      default:
        return null;
    }
  }
  
}
