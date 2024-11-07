Feature: Mercury Travels Site Testing 
Scenario: Mercury Travels 
	Given user is on title page launchbrowser	
	Then Select destination from "MercuryHome_page.destination_dropdown" 
	Then Select duration from "MercuryHome_page.duration_dropdown" 
	Then Select start date from "MercuryHome_page.date_dropdown" 
	Then select type of holiday from "MercuryHome_page.holidayfrom_dropdown"
	Then click on search icon "MercuryHome_page.Search_textbox" 
	
	
