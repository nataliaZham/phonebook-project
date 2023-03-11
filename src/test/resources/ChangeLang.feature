Feature: Change language

  Background:
    Given I am logged in

  Scenario Outline:Language change check
    When I click on change language button
    And I choose <language> language
    Then I see <the following text> the following text

    Examples:
      | language | the following text |
      | English  | My profile         |
      | Russian  | Мой профиль        |
      | German   | Mein Profil        |
      | Ukraine  | Мій профіль        |