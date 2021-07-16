
Feature: To check the paywall concept on  flicks page
 
@PaywallFlicksBookmark
  Scenario Outline: To check the user can access flicks page by paywall concept
    Given user is in gudsho app
     When verify search field is working
      And verfiy user enter a <moviename>
     Then verify the login popup is appearing for watchlist
     
Examples:
|moviename|
|Joker|

@PaywallFlicksStudiofollow
Scenario: To check the user can view the studio by paywall concept in flicks page
    Given user is in gudsho app
     When verify user can able to see the trending studio
      And verify user can to follow the studio
     Then verify the login popup is appearing for following studio

@PaywallFlickspromos
Scenario Outline: To check the user can view the promos in flicks page by paywall concept
    Given user is in gudsho app
     When verify the user able to search a <wantedsho>
      And verify the user can able click guds for promos
     Then verify the login popup is appearing for gud promos
 
Examples:
|wantedsho|
|mayakkam ena|
     
@PaywallFLickssho
Scenario Outline: To check the user can view the show in flicks page by paywall concept
    Given user is in gudsho app
     When user search <desiredsho>
      And verify user can buy the sho
     Then verify the login popup is appearing for buying a movie

Examples:
|desiredsho|
|Trolls| 
     
     
     