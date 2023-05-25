Feature: Test Google Search funtionality

Scenario: As a user i enter a search criteria in google
   Given I am on the Google search page
   Then I enter a search criteria
   And Click on the search button
   When The result mach the criteria