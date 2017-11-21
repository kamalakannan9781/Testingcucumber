$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Gmail.feature");
formatter.feature({
  "line": 1,
  "name": "Serve coffee",
  "description": "  Coffee should not be served until paid for\r\n  Coffee should not be served until the button has been pressed\r\n  If there is no coffee left then money should be refunded",
  "id": "serve-coffee",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Buy last coffee",
  "description": "",
  "id": "serve-coffee;buy-last-coffee",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "there are 1 coffees left in the machine",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I have deposited 1$",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I press the coffee button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should be served a coffee",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 10
    }
  ],
  "location": "filesteps.there_are_coffees_left_in_the_machine(int)"
});
formatter.result({
  "duration": 109079992,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 17
    }
  ],
  "location": "filesteps.i_have_deposited_$(int)"
});
formatter.result({
  "duration": 199743,
  "status": "passed"
});
formatter.match({
  "location": "filesteps.i_press_the_coffee_button()"
});
formatter.result({
  "duration": 56055,
  "status": "passed"
});
formatter.match({
  "location": "filesteps.i_should_be_served_a_coffee()"
});
formatter.result({
  "duration": 57633,
  "status": "passed"
});
});