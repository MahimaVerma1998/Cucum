Feature: http Get Request 

  Scenario: Get the list of Users
    Given  get url1
    
    Scenario: Get Single User
    Given  get the url1
    
    Scenario:  Single User Not Found
    Given  get this url1
    
    Scenario:  Get List Resource
    Given  get list url1
    
    Scenario:  Get Single Resource
    Given  get single resource  url1
    
     Scenario:  Single Resource Not Found
    Given  get single resource not found  url1
    
     Scenario:  Get Delayed Resposne
    Given  get delayed response url1
      