Feature: To check the contents on studio details

@Studioinfo
  Scenario Outline: To check the studio info
    Given user is in to gudsho
     When <studioname> for studio details scenario
      And user is in the studio detail page
     Then verify the user can able to see the <studioname> studio info
  
    Examples: 
      | studioname     |
      | QA Studios     |
      | Naveen         |