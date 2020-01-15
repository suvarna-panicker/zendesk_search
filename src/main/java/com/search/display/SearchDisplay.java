package com.search.display;

import com.search.model.Organizations;
import com.search.model.Tickets;
import com.search.model.Users;

public class SearchDisplay {
  
  public static final String USERS = "USERS";
  public static final String TICKETS = "TICKETS";
  public static final String ORGANIZATIONS = "ORGANIZATIONS";
  
  public static final String USERS_ID = "_id";
  public static final String USERS_URL = "url";
  public static final String USERS_EXTERNAL_ID = "external_id";
  public static final String USERS_NAME = "name";
  public static final String USERS_ALIAS = "alias";
  public static final String USERS_CREATED_AT = "created_at";
  public static final String USERS_ACTIVE = "active";
  public static final String USERS_VERIFIED = "verified";
  public static final String USERS_SHARED = "shared";
  public static final String USERS_LOCALE = "locale";
  public static final String USERS_TIMEZONE = "timezone";
  public static final String USERS_LAST_LOGIN_AT = "last_login_at";
  public static final String USERS_EMAIL = "email";
  public static final String USERS_PHONE = "phone";
  public static final String USERS_SIGNATURE = "signature";
  public static final String USERS_ORGANIZATION_ID = "organization_id";
  public static final String USERS_TAGS = "tags";
  public static final String USERS_SUSPENDED = "suspended";
  public static final String USERS_ROLE = "role";
  
  public static final String ORGANIZATIONS_ID = "_id";
  public static final String ORGANIZATIONS_URL = "url";
  public static final String ORGANIZATIONS_EXTERNAL_ID = "external_id";
  public static final String ORGANIZATIONS_NAMES = "name";
  public static final String ORGANIZATIONS_DOMAIN_NAMES = "domain_names";
  public static final String ORGANIZATIONS_CREATED_AT = "created_at";
  public static final String ORGANIZATIONS_DETAILS = "details";
  public static final String ORGANIZATIONS_SHARED_TICKETS = "shared_tickets";
  public static final String ORGANIZATIONS_TAGS = "tags";
  
  public static final String TICKETS_ID = "_id";
  public static final String TICKETS_URL = "url";
  public static final String TICKETS_EXTERNAL_ID = "external_id";
  public static final String TICKETS_CREATED_AT = "created_at";
  public static final String TICKETS_TYPE = "type";
  public static final String TICKETS_SUBJECT = "subject";
  public static final String TICKETS_DESCRIPTION = "description";
  public static final String TICKETS_PRIORITY = "priority";
  public static final String TICKETS_STATUS = "status";
  public static final String TICKETS_SUBMITTER_ID = "submitter_id";
  public static final String TICKETS_ASSIGNEE_ID = "assignee_id";
  public static final String TICKETS_ORGANIZATION_ID = "organization_id";
  public static final String TICKETS_TAGS = "tags";
  public static final String TICKETS_HAS_INCIDENTS = "has_incidents";
  public static final String TICKETS_DUE_AT = "due_at";
  public static final String TICKETS_VIA = "via";
  
