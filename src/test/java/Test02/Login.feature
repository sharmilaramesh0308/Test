
Feature: Login
 
  Scenario Outline: Successfull login
  Given Enter the "<name>" 
  And Enter the "<Password>" in the field
  When click on login
  Then Home page is displayed
  
  Examples:
  |name |password|
  |sam  |abcd123 |
  |ram  |silver1 |