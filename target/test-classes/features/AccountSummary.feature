  @wip
Feature: Account Summary Features
 Background:
   Given the user is on the login page
   When  the user logs in  using "username" and "password"
    Scenario: Account summary page title


      Then the page title should be "Zero - Account Summary"

   Scenario: the user check account types and credit accounts table columns
 
     Then the page title should be "Zero - Account Summary"
     When account type should be as listed below

       |Cash Accounts      |
       |Investment Accounts|
       |Credit Accounts    |
       |Loan Accounts      |

    Then credit accounts table should have the columns as lited below

      |Account      |
      |Credit Card  |
      |Balance      |
