
Feature: Account Activity Page Features
Background:
  Given the user is on the login page
  When the user logs in  using "username" and "password"

  Scenario: Account activity page title

    Then user should be on the account summary page
    And the user navigate to Account Activity page
    Then the page title should be "Zero - Account Activity"

   Scenario: Verify account drop down option and taransaction table columns name
     And "Accounts" dropdown menu is show "Saving" as a default value
     And the dropdown should have fallowing options

       |Savings     |
       |Checking    |
       |Loan        |
       |Credit Card |
       |Brokerage   |

    Then transaction table should have following columns name
      |Date        |
      |Description |
      |Deposit     |
      |Withdrawal  |


