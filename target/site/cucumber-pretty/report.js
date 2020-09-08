$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AccountManagement.feature");
formatter.feature({
  "line": 2,
  "name": "Account Management",
  "description": "",
  "id": "account-management",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@AccountManagement"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Create An Account",
  "description": "",
  "id": "account-management;create-an-account",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on create an account page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user inputs their \"\u003cFirstName\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enter the \"\u003cLastName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user adds the \"\u003cEmail\u003e\" Address",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user enters a \"\u003cPassword\u003e\" on create account page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user reenters to confirm that \"\u003cConfirmPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user now clicks on the CreateAnAccount",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user MyAccount page is displayed.",
  "rows": [
    {
      "cells": [
        "FirstName",
        "LastName",
        "Email",
        "Password",
        "ConfirmPassword"
      ],
      "line": 15
    },
    {
      "cells": [
        "Sayo",
        "Adeayo",
        "sayoade@hotmail.com",
        "shortshorT04",
        "shortshorT04"
      ],
      "line": 16
    }
  ],
  "keyword": "Then "
});
});