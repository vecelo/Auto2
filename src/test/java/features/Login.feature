Feature: Application login

  Scenario: Homepage default login

    Given User is on Landing page
    When User login into application with username and password
    Then Home page is displayed
    And Portal text is displayed