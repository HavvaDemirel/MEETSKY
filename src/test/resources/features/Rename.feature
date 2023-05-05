

Feature: User can rename a file
  US: As a user, I should be able to add a file to favorites, rename any file and give some comments on any file.
  @wip
  Scenario: user can rename a file
Given the user is on the dashboard page
When the user click on the files button
When the user selects an item by clicking on the three dots menu
And the user clicks rename button
Then the selected item name should be changed