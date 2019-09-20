
Feature: Login
 
  Scenario: Successfull login
  Given I want create an account 
  When I enter my data
  |name |password|
  |sam  |abcd123 |
  |ram  |silver1 |
  Then I verify the account
  
  