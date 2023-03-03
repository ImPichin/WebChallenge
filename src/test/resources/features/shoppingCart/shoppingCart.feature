Feature: Add items to shopping cart

  Background:
    Given Juanito is on the advantageDemo home page

  Scenario:
    And he login with his credentials
    When add products to his shopping cart
    Then should see the total price