Feature: US1006 Concort Hotel sayfasinda farkli kullanici idlari ile negative test.

  @CH
  Scenario Outline: TC10 Farkli kullanici isimleri ile negative test.

    Given Kullanici "CHQAURL" sayfasina gider.
    Then CH Login linkine tiklar.
    And CH Username kutusuna "<wrongUserName>" yazar.
    And CH Password kutusuna "<wrongPassword>" yazar.
    And CH Login butonuna basar.
    Then Giris yapilamadigini test eder.
    And Sayfayi kapatir.

    Examples:
    |wrongUserName|wrongPassword|
    |Manager5     | Manager5!   |
    |Manager6     | Manager6!   |
    |Manager7     | Manager7!   |
    |Manager8     | Manager8!   |
    |Manager9     | Manager9!   |