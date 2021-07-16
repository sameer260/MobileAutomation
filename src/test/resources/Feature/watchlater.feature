Feature: To check the functionality of watch later

@Bookmark
  Scenario Outline: To check whether the user can able to watch a sho or seris later
    Given user is logged in to gudsho with valid credentials
     When verify the user can enter a <wantedmoviename> in search box
      And verify the user navigates to the show detail page
      And user bookmark the movie
      And user click the my watch list
     Then verify the <wantedmoviename> is in the watch list
  
     Examples: 
      | wantedmoviename |
      | Joker           |
      
      
@Deletebookmark
  Scenario Outline: To check whether the user can able to delete a sho or seris
    Given user is logged in to gudsho with valid credentials
     When verify the user can enter a <wantedmoviename> in search box
      And verify the user navigates to the show detail page
      And user bookmark the movie
      And user click the my watch list
      And verify the user can able to click edit option on my watch history
     Then verify the user can able to delete the <wantedmoviename> from the watch list

 Examples: 
      | wantedmoviename |
      | Joker           |