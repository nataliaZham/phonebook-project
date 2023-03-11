Feature: Login Page

  Background:
    Given I am on the Login Page

  Scenario Outline: Input invalid email
    When I input <invalid email> invalid email
    Then I see error message
    """
    Email must be a valid email address.
    """
    Examples:
      | invalid email  |
      | test@          |
      | test@com       |
      | test@gmail     |
      | testgmail.com  |
      | @gmail.com     |
      | test@gmail,com |
      | test@gmail=com |


  Scenario: Input empty email
    When I input empty email
    Then I see error message
      """
      Email is required.
      """

  Scenario Outline: Input long password
    When I input <long password> long password
    Then I see error message
    """
    Password must be no longer than 20 characters.
    """
    Examples:
      | long password          |
      | testpassword123456789  |
      | testpassword1234567890 |

  Scenario Outline: Input short password
    When I input <short password> short password
    Then I see error message
      """
      Password must be at least 8 characters.
      """
    Examples:
      | short password |
      | 1234567        |
      | 12345          |

