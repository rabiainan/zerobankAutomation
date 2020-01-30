
Feature:  Authorize users login
Background:
  Given  the user is on the login page

  Scenario:  Account summary page display
    When   the user logs in  using "username" and "password"
    Then   user should be on the account summary page

  Scenario: Login with blank username and password
    When the user logs in  using "" and ""
    Then as an error message "Login and/or password are wrong." should be display

  Scenario: Login with invalid username and password
    When the user logs in  using "asda" and "123"
    Then as an error message "Login and/or password are wrong." should be display

