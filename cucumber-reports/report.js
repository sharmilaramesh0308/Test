$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:Test/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successfull login",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Enter \"Sam\" and \"abcd123\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Step.credentials(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login",
  "keyword": "When "
});
formatter.match({
  "location": "Step.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Home page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Step.home_page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
});