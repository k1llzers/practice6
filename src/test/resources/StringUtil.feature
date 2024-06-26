Feature: Reverse String

  Scenario Outline: Reverse string using StringUtil
    Given the input string is "<input>"
    When I reverse the string
    Then the result should be "<expected>"

    Examples:
      | input  | expected |
      | Hello  | olleH    |
      | World  | dlroW    |
      | Cucumber | rebmucuC |