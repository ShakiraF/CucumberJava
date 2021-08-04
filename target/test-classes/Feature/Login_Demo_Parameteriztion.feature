
@LoginDemo_Parameters
Feature: Login Demo using Parametrization

@LoginDemo_Parameters
  Scenario Outline: Validation of  Login Demo using Parametrization
    Given I Launch URL
    #Then I verify the TestProject Example page is displayed
    When I enter <username > and <password >
    And I click on Login button
    
    

    Examples: 
  		|username | password  |
      | Shakira | 12345 | 