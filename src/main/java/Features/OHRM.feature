Feature: OHRM web Site 
Scenario: OHRM Testing
	Given user is on Admin OrangeHRM page launch browser	
	When Enter User name "OrangeHome_page.Ouser_textbox" and Password "OrangeHome_page.Opassword_textbox"  
	Then user clicks on Login "OrangeHome_page.Ologin_button"
	Then Recruiter clicks on Recruitment menu "OrangeHome_page.Recruitment_menu"
	And user clicks on userdropdown menu "OrangeHome_page.oxd-userdropdown-name"
	