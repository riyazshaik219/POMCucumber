$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("F:/POMCucumber/src/main/java/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Free Crm Application Test",
  "description": "",
  "id": "free-crm-application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Validate Free Crm page test",
  "description": "",
  "id": "free-crm-application-test;validate-free-crm-page-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user is on login page",
  "keyword": "Then "
});
formatter.step({
  "line": 5,
  "name": "user logs into application",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "validate homepage title",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "validate logged in username",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageTest.user_opens_browser()"
});
formatter.result({
  "duration": 49870481643,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageTest.user_is_on_login_page()"
});
formatter.result({
  "duration": 549852703,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageTest.user_logs_into_application()"
});
formatter.result({
  "duration": 1521429045,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageTest.validate_homepage_title()"
});
formatter.result({
  "duration": 14441536,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageTest.validate_logged_in_username()"
});
formatter.result({
  "duration": 6202082044,
  "status": "passed"
});
});