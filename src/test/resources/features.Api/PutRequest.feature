@put
Feature: ApiCheck
  Scenario: Positive
    Given Change the 10th id information
    And change the id number to 27
    And title to "Sdet"
    And Completed to false
    Then verify that all changes were applied
