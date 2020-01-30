$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AccountSummary.feature");
formatter.feature({
  "name": "Account Summary Features",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user logs in  using \"username\" and \"password\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefs.the_user_logs_in_using_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Account summary page title",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "the page title should be \"Zero - Account Summary\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountSummaryStepDefs.the_page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user logs in  using \"username\" and \"password\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefs.the_user_logs_in_using_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "the user check account types and credit accounts table columns",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "the page title should be \"Zero - Account Summary\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountSummaryStepDefs.the_page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "account type should be as listed below",
  "rows": [
    {
      "cells": [
        "Cash Accounts"
      ]
    },
    {
      "cells": [
        "Investment Accounts"
      ]
    },
    {
      "cells": [
        "Credit Accounts"
      ]
    },
    {
      "cells": [
        "Loan Accounts"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AccountSummaryStepDefs.account_type_should_be_as_listed_below(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "credit accounts table should have the columns as lited below",
  "rows": [
    {
      "cells": [
        "Account"
      ]
    },
    {
      "cells": [
        "Credit Card"
      ]
    },
    {
      "cells": [
        "Balance"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "AccountSummaryStepDefs.credit_accounts_table_should_have_the_columns_as_lited_below(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});