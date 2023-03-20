@newfolder
Feature: User can create a new folder

@MEETS10-316
Scenario: User can create a new folder
  Given the user is on the dashboard page
  When the user click on the files button
  And the user clicks the + icon
When user see new file section on the dropdown
And user clicks new file
When the user enters a name  for the new folder
And the user clicks the arrow icon to create the folder
Then the new folder should be created successfully


  @MEETS10-318
  Scenario: User can not create a folder with a name that already exists
    Given the user is on the dashboard page
    When the user click on the files button
    And the user has already created a folder with name TestFolder
    When the user attempts to create a folder with name TestFolder
    Then the user should see an error message TestFolder already exists

  @MEETS10-319
  Scenario: User can create multiple folder
    Given the user is on the dashboard page
    When the user click on the files button
    And the user clicks the + icon
    When user see new file section on the dropdown
    And user clicks new file
    When the user enters a name  for the new folder
    And the user clicks the arrow icon to create the folder
    And the user repeats the above steps with a different unique name for the new folder
    Then the second new folder should be created successfully























