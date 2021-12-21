Feature:  Items
@WhenDo
  Scenario:  Create Item

    Given i have the whenDo app opened
    And i create an item using
      | title | ThisExample |
      | note  | description |
    Then the item "ThisExample" should be displayed
