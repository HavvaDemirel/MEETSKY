Feature: User can add any file to favorites from its own three dots menu
  US: As a user, I should be able to add a file to favorites, rename any file and give some comments on any file.

  Scenario: User can add any file to favorite

    Given the user is on the dashboard page
  When the user click on the files button
  When the user selects an item by clicking on the three dots menu
  And the user clicks add favorite button
  And the user select favorites file
  Then the selected item should be appears in the favorites file

