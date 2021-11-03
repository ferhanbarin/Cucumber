Feature: US1003 Kullanici istedigi kelime icin arama yapip, sonucu test eder.

  Scenario: TC07 istenen kelimenin oldugunu test etme.

    Given Kullanici amazon sayfasina gider.
    And "Nutella" icin arama yapar.
    Then Sonucun "Nutella" icerdigini test eder.
    And Sayfayi kapatir.
