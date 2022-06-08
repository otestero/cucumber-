Feature: USORN1009_DataTables sitesine 5 farkli giris yapar


  Scenario: TC14 5 farkli kayit girisi


    When kullanici "datatableUrl" icin arama yapar
    Then new butonuna basar
    And isim bolumune "<firstName>" yazar
    And soyisim bolumune "<lastName>" yazar
    And position bolumune "<position>" yazar
    And office bolumune "<office>" yazar
    And extension bolumune "<extension>" yazar
    And startDate bolumune "<startDate>" yazar
    And salary bolumune "<salary>" yazar
    And Create tusuna basar
    When kullanici ilk isim ile arama yapar
    Then isim bolumunde isminin oldugunu dogrular
    And sayfayi kapatir