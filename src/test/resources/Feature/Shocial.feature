Feature: To check the functionality of flicks page
 
@RegFlicksBookmark
  Scenario Outline: To check the user can access flicks page
    Given user is logged in to gudsho app
     When verify search field is working in flicks page
      And verfiy user can bookmark a desired <moviename>
     Then verify the <moviename> is in watch list
     
Examples:
|moviename|
|Joker|

@RegFlicksStudio
Scenario: To check the user can view and follow studio in flicks page
    Given user is logged in to gudsho app
     When verify user can able to view the sudios tab
      And verify user can follow the studio in studio detail page
     Then verify the studio name in following studio

@RegFlicksPromos
Scenario Outline: To check the user can view give guds to the promos in flicks page
    Given user is logged in to gudsho app
     When verify the user can get in <desiredsho>
      And verify  the user can able to give guds for promos
     Then verify the liked promos are in my gud promos
     
 Examples:
|desiredsho|
|Trolls|    
       
@RegFlickssho
Scenario: To check the user can view the show and buy in flicks page
    Given user is logged in to gudsho app
     When verify the user can able to see all the shos
      And verify user can buy the sho in sho detail page
     Then verify the user can able to buy a movie and watch