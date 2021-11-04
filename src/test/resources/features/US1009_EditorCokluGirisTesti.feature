Feature: US1009 editor sayfasina farkli kullanicilar ekleyebilmeliyim.

  @Editor
  Scenario Outline: TC13 Editor sayfasina farkli kisiler ekleme.

    Given Kullanici "EditorURL" sayfasina gider.
    Then New butonuna basar.
    And Editor firstname kutusuna "<firstName>" bilgileri girer.
    And Editor lastname kutusuna "<lastName>" bilgileri girer.
    And Editor position kutusuna "<position>" bilgileri girer.
    And Editor office kutusuna "<office>" bilgileri girer.
    And Editor extension kutusuna "<extension>" bilgileri girer.
    And Editor startdate kutusuna "<startDate>" bilgileri girer.
    And Editor salary "<salary>" bilgileri girer.
    Then Create tusuna basar.
    Then "<firstName>" ve "<lastName>" girerek kaydin tamamlandigini test eder.



      Examples:
      |firstName|lastName|position|office|extension|startDate|salary|
      |Oguz   |Ferhan    |TestLead|Finland  |124     |2021-01-01|90000|
      |Yunus  |Emirhan   |Developer|Poland  |126     |2021-01-01|150000|
      |Mehmet |Ali       |QA       |Turkey  |130     |2021-01-01|70000|