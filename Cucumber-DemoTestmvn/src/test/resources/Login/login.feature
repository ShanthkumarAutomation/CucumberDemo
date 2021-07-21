Feature: Login

Background:
Given Login page


#Scenario: To Login with valid input
#When I enter valid UserName "Admin"
#And I enter valid Password "admin123"
#And click Submit
#Then I should see user name as "Welcome Paul"


#Scenario: To Login with valid input
#When I enter valid UserName "Admin"
#And I enter valid Password "admin123"
#And click Submit
#Then I should see user name as "Welcome Paul"


Scenario Outline: To test Login with Different Data

When Enter Valid Name "<name>"
And Enter Valid password "<pwd>"
And click submit
Then I should see username as "<loginname>"

#This will be like a data driven test
Examples:
|name |pwd      |loginname|
|Admin|admin123 |Welcome TestFN|
|Admin|admin123 |Welcome TestFN|

Scenario: To Login with Invalid Credentials
When I enter Invalid UserName "Shanth"
And I enter Invalid Password "Shanth"
And click submit
Then I should see user name as "Invalid credentials"