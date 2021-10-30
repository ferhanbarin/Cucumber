Feature: US1001 Amazon Arama

  @Amazon
  Scenario: TC01 Amazon Nutella Arama

    When Kullanici amazon sayfasina gider.
    And Nutella icin arama yapar.
    Then Sonucun Nutella icerdigini test eder.
    And Sayfayi kapatir.
