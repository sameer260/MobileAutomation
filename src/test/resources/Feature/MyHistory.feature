Feature: To check the functionality of my history

@History
  Scenario Outline: To check the played movies are reflecting in my history
    Given user is in to gudsho with valid credentials
     When search <moviename>
      And verify the user can see the show detail page
      And verify the user can play the movie
      And verify the movie is getting played
     Then verify the played <moviename> is in my history
     
Examples:
|moviename|
|Interstellar-English|

@Histoyclear
Scenario: To check user can clear all my history
    Given user is in to gudsho with valid credentials
     When user is in me section
      And user enters my history
      And verify the movie names
      And verify the user can able to clear all my history
     Then verify the toast messege in my history
     
@Singlehistoryclear
Scenario Outline: To check user can clear particular sho from my history
    Given user is in to gudsho with valid credentials
     When user is in me section
      And user enters my history
      And verify the user can able to see sho names in my history
      And verify the user can able to clear <wantedsho> from my history
     Then verify the toast messege for single sho clear
     
     Examples:
    |wantedsho|
    |Interstellar-English|
