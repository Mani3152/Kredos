Feature: Macro Frame

  Scenario Outline: Creating Macro Frame with Message
    Given click_on_Messagebuilder
    When write some <message> inside the macroframe message box
    And click on save button
    Then click on canvas button
    And check whether it is created in the Draft page

    Examples: 
      | message        |
      | "hi demoworld" |
