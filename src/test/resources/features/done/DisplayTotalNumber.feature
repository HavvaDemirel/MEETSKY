@display
Feature:Display total number of file
  User can see the total number of files and folders under the files list table

@MEETS10-320
Scenario: Display total number of files and folders
  Given the user is on the dashboard page
  When the user click on the files button
  Then the user should be able to see the total number of files and folders under the files list table

  @MEETS10-321
Scenario: Display updated total number of files and folders after adding new file
  Given the user is on the dashboard page
  When the user click on the files button
  Then the user should be able to see the total number of files and folders under the files list table
  When the user adds a new file or folder and see the updated total number of files and folders under the list table

  @MEETS10-322
Scenario: Display updated total number of files and folders after deleting a file
  Given the user is on the dashboard page
  When the user click on the files button
  Then the user should be able to see the total number of files and folders under the files list table
  When the user delete a file or folder  and see the updated total number of files and folders under the list table
