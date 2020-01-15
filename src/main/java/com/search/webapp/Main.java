package com.search.webapp;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.search.display.SearchDisplay;
import com.search.model.Organizations;
import com.search.model.Tickets;
import com.search.model.Users;
import com.search.service.SearchService;
import com.search.service.SearchServiceImpl;
import org.json.simple.parser.JSONParser;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.search.display.SearchDisplay.*;

public class Main {
  
  public static void main(String[] args) {
    JSONParser parser = new JSONParser();
    SearchService searchService = new SearchServiceImpl();
    try {
      File file = new File("src/main/resources/organizations.json");
      String content = parser.parse(new FileReader(file.getAbsolutePath())).toString();
      ObjectMapper mapper = new ObjectMapper();
      Organizations[] organizations = mapper.readValue(content, Organizations[].class);
      
      File ticketFile = new File("src/main/resources/tickets.json");
      String ticketContent = parser.parse(new FileReader(ticketFile.getAbsolutePath())).toString();
      Tickets[] tickets = mapper.readValue(ticketContent, Tickets[].class);
      
      File usersFile = new File("src/main/resources/users.json");
      String usersContent = parser.parse(new FileReader(usersFile.getAbsolutePath())).toString();
      Users[] users = mapper.readValue(usersContent, Users[].class);
      
      searchService.initializeSearchMaps(organizations, tickets, users);
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    int searchType;
    do {
      SearchDisplay.displaySearchTypes();
      searchType = scan.nextInt();
      int fieldType = 0;
      switch (searchType) {
        case 1:
          SearchDisplay.displayUsersFields();
          fieldType = scan.nextInt();
          Users users = handleUserSearch(fieldType, searchService);
          SearchDisplay.displayUser(users);
          if (users != null && users.getOrganization_id() != null) {
            SearchDisplay.displayOrganization(searchService.searchOrganizationById(users.getOrganization_id()));
          }
          break;
        case 2:
          SearchDisplay.displayTicketsFields();
          fieldType = scan.nextInt();
          Tickets tickets = handleTicketsSearch(fieldType, searchService);
          SearchDisplay.displayTicket(tickets);
          if (tickets != null && tickets.getOrganizationId() != null) {
            SearchDisplay.displayOrganization(searchService.searchOrganizationById(tickets.getOrganizationId()));
          }
          break;
        case 3:
          SearchDisplay.displayOrganizationsField();
          fieldType = scan.nextInt();
          Organizations organizations = handleOrganizationSearch(fieldType, searchService);
          SearchDisplay.displayOrganization(organizations);
          break;
        default:
          break;
      }
    }
    while (searchType != 4);
  }
  
  private static Users handleUserSearch(int fieldType, SearchService searchService) {
    System.out.println("Enter the value to search ");
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
    switch (fieldType) {
      case 1:
        String id = scan.nextLine();
        return searchService.searchUsersById(id);
      case 2:
        String url = scan.nextLine();
        return searchService.searchUsersByField(url, USERS_URL);
      case 3:
        String externalIdMap = scan.nextLine();
        return searchService.searchUsersByField(externalIdMap, USERS_EXTERNAL_ID);
      case 4:
        String name = scan.nextLine();
        return searchService.searchUsersByField(name, USERS_NAME);
      case 5:
        String alias = scan.nextLine();
        return searchService.searchUsersByField(alias, USERS_ALIAS);
      case 6:
        String createdAt = scan.nextLine();
        return searchService.searchUsersByField(createdAt, USERS_CREATED_AT);
      case 7:
        Boolean active = scan.nextBoolean();
        return searchService.searchUsersByField(active, USERS_ACTIVE);
      case 8:
        Boolean verified = scan.nextBoolean();
        return searchService.searchUsersByField(verified, USERS_VERIFIED);
      case 9:
        Boolean shared = scan.nextBoolean();
        return searchService.searchUsersByField(shared, USERS_SHARED);
      case 10:
        String locale = scan.nextLine();
        return searchService.searchUsersByField(locale, USERS_LOCALE);
      case 11:
        String timezone = scan.nextLine();
        return searchService.searchUsersByField(timezone, USERS_TIMEZONE);
      case 12:
        String lastLoginAt = scan.nextLine();
        return searchService.searchUsersByField(lastLoginAt, USERS_LAST_LOGIN_AT);
      case 13:
        String email = scan.nextLine();
        return searchService.searchUsersByField(email, USERS_EMAIL);
      case 14:
        String phone = scan.nextLine();
        return searchService.searchUsersByField(phone, USERS_PHONE);
      case 15:
        String signature = scan.nextLine();
        return searchService.searchUsersByField(signature, USERS_SIGNATURE);
      case 16:
        Integer organizationID = scan.nextInt();
        return searchService.searchUsersByField(organizationID, USERS_ORGANIZATION_ID);
      case 17:
        String tag = scan.nextLine();
        String[] tags;
        tags = tag.split(",");
        List<String> tagList = new ArrayList<String>();
        for (String value : tags) {
          tagList.add(value);
        }
        return searchService.searchUsersByField(tagList, USERS_TAGS);
      case 18:
        Boolean suspended = scan.nextBoolean();
        return searchService.searchUsersByField(suspended, USERS_SUSPENDED);
      case 19:
        String role = scan.nextLine();
        return searchService.searchUsersByField(role, USERS_ROLE);
      default:
        System.out.println(" Please enter valid choice");
        return null;
    }
  }
  
  private static Tickets handleTicketsSearch(int fieldType, SearchService searchService) {
    System.out.println("Enter the value to search ");
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
    switch (fieldType) {
      case 1:
        String id = scan.nextLine();
        return searchService.searchTicketsById(id);
      case 2:
        String url = scan.nextLine();
        return searchService.searchTicketsByField(url, TICKETS_URL);
      case 3:
        String externalIdMap = scan.nextLine();
        return searchService.searchTicketsByField(externalIdMap, TICKETS_EXTERNAL_ID);
      case 4:
        String createdAt = scan.nextLine();
        return searchService.searchTicketsByField(createdAt, TICKETS_CREATED_AT);
      case 5:
        String type = scan.nextLine();
        return searchService.searchTicketsByField(type, TICKETS_TYPE);
      case 6:
        String subject = scan.nextLine();
        return searchService.searchTicketsByField(subject, TICKETS_SUBJECT);
      case 7:
        String description = scan.nextLine();
        return searchService.searchTicketsByField(description, TICKETS_DESCRIPTION);
      case 8:
        String priority = scan.nextLine();
        return searchService.searchTicketsByField(priority, TICKETS_PRIORITY);
      case 9:
        String status = scan.nextLine();
        return searchService.searchTicketsByField(status, TICKETS_STATUS);
      case 10:
        Integer submitterId = scan.nextInt();
        return searchService.searchTicketsByField(submitterId, TICKETS_SUBMITTER_ID);
      case 11:
        Integer assigneeId = scan.nextInt();
        return searchService.searchTicketsByField(assigneeId, TICKETS_ASSIGNEE_ID);
      case 12:
        Integer organizationId = scan.nextInt();
        return searchService.searchTicketsByField(organizationId, TICKETS_ORGANIZATION_ID);
      case 13:
        String tag = scan.nextLine();
        String[] tags;
        tags = tag.split(",");
        List<String> tagList = new ArrayList<String>();
        for (String value : tags) {
          tagList.add(value);
        }
        return searchService.searchTicketsByField(tagList, TICKETS_TAGS);
      case 14:
        Boolean hasIncidents = scan.nextBoolean();
        return searchService.searchTicketsByField(hasIncidents, TICKETS_HAS_INCIDENTS);
      case 15:
        String dueAt = scan.nextLine();
        return searchService.searchTicketsByField(dueAt, TICKETS_DUE_AT);
      case 16:
        String via = scan.nextLine();
        return searchService.searchTicketsByField(via, TICKETS_VIA);
      default:
        System.out.println(" Please enter valid choice");
        return null;
    }
  }
  
  private static Organizations handleOrganizationSearch(int fieldType, SearchService searchService) {
    System.out.println("Enter the value to search ");
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
    switch (fieldType) {
      case 1:
        Integer id = scan.nextInt();
        return searchService.searchOrganizationById(id);
      case 2:
        String url = scan.nextLine();
        return searchService.searchOrganizationsByField(url, ORGANIZATIONS_URL);
      case 3:
        String externalId = scan.nextLine();
        return searchService.searchOrganizationsByField(externalId, ORGANIZATIONS_EXTERNAL_ID);
      case 4:
        String name = scan.nextLine();
        return searchService.searchOrganizationsByField(name, ORGANIZATIONS_NAMES);
      case 5:
        String domainNames = scan.nextLine();
        return searchService.searchOrganizationsByField(domainNames, ORGANIZATIONS_DOMAIN_NAMES);
      case 6:
        String details = scan.nextLine();
        return searchService.searchOrganizationsByField(details, ORGANIZATIONS_DETAILS);
      case 7:
        String sharedTickets = scan.nextLine();
        return searchService.searchOrganizationsByField(sharedTickets, ORGANIZATIONS_SHARED_TICKETS);
      case 8:
        String tag = scan.nextLine();
        String[] tags;
        tags = tag.split(",");
        List<String> tagList = new ArrayList<String>();
        for (String value : tags) {
          tagList.add(value);
        }
        return searchService.searchOrganizationsByField(tags, ORGANIZATIONS_TAGS);
      default:
        System.out.println(" Please enter valid choice");
        return null;
    }
  }
  
}
