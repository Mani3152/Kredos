
Feature: Macro Frame
 

  Scenario Outline: Create Duplicate Message in Macro Frame
    Given click on MessageBuilder
    When enter the <message> in MessageBox
    And click on plus icon
    And click on duplicate message button
    And click on save button for duplicate macro
    And click on canvas button for duplicate macro
    Then check the duplicate message in drafts

    Examples: 
     |   message          |
     | "Hi Duplicate msg" |