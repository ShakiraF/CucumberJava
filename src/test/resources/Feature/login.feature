Feature: First cucumber Program
@smoke
  Scenario: Login functionlity
    Given I launch Url
    When I enter username and password
    And I click on Login button
    Then I verify Home page is  displayed  