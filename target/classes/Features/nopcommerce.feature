Feature: Nop commerce site testing 
Scenario: Testing the NOP Commerce site 
	Given if user is on admin area demo page launch browser
	When Enter email "NopcommerceHome_page.email_textbox" and password "NopcommerceHome_page.pass_textbox" 
	Then Click on login button "NopcommerceHome_page.login_button"
	Then Click on sales "Sales_Homepage.salesmenu" and orders "Orders_Homepage.orderstab"
	Then Get the order numbers from orders table 
	
	