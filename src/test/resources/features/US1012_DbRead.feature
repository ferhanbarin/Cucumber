Feature: US1012 Kullanici CH database'ini test eder.

  Scenario: TC18 CH Databese Read Test
    
    Given Kullanici CHQA database'ine baglanir.
    Then Kullanici "tHOTELROOM" tablosundaki "Price" verilerini alir.
    And Kullanici "Price" sütunundaki verileri okur ve istedigi islemleri yapar.