#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)


#Sample Feature Definition Template
Feature: Google Search functions


  @tag1
  Scenario: Seacrh Java Tutorial
    Given User is on Google home page
    When User search Java Tutorial
    Then Should display Java Tutorial page
    
    Scenario: Seacrh Selenium Tutorial
    Given User is on Google home page
    When User search Selenium Tutorial
    Then Should display Selenium Tutorial page
    
# sample for data driven
  #@tag2
  #Scenario Outline: Title of your scenario outline
   # Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step

   # Examples: 
    #  | name  | value | status  |
     # | name1 |     5 | success |
      #| name2 |     7 | Fail    |