Feature: To test login app

Scenario: To validate Login application

Given login page
When I enter valid UserName "Admin"
And I enter valid Password "admin122"
And click Submit
Then Login Successfull