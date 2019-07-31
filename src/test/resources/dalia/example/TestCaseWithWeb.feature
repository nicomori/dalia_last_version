@example
Feature: Interview Nicolas Mori

  Scenario Outline: Dalia interview job with Nicolas Mori

    Given access to the chrome
    Then access to this url "<url>"
    Then in the page 1, make click in the checkbox and click in the button next 
    Then in the page 2, select a radio button and click in the button next 
    Then in the page 3, select 3 checkboxes and click in the button next 
    Then in the page 4, select 1 checkbox and click in the button next 
    Then in the page 5, set some text, and click in the button next 

    Examples: 
      | url						 | 
      | https://surveyinterface-v2.opinionsample.com/#/surveys/ab320070-bbad-0134-bb62-0a6b3886cf3d/init?publisher_user_id=07bfe320-86d2-0131-c9aa-0a424708edaa&panel_user_id=PANEL_USER_TEST_c75236c0-bbad-0134-bbe2-0a6b3886cf3d&panel_user_id_kind=PANEL_USER_KIND_TEST&pparam_offer_click_id=OFFER_CLICK_TEST_c75236c0-bbad-0134-bbe2-0a6b3886cf3d&is_test=true	 | 