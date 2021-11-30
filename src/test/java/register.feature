Feature: Register Test Scenario Outline

  Scenario Outline: Create An Account

    Given Navigate to Website
    And click Sign in button
    And type email "<Email>"
    And click on Create an Account button
    And type firstname "<firstname>" and lastname "<lastname>"
    And type password "<password>"
    And type Company "<company>"
    And type address "<address>"
    Examples:
      | Email         | firstname | lastname | password | company     | address  |
      | tb5@gmail.com | tb5       | bt       | tbtbt    | TechnoStudy | asdf asd |
      | tb6@gmail.com | tb6       | bt       | tbtbt    | TechnoStudy | asdf asd |
      | tb7@gmail.com | tb7       | bt       | tbtbt    | TechnoStudy | asdf asd |
      | tb8@gmail.com | tb8       | bt       | tbtbt    | TechnoStudy | asdf asd |

    # Birden fazla parametre göndermeyeceksem OUTLINE ın bir anlamı yok