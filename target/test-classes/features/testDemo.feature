Feature: Featuire to test the Testdemo page
  
  Scenario Outline: Validate the login credentials test project site
    Given The Browser should open
    And Enter the URL
    When Enter the "<username>" and "<password>"
    And Click the Login page
    Then User Verify success message
    Examples: 
      |username|password | 
      |Stephn	 |12345 |
      
	Scenario Outline: verify the search details page
	
		When User select "<Address>"and"<Email>"and"<Phone Number>" 
		And User click on save button
		Then User Click the logout button
		
	Examples: 
      |Address|Email | Phone Number|
      |123, main street Hill bunk|Test123@gmail.com |9876787657|