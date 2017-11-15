Feature:  Test Google Home page Functionality
  Scenario:  Test functionality of Google Search
    Given User Should be able to open the Browser
    When User Enters the Google Home page url
    And User Enters Random Value on Search bar
    And User press Enter
    Then Result should be displayed
