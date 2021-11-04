Feature: US1011 kullanici dogru bilgilerle sayfaya girebilmeli.

  Scenario: TC17 Positive Login Test
    When Kullanici "CHQAURL" sayfasina gider.
    Then CH Login linkine tiklar.
    And CH Username kutusuna "manager" yazar.
    And CH Password kutusuna "Manager1!" yazar.
    And CH Login butonuna basar.
    Then CH basarili giris yapildigini test eder.
    