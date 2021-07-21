Feature: To test login app

Scenario: To validate Login application

Given login page
When I enter valid UserName "Admin"
And I enter valid Password "admin123"
And click Submit
Then Login Successfull