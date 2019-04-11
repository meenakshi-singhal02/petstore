@petInventory @petstore
Feature: Verify user should able to access pet inventory 
	
  @getAllPetsDetails
  Scenario: User should able to get all pet details from inventory	
    Given I navigate API to "petInventoryURL" and successfully able to fetch all pet details 
    
    
    
