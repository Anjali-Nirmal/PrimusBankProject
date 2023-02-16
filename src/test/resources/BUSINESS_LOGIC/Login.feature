Feature: Login Functionality

Background: User is on main page
Given User launch browser with exe as "F:\\Automation Support\\chromedriver.exe"
Given User provide url as "http://www.primusbank.qedgetech.com/"

Scenario: Login functionality with valid credentials
When user provide "Admin" as username
When user provide "Admin" as password
When user click on login button
Then application shows user profile to user