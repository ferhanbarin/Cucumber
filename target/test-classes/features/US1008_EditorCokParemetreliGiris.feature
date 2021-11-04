Feature: US1008 editor sayfasina farkli kullanicilar ekleyebilmeliyim.

  @Editor2
  Scenario Outline: TC12 Editor sayfasina farkli kisiler ekleme.

    Given Kullanici "EditorURL" sayfasina gider.
    Then New butonuna basar.
    And Editor ilgili kutulara "<firstName>" "<lastName>" "<position>" "<office>" "<extension>" "<startDate>" "<salary>" bilgilerini girer.
    Then Create tusuna basar.
    And Sayfayi kapatir.





    Examples:
      |firstName|lastName|position|office|extension|startDate|salary|
      |Oguz   |Ferhan    |TestLead|Finland  |124     |2021-01-01|90000|
      |Yunus  |Emirhan   |Developer|Poland  |126     |2021-01-01|150000|
      |Mehmet |Ali       |QA       |Turkey  |130     |2021-01-01|70000|