
Feature: To validate the Valid and Invalid login

  Background:
    Given Launch Application

  @Smoke
  Scenario Outline: Successful login with correct credentials
    Given I am on the login page
    When I enter my username and password as'<username>' and '<password>'
    And I click the Log In button
    And I should see a Dashboard
    Examples:
      | username |  password |
      | Admin12    | admin123  |

  @Smoke
  Scenario Outline: Unsuccessful login with incorrect credentials
    Given I am on the login page
    When I enter incorrect username and password '<username>' and '<password>'
    And I click the Log In button
    Then I should stay on the login page
    And I should see an error message
    Examples:
      | username |  password |
      | Admin12    | admin123  |