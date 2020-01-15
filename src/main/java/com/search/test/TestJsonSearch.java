package com.search.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.search.model.Organizations;
import com.search.model.Users;
import com.search.service.SearchService;
import com.search.service.SearchServiceImpl;
import org.json.simple.parser.JSONParser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileReader;

import static com.search.display.SearchDisplay.ORGANIZATIONS_NAMES;

public class TestJsonSearch {
  
  Organizations[] organizations;
  SearchService searchService;

@Before
  public void init(){
  JSONParser parser = new JSONParser();
   searchService = new SearchServiceImpl();
  File file = new File("src/main/resources/organizations.json");
  try {
    String content = parser.parse(new FileReader(file.getAbsolutePath())).toString();
    ObjectMapper mapper = new ObjectMapper();
     organizations = mapper.readValue(content, Organizations[].class);
  }
  catch(Exception e){
    System.out.println(" Testing failed due to " + e);
  }
  searchService.initializeSearchMaps(organizations, null, null);
}

@Test
public void testSearchId(){
  Organizations organizations  = searchService.searchOrganizationById(101);
  Assert.assertNotNull(organizations);
}
  
  @Test
  public void testSearchField(){
    Organizations organizations  = searchService.searchOrganizationsByField("Plasmos", ORGANIZATIONS_NAMES);
    Assert.assertEquals(103, organizations.getId().intValue());
  }
  
  @Test
  public void testEmptyMapper(){
  try {
    Users users = searchService.searchUsersById("test");
    Assert.assertNull(users);
  }
  catch(Exception e) {
    Assert.assertNull(e.getMessage());
  }
  }
  
  @Test
  public void testNullField() {
    try {
      Organizations organizations = searchService.searchOrganizationsByField("Plasmos", null);
      Assert.assertEquals(103, organizations.getId().intValue());
    } catch (Exception e) {
      Assert.assertNull(e.getMessage());
    }
  }

}
