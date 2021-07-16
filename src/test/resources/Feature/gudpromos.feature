Feature: To check the functionality of My Gud Promos

@Regpromo
Scenario Outline: To check the liked promos are getting reflected in My Gud Promos
Given user is in GudSho App and logged in 
When  user enters "<sho name>" in flicks page search 
And  verify user navigates to the show details page and view the latest promos  
And user views the promos and click like for promos
And verify the liked promos is there in My Gud Promos 

Examples:
|sho name|
|Baahubali|
|Eeram|

@Unregpromo
Scenario Outline: To check the liked promos are getting reflected in My Gud Promos
Given user has to there in GudSho App
When user enters "<sho name>" in flicks page search
And  verify user navigates to the show details page and view the latest promos
And user views the promos and click like for promos
And navigate the user to login and enters the valid credentials
And verify the liked promos is there in My Gud Promos

Examples:
|sho name|
|Avengers|