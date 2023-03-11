Feature: To Validate the Flipkart Application

  Background:

    Given Launch the Flipkart Application
    When Close the popup
    Then It should Navigate to the Home page


    Scenario:To validate the search functionality

      Given enter the Text in the search field
      When Click the search button
      Then It should navigate to the search result page and display the relevant details

      Scenario Outline: To validate the search functionality with different values

        Given Enter the "<searchtext>" in the search field
        When click the search button
        Then It should Navigate to the next page and display the corresponding page

        Examples:
          | Searchtext |
          | Mobile     |
          | TV         |
          | Speaker    |
          | Shirt      |


