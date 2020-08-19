#Autor: Kristelle Young

@Stories
Feature: Automatation Demo Site
  Carlos as a user, want to search on Web Automatation Demo Site and create a valid user

  @Scenario1
  Scenario Outline: Login to the aplication

    Given He Navigate to the page

    When He log in on the page
      |name   |lastname  |adress  |email  |phone   |languages  |skills  |country  |secondcountry  |year  |month  |day  |pass  |secondpass  |
      |<name> |<lastname>|<adress>|<email> |<phone>|<languages>|<skills>|<country>|<secondcountry>|<year>|<month>|<day>|<pass>|<secondpass>|



    Then He verify the web with a text - Double Click on Edit Icon to EDIT the Table Row.

    Examples:
      |name     |lastname       |adress     |email         |phone       |languages|skills|country|secondcountry|year|month|day|pass |secondpass   |
      |Castores |Cascarrabias   |San Antonio|ab@example.com |2222782222 |French   |iPhone|Panama |Japan        |1970|May  |7  |1234Aa|1234Aa       |