
Feature: Login
 
 @smoke
  Scenario: Successfull login
  Given Enter "Sam" and "abcd123"
  When click on login
  Then Home page is displayed
@sanity  
  Scenario: Successfull login
  Given Enter Credentials
  When click on login
  Then Home page is not displayed
  
  
  

 