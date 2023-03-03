Feature: Login into the website

  Scenario: Successful login with credentials
    Given Juanito is on the advantageDemo home page
    When he login with his credentials
    Then he should see his username