Feature: Login into Application

Scenario Outline: Positive test validating login
Given Initialize the browser with chrome
And Navigate to "https://www.rediff.com/" Site
And Click to Login link in home page to land on Secure sign in Page
When User enters <username> and <password> logs in
Then Verify  that is successfully logged in
And Close  browsers

Examples:
|username         |password       |
|mailmerishi2020  |Pankaj@10146   |
|test123          |12345          |