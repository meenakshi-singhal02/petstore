@store @petstore
Feature: Verify user should able to access pet information and able to perform get and post operation on it 
	
	@getPetDetails 
  Scenario: User should able to fetch pet details on the basis of provided parameter	
    Given I navigate API to "petURL" and should able to see pet details
    
  @addNewPet
  Scenario: User should able to add new pet to store	
    Given I navigate API to "petURL" and successfully added new pet 
    
    
