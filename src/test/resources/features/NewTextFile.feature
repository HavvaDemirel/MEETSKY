
Feature: User create a new text document
@MEETS10-326
  Scenario: User creates a new text document successfully
    Given the user is on the dashboard page
    When the user click on the files button
    And the user clicks the + icon
    When user clicks new text file
    Then the file is created successfully and user is in the text file
    And user can see the file in the file page
  @MEETS10-327
  Scenario: User can not create a new text document with same name successfully
    Given the user is on the dashboard page
    When the user click on the files button
    And the user clicks the + icon
    When user clicks new text file
    Then the file is created successfully and user is in the text file
    And the user clicks the + icon
    When user clicks new text file with same name
    And user can see file name is existing message
