Feature: http Get Request 

  Scenario: Get the list of Users
    Given  get url
    
    Scenario: Get Single User
    Given  get the url
    
    Scenario:  Single User Not Found
    Given  get this url
    
    Scenario:  Get List Resource
    Given  get list url
    
    Scenario:  Get Single Resource
    Given  get single resource  url
    
     Scenario:  Single Resource Not Found
    Given  get single resource not found  url
    
     Scenario:  Get Delayed Resposne
    Given  get delayed response url
      