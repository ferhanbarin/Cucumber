@Paralel2
Feature: US1005 Amazon'da liste ile arama.

  Scenario Outline: TC09 Amazon'da verilen bir listeyi aratip, var olduklarini test ediniz.

    Given Kullanici "AmazonURL" sayfasina gider.
    Then "<arananUrun>" icin arama yapar.
    And Sonuc sayisini yazdirir.
    And Sonucun "<arananUrun>" icerdigini test eder.
    Then Sayfayi kapatir.

    Examples:
    |arananUrun|
    |Nutella   |
    |JAVA      |
    |iPod      |
    |Armut     |
    |Apple     |