  public static void displaySearchTypes() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Enter the file to search on \n1.")
        .append(USERS)
        .append("\n2.")
        .append(TICKETS)
        .append("\n3.")
        .append(ORGANIZATIONS)
        .append("\n4.To exit");
    System.out.println(stringBuilder.toString());
  }
  
  public static void displayUsersFields() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Enter the field to search  USERS on \n1.")
        .append(USERS_ID)
        .append("\n2.")
        .append(USERS_URL)
        .append("\n3.")
        .append(USERS_EXTERNAL_ID)
        .append("\n4.")
        .append(USERS_NAME)
        .append("\n5.")
        .append(USERS_ALIAS)
        .append("\n6.")
        .append(USERS_CREATED_AT)
        .append("\n7.")
        .append(USERS_ACTIVE)
        .append("\n8.")
        .append(USERS_VERIFIED)
        .append("\n9.")
        .append(USERS_SHARED)
        .append("\n10.")
        .append(USERS_LOCALE)
        .append("\n11.")
        .append(USERS_TIMEZONE)
        .append("\n12.")
        .append(USERS_LAST_LOGIN_AT)
        .append("\n13.")
        .append(USERS_EMAIL)
        .append("\n14.")
        .append(USERS_PHONE)
        .append("\n15.")
        .append(USERS_SIGNATURE)
        .append("\n16.")
        .append(USERS_ORGANIZATION_ID)
        .append("\n17.")
        .append(USERS_TAGS)
        .append("\n18.")
        .append(USERS_SUSPENDED)
        .append("\n19.")
        .append(USERS_ROLE);
    
    System.out.println(stringBuilder.toString());
  }
  
  public static void displayOrganizationsField() {
    
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Enter the field to search  ORGANIZATIONS on \n1.")
        .append(ORGANIZATIONS_ID)
        .append("\n2.")
        .append(ORGANIZATIONS_URL)
        .append("\n3.")
        .append(ORGANIZATIONS_EXTERNAL_ID)
        .append("\n4.")
        .append(ORGANIZATIONS_NAMES)
        .append("\n5.")
        .append(ORGANIZATIONS_DOMAIN_NAMES)
        .append("\n6.")
        .append(ORGANIZATIONS_CREATED_AT)
        .append("\n7.")
        .append(ORGANIZATIONS_DETAILS)
        .append("\n8.")
        .append(ORGANIZATIONS_SHARED_TICKETS)
        .append("\n9.")
        .append(ORGANIZATIONS_TAGS);
    System.out.println(stringBuilder.toString());
  }
  
  public static void displayTicketsFields() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Enter the field to search  TICKETS on \n1.")
        .append(TICKETS_ID)
        .append("\n2.")
        .append(TICKETS_URL)
        .append("\n3.")
        .append(TICKETS_EXTERNAL_ID)
        .append("\n4.")
        .append(TICKETS_CREATED_AT)
        .append("\n5.")
        .append(TICKETS_TYPE)
        .append("\n6.")
        .append(TICKETS_SUBJECT)
        .append("\n7.")
        .append(TICKETS_DESCRIPTION)
        .append("\n8.")
        .append(TICKETS_PRIORITY)
        .append("\n9.")
        .append(TICKETS_STATUS)
        .append("\n10.")
        .append(TICKETS_SUBMITTER_ID)
        .append("\n11.")
        .append(TICKETS_ASSIGNEE_ID)
        .append("\n12.")
        .append(TICKETS_ORGANIZATION_ID)
        .append("\n13.")
        .append(TICKETS_TAGS)
        .append("\n14.")
        .append(TICKETS_HAS_INCIDENTS)
        .append("\n15.")
        .append(TICKETS_DUE_AT)
        .append("\n16.")
        .append(TICKETS_VIA);
    
    System.out.println(stringBuilder.toString());
    
  }
  
  public static void displayUser(Users user) {
    if (null == user) {
      System.out.println("Empty User returned\n");
    } else {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("User returned with the following attributes\n")
          .append(USERS_URL).append(" ").append(user.getUrl()).append("\n")
          .append(USERS_ID).append(" ").append(user.getId()).append("\n")
          .append(USERS_ALIAS).append(" ").append(user.getAlias()).append("\n")
          .append(USERS_SHARED).append(" ").append(user.isShared()).append("\n")
          .append(USERS_SUSPENDED).append(" ").append(user.isSuspended()).append("\n")
          .append(USERS_TAGS).append(" ").append(user.getTags().toString()).append("\n")
          .append(USERS_VERIFIED).append(" ").append(user.isVerified()).append("\n")
          .append(USERS_EXTERNAL_ID).append(" ").append(user.getExternalId()).append("\n")
          .append(USERS_ORGANIZATION_ID).append(" ").append(user.getOrganization_id()).append("\n")
          .append(USERS_ACTIVE).append(" ").append(user.isActive()).append("\n")
          .append(USERS_CREATED_AT).append(" ").append(user.getCreatedAt()).append("\n")
          .append(USERS_EMAIL).append(" ").append(user.isEmail()).append("\n")
          .append(USERS_LAST_LOGIN_AT).append(" ").append(user.isLastLoginAt()).append("\n")
          .append(USERS_LOCALE).append(" ").append(user.isLocale()).append("\n")
          .append(USERS_NAME).append(" ").append(user.getName()).append("\n")
          .append(USERS_PHONE).append(" ").append(user.isPhone()).append("\n")
          .append(USERS_ROLE).append(" ").append(user.getRole()).append("\n")
          .append(USERS_SIGNATURE).append(" ").append(user.isSignature()).append("\n")
          .append(USERS_TIMEZONE).append(" ").append(user.isTimezone()).append("\n");
      System.out.println(stringBuilder.toString());
    }
  }
  
  public static void displayTicket(Tickets ticket) {
    if (null == ticket) {
      System.out.println("Empty Ticket returned\n");
    } else {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Ticket returned with the following attributes\n")
          .append(TICKETS_STATUS).append(" ").append(ticket.getStatus()).append("\n")
          .append(TICKETS_TAGS).append(" ").append(ticket.getTags().toString()).append("\n")
          .append(TICKETS_ASSIGNEE_ID).append(" ").append(ticket.getAssigneeId()).append("\n")
          .append(TICKETS_EXTERNAL_ID).append(" ").append(ticket.getExternalId()).append("\n")
          .append(TICKETS_HAS_INCIDENTS).append(" ").append(ticket.isHasIncidents()).append("\n")
          .append(TICKETS_ORGANIZATION_ID).append(" ").append(ticket.getOrganizationId()).append("\n")
          .append(TICKETS_SUBMITTER_ID).append(" ").append(ticket.getSubmitterId()).append("\n")
          .append(TICKETS_ID).append(" ").append(ticket.getId()).append("\n")
          .append(TICKETS_CREATED_AT).append(" ").append(ticket.getCreatedAt()).append("\n")
          .append(TICKETS_DESCRIPTION).append(" ").append(ticket.getDescription()).append("\n")
          .append(TICKETS_DUE_AT).append(" ").append(ticket.getDueAt()).append("\n")
          .append(TICKETS_PRIORITY).append(" ").append(ticket.getPriority()).append("\n")
          .append(TICKETS_SUBJECT).append(" ").append(ticket.getSubject()).append("\n")
          .append(TICKETS_TYPE).append(" ").append(ticket.getType()).append("\n")
          .append(TICKETS_URL).append(" ").append(ticket.getUrl()).append("\n")
          .append(TICKETS_VIA).append(" ").append(ticket.getVia()).append("\n");
      System.out.println(stringBuilder.toString());
    }
  }
  
  public static void displayOrganization(Organizations organization) {
    if (null == organization) {
      System.out.println("Empty Organization returned\n");
    } else {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Organization returned with the following attributes\n")
          .append(ORGANIZATIONS_DETAILS).append(" ").append(organization.getDetails()).append("\n")
          .append(ORGANIZATIONS_NAMES).append(" ").append(organization.getName()).append("\n")
          .append(ORGANIZATIONS_TAGS).append(" ").append(organization.getTags().toString()).append("\n")
          .append(ORGANIZATIONS_DOMAIN_NAMES).append(" ").append(organization.getDomainNames()).append("\n")
          .append(ORGANIZATIONS_EXTERNAL_ID).append(" ").append(organization.getExternalId()).append("\n")
          .append(ORGANIZATIONS_SHARED_TICKETS).append(" ").append(organization.isSharedTickets()).append("\n")
          .append(ORGANIZATIONS_ID).append(" ").append(organization.getId()).append("\n")
          .append(ORGANIZATIONS_URL).append(" ").append(organization.getUrl()).append("\n")
          .append(ORGANIZATIONS_CREATED_AT).append(" ").append(organization.getCreatedAt()).append("\n");
      System.out.println(stringBuilder.toString());
    }
  }
  
}
