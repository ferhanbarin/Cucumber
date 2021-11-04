Feature: US1007 editor sayfasina farkli kullanicilar ekleyebilmeliyim.

  @Editor
  Scenario Outline: TC11 Editor sayfasina farkli kisiler ekleme.

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
    And Sayfayi kapatir.



    Examples:
    |firstName|lastName|position|office|extension|startDate|salary|
    |Oguz   |Ferhan    |TestLead|Finland  |124     |12.01.2021|90000|
    |Yunus  |Emirhan   |Developer|Poland  |126     |12.01.2021|150000|
    |Mehmet |Ali       |QA       |Turkey  |130     |12.01.2021|70000|
