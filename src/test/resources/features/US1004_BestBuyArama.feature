@Paralel2
Feature: US1004 Ebay sayfasinda kelime arama.
  
  Scenario: TC08 kullanici Ebay'da istedigi kelimeyi aratip test eder.

    # Bu test calismaz.
    Given Kullanici "EbayURL" sayfasina gider.
    Then "Nutella" icin arama yapar.
    And Sonucun "Nutella" icerdigini test eder.
    Then Sayfayi kapatir.

    # Burada tüm StepDefinition'lar tanimli gibi görünse de testimiz calismaz. Cünkü arama yapar ve sonucu test eder StepDefinition'lari Amazon sayfasina göre locate edilmisti.
    # Burada yeniden locate etmemiz gerekirken ayni cümleyi yazmamiz icin bizden yeni StepDefinition istemedi. Bu yüzden Gherkin ile yazdigimiz cümlelerin tam tanimlayici olmasi önemlidir.