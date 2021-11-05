@TopluCalistirma
Feature: US1002 Amazon Background Ile Arama

    Background: Amazon sayfasina gitme.
        When Kullanici amazon sayfasina gider.


    Scenario: TC04 Amazon Nutella Arama

    And Nutella icin arama yapar.
    Then Sonucun Nutella icerdigini test eder.
    And Sayfayi kapatir.



    Scenario: TC05 Amazon JAVA Arama

    And JAVA icin arama yapar.
    Then Sonucun JAVA icerdigini test eder.
    And Sayfayi kapatir.



    Scenario: TC06 Amazon iPad Arama

    And iPad icin arama yapar.
    Then Sonucun iPad icerdigini test eder.
    And Sayfayi kapatir.