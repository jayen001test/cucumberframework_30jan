Feature: Verify the loginpage functionality 

#Background: User is logged in to the application
#Given User is on login page 



Scenario: Check login is successful with valid cred
Given User is on login page
When User enters valid username and password 
And Clicks on login button 
Then User is on home page 
And Close the browser 


Scenario Outline: Check login is successful with mutiple cred 
Given User is on login page 
When User enters valid username as "<username>" and password as "<password>"
And Clicks on login button 
And Close the browser 

Examples:

| username | password |
| Admin    | admin123 |
| jayen     | Jayen123  | 
 

Scenario: Check homepage functionality
Given User is on login page
When User enters valid username and password 
And Clicks on login button 
Then User is on home page 
When  click on userdropdown
Then Click on logout button
And Close the browser 
