Feature:  Items
@WhenDo
  Scenario:  Create Item

    Given i have the whenDo app opened
    And i create an item using
      | title | Titulo1 |
      | note  | description de la nota |
    Then the item "Titulo1" should be displayed
