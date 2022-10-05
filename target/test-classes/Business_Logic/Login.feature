
Feature: Login functionality

Background: User cancelled initial login window
Given User provide browser name as "Chrome" and exe location 
Given user enters url as 
Given user cancel initial login window

@smoketest
Scenario: Login functionality with valid credentials
When user navigate on login tab
When user click on my profile
When user enter "8329567336" as username
When user enter "Aeiou4$#" as password
When user click on login button
Then Application shows user profile to user
 