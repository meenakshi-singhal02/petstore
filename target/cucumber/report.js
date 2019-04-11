$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("PetDetails.feature");
formatter.feature({
  "line": 2,
  "name": "Verify user should able to access pet information and able to perform get and post operation on it",
  "description": "",
  "id": "verify-user-should-able-to-access-pet-information-and-able-to-perform-get-and-post-operation-on-it",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@store"
    },
    {
      "line": 1,
      "name": "@petstore"
    }
  ]
});
formatter.before({
  "duration": 18492000,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should able to fetch pet details on the basis of provided parameter",
  "description": "",
  "id": "verify-user-should-able-to-access-pet-information-and-able-to-perform-get-and-post-operation-on-it;user-should-able-to-fetch-pet-details-on-the-basis-of-provided-parameter",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@getPetDetails"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I navigate API to \"petURL\" and should able to see pet details",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "petURL",
      "offset": 19
    }
  ],
  "location": "stepDefinition.i_navigate_API_to_and_should_able_to_see_pet_details(String)"
});
formatter.result({
  "duration": 2473128900,
  "status": "passed"
});
formatter.after({
  "duration": 78900,
  "status": "passed"
});
formatter.before({
  "duration": 302600,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "User should able to add new pet to store",
  "description": "",
  "id": "verify-user-should-able-to-access-pet-information-and-able-to-perform-get-and-post-operation-on-it;user-should-able-to-add-new-pet-to-store",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@addNewPet"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I navigate API to \"petURL\" and successfully added new pet",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "petURL",
      "offset": 19
    }
  ],
  "location": "stepDefinition.i_navigate_API_to_and_successfully_added_new_pet(String)"
});
formatter.result({
  "duration": 614749499,
  "status": "passed"
});
formatter.after({
  "duration": 47200,
  "status": "passed"
});
formatter.uri("PetInventory.feature");
formatter.feature({
  "line": 2,
  "name": "Verify user should able to access pet inventory",
  "description": "",
  "id": "verify-user-should-able-to-access-pet-inventory",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@petInventory"
    },
    {
      "line": 1,
      "name": "@petstore"
    }
  ]
});
formatter.before({
  "duration": 866699,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should able to get all pet details from inventory",
  "description": "",
  "id": "verify-user-should-able-to-access-pet-inventory;user-should-able-to-get-all-pet-details-from-inventory",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@getAllPetsDetails"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I navigate API to \"petInventoryURL\" and successfully able to fetch all pet details",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "petInventoryURL",
      "offset": 19
    }
  ],
  "location": "stepDefinition.i_navigate_API_to_and_successfully_able_to_fetch_all_pet_details(String)"
});
formatter.result({
  "duration": 595771500,
  "status": "passed"
});
formatter.after({
  "duration": 46800,
  "status": "passed"
});
formatter.uri("UserOperations.feature");
formatter.feature({
  "line": 2,
  "name": "Verify user should able to access pet inventory",
  "description": "",
  "id": "verify-user-should-able-to-access-pet-inventory",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@userOperation"
    },
    {
      "line": 1,
      "name": "@petstore"
    }
  ]
});
formatter.before({
  "duration": 710799,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should able to get user detail",
  "description": "",
  "id": "verify-user-should-able-to-access-pet-inventory;user-should-able-to-get-user-detail",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@getUserDetails"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I navigate API to \"userOperationsURL\" and successfully able to see user information",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "userOperationsURL",
      "offset": 19
    }
  ],
  "location": "stepDefinition.i_navigate_API_to_and_successfully_able_to_see_user_information(String)"
});
formatter.result({
  "duration": 320600,
  "status": "passed"
});
formatter.after({
  "duration": 54400,
  "status": "passed"
});
});