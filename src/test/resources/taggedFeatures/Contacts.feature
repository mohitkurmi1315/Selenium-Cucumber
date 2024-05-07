@PhaseOne
Feature: Contacts CRUD Management

@SmokeTest @RegressionTest
Scenario: Create a new con
Given User is logged in
When User create a con

@RegressionTest
Scenario: view con
Given User is logged in
When User view con details

Scenario: Delete a con
Given User is logged in
When User Delete a con