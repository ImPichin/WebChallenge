Feature: Make payment for the products

  Background:
    Given Juanito is on the advantageDemo home page
    And he login with his credentials


  Scenario:
    And add products to his shopping cart
    When he makes the payment for his products
    Then should see the order payment