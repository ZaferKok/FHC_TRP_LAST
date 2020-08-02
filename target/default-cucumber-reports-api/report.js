$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features.Api/PutRequest.feature");
formatter.feature({
  "name": "ApiCheck",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@put"
    }
  ]
});
formatter.scenario({
  "name": "Positive",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@put"
    }
  ]
});
formatter.step({
  "name": "Change the 10th id information",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitionsApi.PutRequest.change_the_10th_id_information()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "change the id number to 27",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitionsApi.PutRequest.change_the_id_number_to(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "title to \"Sdet\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitionsApi.PutRequest.title_to(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Completed to false",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitionsApi.PutRequest.completed_to_false()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that all changes were applied",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitionsApi.PutRequest.verify_that_all_changes_were_applied()"
});
formatter.result({
  "status": "passed"
});
});