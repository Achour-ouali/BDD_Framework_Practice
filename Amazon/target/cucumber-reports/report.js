$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/java/Features/TodaysDealsPage.feature");
formatter.feature({
  "name": "Search product on amazon todays deals",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Iam at amzon.con home page",
  "keyword": "Given "
});
formatter.match({
  "location": "step_deffinitions.TodaysDealaPage_stepDeffinition.iam_at_amzon_con_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on todays deals",
  "keyword": "When "
});
formatter.match({
  "location": "step_deffinitions.TodaysDealaPage_stepDeffinition.i_click_on_todays_deals()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on subscribe to get the page",
  "keyword": "And "
});
formatter.match({
  "location": "step_deffinitions.TodaysDealaPage_stepDeffinition.i_click_on_subscribe_to_get_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click to get back to the main page",
  "keyword": "Then "
});
formatter.match({
  "location": "step_deffinitions.TodaysDealaPage_stepDeffinition.i_click_to_get_back_to_the_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});