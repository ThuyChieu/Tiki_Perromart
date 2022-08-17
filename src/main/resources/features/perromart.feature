Feature: PerroMart Demo

  Scenario Outline: Check out cart
    Given I go to "https://perromart.com.sg/" website
    When I navigate to page food
    And I send keyword "<searchProduct>" to search engine and click search button
    And I click product name "<productName>"
    And I add to cart and click cart button
    Then I verify that product have been added with correct "<productName>" name
    Examples:
      | searchProduct | productName
      | Bronco Salmon | Bronco Jerky Salmon Dog Treat 70g

  Scenario Outline: Check out information
    Given I go to "https://perromart.com.sg/" website
    And I send keyword "<productName>" to search engine and click search button
    And I click product name "<productName>"
    And I add to cart and click cart button
    And I click check out button
    And I input "<email>", "<firstName>", "<lastName>", "<address>", "<apartment>", "<portalCode>", "<phoneNumber>" and click continue to shipping button
    Then I verify that "<email>", "<address>, <apartment>, Singapore <portalCode>" is correct
    Examples:
      | searchProduct | productName                                         | quantity | email                | firstName | lastName | address   | apartment  | portalCode | phoneNumber |
      | Meat          | Absolute Holistic Air Dried Red Meat Cat Treats 50g | 15       | example@selenium.com | Kei       | Ichiro   | Tras Link | PoSingSing | 520147     | 0888888888  |