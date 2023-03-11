Feature: Password recovery

  Background:
    Given I am on the Password recovery page

  Scenario: Password recovery with existing user
    When I input existing email
    And I click on Send button
    Then I see successful message sending
    """
  Password recovery instructions have been sent to
    """

  Scenario: Password recovery with nonexisting user
    When I input nonexisting email
    And I click on Send button
    Then I see unsuccessful message sending
      """
      Error! This user doesn't exist in our DB
      """
