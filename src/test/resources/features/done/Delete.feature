@MEETS10-324
Feature: Delete Selected Item
  User can delete any selected item from its three dots menu
  Scenario: Delete selected item
    Given the user is on the dashboard page
    When the user click on the files button
    When the user selects an item by clicking on the three dots menu
    And selects Delete folder button
    Then the selected item should be deleted from files page