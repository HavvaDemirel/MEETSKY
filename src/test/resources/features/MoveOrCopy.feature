
@MEETS10
Feature: Move selected items to a folder
User can move or copy any selected item to any folder

  Background:
    Given the user is on the dashboard page
    When the user click on the files button
    When the user selected an item by clicking tree dots
    And the user clicks move or copy button
    When the user see the choose target folder window

@MEETS10-329
  Scenario: User moves a selected item to a folder
    And user selects a target file and click move to target folder
    Then the selected item should be removed from its original location
    And the selected item should appear in the destination folder


@MEETS10-331
  Scenario: User copy a selected item to any folder
    And user selects a target file and click copy to target folder
    Then the selected item should stay its original location
    And the selected item should appear in the destination folder

@MEETS10-343
  Scenario: User move a selected item to new folder
    And the user click plus button in the target file
    When the user enter any name
    And click create button
    Then user is in the new folder
    When user click move button
    Then the selected item should  move from its original location
    Then a new folder created and appear in the files page
    And the selected item should appear in the new folder

  @MEETS10-344
  Scenario: User copy a selected item to new folder
    And the user click plus button in the target file
    When the user enter any name
    And click create button
    And user is in the new folder
    When user click copy button
    Then the selected item should stay its original location
    And the selected item should appear in the new folder







