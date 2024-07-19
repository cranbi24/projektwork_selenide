Feature: Product search

  Rule: If I search for a product, it will be displayed in the result page

    Background:
      Given I open Tesco webshop website
      And I accept all cockies

    Scenario Outline: Search for a "<product>"
      Given search field is visible
      When I search for a "<product>"
      Then "<number>" of products shows in the result page
      And productname containes "<product>"

      Examples:
        | product | number |
        | dinnye  | 26     |
       # | dió      | 7      |
        #| szalvéta | 17     |
