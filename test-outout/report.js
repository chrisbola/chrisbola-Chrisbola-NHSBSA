$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("EligibilityChecker.feature");
formatter.feature({
  "line": 1,
  "name": "Eligibility Checker",
  "description": "\r\nAs a person from Wales \r\nI need to know what help I can get with my NHS costs\r\nSo that I can get the treatment I need",
  "id": "eligibility-checker",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 7,
  "name": "Check that a user is eligible to get help",
  "description": "",
  "id": "eligibility-checker;check-that-a-user-is-eligible-to-get-help",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I am a person from Wales",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I put my circumstances into the Checker tool",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I should get a result of whether I will get help or not",
  "keyword": "Then "
});
formatter.match({
  "location": "EligibilityChecker.i_am_a_person_from_Wales()"
});
formatter.result({
  "duration": 10418201100,
  "status": "passed"
});
formatter.match({
  "location": "EligibilityChecker.i_put_my_circumstances_into_the_Checker_tool()"
});
formatter.result({
  "duration": 7836803500,
  "status": "passed"
});
formatter.match({
  "location": "EligibilityChecker.i_should_get_a_result_of_whether_I_will_get_help_or_not()"
});
formatter.result({
  "duration": 356590600,
  "status": "passed"
});
});