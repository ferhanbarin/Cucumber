@TopluCalistirma
Feature: US1001 Amazon Arama

    @Amazon @Nutella
    Scenario: TC01 Amazon Nutella Arama

    When Kullanici amazon sayfasina gider.
    And Nutella icin arama yapar.
    Then Sonucun Nutella icerdigini test eder.
    And Sayfayi kapatir.


    @Amazon @JAVA
    Scenario: TC02 Amazon JAVA Arama

    When Kullanici amazon sayfasina gider.
    And JAVA icin arama yapar.
    Then Sonucun JAVA icerdigini test eder.
    And Sayfayi kapatir.


    @Amazon @iPad
    Scenario: TC03 Amazon iPad Arama

    When Kullanici amazon sayfasina gider.
    And iPad icin arama yapar.
    Then Sonucun iPad icerdigini test eder.
    And Sayfayi kapatir.

