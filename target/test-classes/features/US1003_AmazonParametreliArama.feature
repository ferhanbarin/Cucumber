Feature: US1003 Kullanici istedigi kelime icin arama yapip, sonucu test eder.

  Scenario: TC07 istenen kelimenin oldugunu test etme.

    Given Kullanici "AmazonURL" sayfasina gider.
    And "Nutella" icin arama yapar.
    Then Sonucun "Nutella" icerdigini test eder.
    And Sayfayi kapatir.

    # Parametre olarak yazdigimiz kelimeyi StepDefinition'da String olarak kullanacaksa ne yazdigimiz önemli degildir.

    # Ancak eger parametre olarak yazdigimiz kelimeyi configuration.properties'den alacaksak burada yazdigimiz parametre'nin configuration.properties'deki yazim ile ayni olmasi gerekir.
    # "AmazonURL" gibi. Eger yazim farkli olursa nullPointerException verir.

    # Buradaki parametre ile configuration.properties'deki key ayni olduktan sonra StepDefinition'da parametre adi olarak yazdigimizin bir önemi olmaz.