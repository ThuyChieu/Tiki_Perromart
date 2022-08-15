Feature: PerroMart Demo

  Scenario Outline: Check out cart
    Given I go to "https://perromart.com.sg/" website
    When I enter keyword "<searchProduct>" to search box and click search button
    And I click product named "<productName>"
    And I enter "<quantity>" to quantity field, click Add to cart button and click cart button
    Then I verify that "<productName>" have been added with correct "<quantity>" value
    Examples:
      | searchProduct | productName                                       | quantity |
      | Bronco Salmon | Bronco Salmon Olio Dog Wet Food 390g              | 5        |
#      | Aatas         | Aatas Cat Fresh Beads Deodorizer Baby Powder 450g | 1M       |


  Scenario Outline: Check out information
    Given I go to "https://perromart.com.sg/" website
    When I enter keyword "<searchProduct>" to search box and click search button
    And I click product named "<productName>"
    And I enter "<quantity>" to quantity field, click Add to cart button and click cart button
    And I click check out button
    And I enter "<email>", "<firstName>", "<lastName>", "<address>", "<apartment>", "<portalCode>", "<phoneNumber>" and click Continue to shipping button
    Then I verify that "<email>", "<address>, <apartment>, Singapore <portalCode>" is correct
    Examples:
      | searchProduct | productName                                         | quantity | email                | firstName | lastName | address   | apartment  | portalCode | phoneNumber |
      | Meat          | Absolute Holistic Air Dried Red Meat Cat Treats 50g | 15       | example@selenium.com | Kei       | Ichiro   | Tras Link | PoSingSing | 520147     | 0888888888  |