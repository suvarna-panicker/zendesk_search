package com.search.service;

import com.search.model.Organizations;
import com.search.model.Tickets;
import com.search.model.Users;

public interface SearchService {
  
  
  public void initializeSearchMaps(Organizations[] organizations, Tickets[] tickets, Users[] users);
  
  public Organizations searchOrganizationById(int id);
  
  public <T> Organizations searchOrganizationsByField(T value, String field);
  
  public Users searchUsersById(String id);
  
  public <T> Users searchUsersByField(T value, String field);
  
  public Tickets searchTicketsById(String id);
  
  public <T> Tickets searchTicketsByField(T value, String field);
  
}
