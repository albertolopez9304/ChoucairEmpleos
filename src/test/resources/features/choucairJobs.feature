# Autor: Luis Lopez
  @stories
  Feature: Tests from the jobs section on the page https://www.choucairtesting.com/
    As a user, I want to automate the website in the jobs section
  @scenario1
  Scenario Outline: Verify keyword and location search
    Given that Luis wants to enter the page
    When he enter the jobs menu
    And perform a search by keyword and city
    |city     |keywords|
    |<city>     |<keywords>|
    Then he can see on the screen the job searched with the <keywords>

    Examples:
      |city     |keywords|
      |Medellín |Analista de Pruebas Medellín y Bogotá|


    @scenario2
    Scenario Outline: Apply jobs Choucair
      Given that Luis wants to enter the page
      When he enter the jobs menu
      And perform a search by keyword and city
        |city       |keywords  |
        |<city>     |<keywords>|
      And he applies for employment and diligence his data
        |name  |email|phone|formalStudies|certifiedExperience|knowAutomation|wageAspiration|timeAvailability|additionalMessage|
        |<name>|<email>|<phone>|<formalStudies>|<certifiedExperience>|<knowAutomation>|<wageAspiration>|<timeAvailability>|<additionalMessage>|
      Then he verifies the <message> on the screen

      Examples:
        |city     |keywords                             |name              |email                 |phone     |formalStudies|certifiedExperience|knowAutomation         |wageAspiration|timeAvailability|additionalMessage|message                 |
        |Medellín |Analista de Pruebas Medellín y Bogotá|Luis Lopez Cardona|luialberto93@gmail.com|3013964652|Profesional  |No tengo           |Si me gustaria aprender|$2,5000,000   |7 dias          |...              |"CV" is a required field|

