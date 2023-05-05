
@reg
Feature: use can add commend
  US: As a user, I should be able to add a file to favorites, rename any file and give some comments on any file.

  @wip
  Scenario: User can add a comment to any file

       Given the user is on the dashboard page
       When the user click on the files button
       When the user selects an item by clicking on the three dots menu
       And the user clicks details button
       Then the file details menu opened right side
       When the user clicks commend button
       And user adds any commend
       And  the user clicks on the post comment button
       Then the comment should be added to the file

  Scenario: Delete a comment on a file
    Given the user is on the dashboard page
    When the user click on the files button
    When the user selects an item by clicking on the three dots menu
    And the user clicks details button
    Then the file details menu opened right side
    When the user clicks commend button
    And user adds any commend
    And  the user clicks on the post comment button
    Then the comment should be added to the file
    And the user clicks three dots menu on the commend
    And the user clicks delete commend button
    Then user see comment deleted message
