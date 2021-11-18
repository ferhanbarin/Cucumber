
Feature: US1013 Kullanici DB Util ile CH database'ini test eder.
  @DBUtill
  Scenario: TC19 DB Util ile CH Databese Read Test

    Given Kullanici DBUtill ile CHQA database'ine baglanir.
    Then Kullanici DBUtill ile "tHOTELROOM" tablosundaki "Price" verilerini alir.
    And Kullanici DBUtill ile "Price" sütunundaki 5. fiyatin 470 oldugunu test eder.


    @DBUpdate
    Scenario: Kullanici tHOTEL tablosundan istedigi e-maili update eder.

    Given Kullanici DBUtill ile CHQA database'ine baglanir.
    Then  DBU IDHotel degeri 1016 olan kaydin e-mail degerini "elveda@gmail.com" yapar.