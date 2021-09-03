Feature: DemoQA - Elements page

    Scenario: Text Box
    Given  User was in Text Box
    When User set personal information
    And User click Submit button
    Then User will see personal information

Scenario: Check Box
  Given User was in Check Box page
  And User click expand all button
  When User select  one by one the item.
#  |Item      |
#  |Notes     |
# |React     |
#  |Classified|
  Then User will see a message with the information of selected items

#Scenario: Radio Button
#  When User is clicking Radio Button
#  And User click the following buttons:
#  |Yes       |
#  |Impressive|
#  Then User will see the following messages:
#    |You have selected Yes       |
#    |You have selected Impressive|
#Scenario: Web Tables
#  When User is Clicking in Web Tables
#  And User fill a new registration
#  Then USer will see a new registered in table
#  When User is clicking in Edit Icon of the New registrated
#  And User change the Last name
#  Then User will see the new changes in the user
#  And User click in Delete Icon
#  Then user deleted will not display in table list

#Scenario: Buttons
#  When User is Clicking in Buttons
#  And User Click in the following buttons list:
#  |Double Click Me|
#  |Right Click Me |
#  |Click Me       |
#  Then User will see the following messages:
#    |You have done a double click  |
#    |You have done a right click   |
#    |You have done a dynamic click |
