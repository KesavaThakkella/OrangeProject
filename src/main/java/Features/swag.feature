Feature: Swag Page Automtaion login
Scenario: Check able to login to swag page successfully
 	Given User is on log page
	When User enters valid "<username>" and "<password>"
	And Clicks on Login button
	Then Enter "<Firstname>" and "<Lastname>" and "<Zipcode>"in check out screen

