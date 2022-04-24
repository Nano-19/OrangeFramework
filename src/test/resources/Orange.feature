Feature: Orange test cases
  Scenario: TC01_Search Orange Web page in Google
    Given I am in the "GooGleWebPage"
    When I search "Orange" Web page
    And Enter in the Orange Url
    Then I check if I am in the principal page and the "Orange España" text appears

  Scenario: TC02_Try Orange Incorrect login
    Given I am in the "OrangeWebPage"
    When I click in "Particulares" Dropdown
    Then Click in the clients area
    And Try Login with a no register user "666666666" "test"
    Then Error "Usuario/Contraseña incorrectos." appears

  Scenario: TC03_Check the correct price of mobile fare
    Given I am in the "OrangeWebPage"
    When I click in fares Button
    Then I select mobile fare
    And The first fare has a 29 € price