Feature: Manage address functionality

Background: User cancelled initial login window
Given User provide browser name as "Chrome" and exe location
Given user enters url as
Given user cancel initial login window
When user navigate on login tab
When user click on my profile
When user enter "8329567336" as username
When user enter "Aeiou4$#" as password
When user click on login button
@RegressionTest
Scenario: Manage Address functionality with valid credentials
When user click on Manage Address
When user click on Add address
When user enter"Sagar" as name
When user enter"9890355946"as mobile number
When user enter"413704"as pincode
When user enter"near ssvmk"as locality
When user enter"khadambe khurd"as adreess
