Feature: To check the functionality of following studio

@Regfollow
  Scenario Outline: To check whether the user can able to follow the studio
    Given user is logged in to gudsho with valid credentils
     When user is in the search tab
      And user enters the <wantedstudioname>
      And verify the user navigates to the studio detail page and user clicks follow button
      And verify the follow should be changed Following
     Then verify the <wantedstudioname> in Shocial section
  
    Examples: 
      | wantedstudioname          | 
      | Naveen | 
  
  @Unregfollow
  Scenario Outline: To check whether the user can able to follow the studio
    Given user is in the gudsho app
     When user is in the search tab
      And user enters the <wantedstudioname>
      And verify the user navigates to the studio detail page and user clicks follow button
      And verify the login popup appears and user enters the valid credentials
      And verify the follow should be changed Following
     Then verify the <wantedstudioname> in Shocial section
  
    Examples: 
      | wantedstudioname          | 
      | QA Studios | 
  
  @InvalidData
  Scenario Outline: To check the no results in search
    Given user is in the gudsho app
     When user is in the search tab
      And Trying to enter the invalid <studioname> in search bar
     Then verify the no search result in studio search
  
    Examples: 
      | studioname  | 
      | qwety       | 
      | shfjdnjcjsu | 
      | sufsjfifsk  | 
      
      
	@Studiolistfromstudiotab
 Scenario: To list out the studios from studio tab
    Given user is in the gudsho app
     When user is in the studios tab
      And verify the studio name in the studio tab
     Then print the studios name
     
   @Studiofolllowfromlist
  Scenario Outline: verify the user can follow a studio from studio tab
    Given user is logged in to gudsho with valid credentils
     When user is in the studios tab
      And verify the studio name in the studio section
      And verify the user can able to Follow the <wantedstudioname> in studio tab
     Then verify the <wantedstudioname> in me section following studios
     
     Examples: 
     |wantedstudioname|
     |Falcon Studios|
