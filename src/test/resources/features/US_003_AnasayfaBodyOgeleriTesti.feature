Feature: Ziyaretci oalarak ana sayfain body bolumndeki ogelerin gorunurluk ve islevsellik testi

  Scenario: TC016 Resimlerin body bolumunde gorunurluk testi

    Given ziyaretci Hauseheaven Url erisim saglar
    Then ziyaretci Hauseheaven sayfasina erisim sagaladigini dogrular
    And ziyaretci Anasayfa Body bolumune scroll yapar
    And ziyaretci Anasayfa Body bolumunde background resmin gorunulugunu test eder
    And ziyaretci taraciyi kapatir

  Scenario: TC017 Body bolumunde yer alan How it works? ogelerini test eder

    Given ziyaretci Hauseheaven Url erisim saglar
    Then ziyaretci Hauseheaven sayfasina erisim sagaladigini dogrular
    And ziyaretci Anasayfa Body bolumunde yer alan HowitWorks sroll yapar
    And ziyaretci Anasayfa Body bolumunde yer alan HowitWorks basligin gorunurlugunu test eder
    And ziyaretci Anasayfa Body bolumunde EvalateProperty,MeetyourAgent,ClosetheDeal adimlarin yer aldigini test eder
    And ziyaretci taraciyi kapatir

  Scenario: TC018 Body bolumunde yer alan Explore Good places ogelerini test eder

    Given ziyaretci Hauseheaven Url erisim saglar
    Then ziyaretci Hauseheaven sayfasina erisim sagaladigini dogrular
    And ziyaretci Anasayfa Body bolumunde yer alan ExploreGoodPlaces sroll yapar
    And ziyaretci ExploreGoodPlaces bolumundeki listinglerin gorunluguunu test eder
    And ziyaretci listing ogelerinde kalp emojisi yer aldigini test eder
    And ziyaretci herhangi bir listinge tiklandiginda dogru sayfa acildigini test eder
    And ziyaretci taraciyi kapatir

  Scenario: TC019 Body bolumunde yer alan FindbyLocation ogelerini test eder

    Given ziyaretci Hauseheaven Url erisim saglar
    Then ziyaretci Hauseheaven sayfasina erisim sagaladigini dogrular
    And ziyaretci Anasayfa Body bolumunde yer alan Findybylocation sroll yapar
    And ziyaretci Findbylocation bolumundeki listinglerin gorunluguunu test eder
    And ziyaretci Newyork  location tiklandiginda dogru sayfa acildigini test eder
    And ziyaretci taraciyi kapatir

    Scenario: TC20 Body bolumunde yer alan GoodReiewsByCustomer ogelerini test eder
       #bresimler oversize
      Given ziyaretci Hauseheaven Url erisim saglar
      Then ziyaretci Hauseheaven sayfasina erisim sagaladigini dogrular
      And ziyaretci Anasayfa Body bolumunde yer alan GoodReviewByCusotmer sroll yapar
      And Body bolumunde yer alan GoodReviewByCusotmer slider oldugunu test eder
      And ziyaretci taraciyi kapatir

  Scenario: TC21 Body bolumunde yer alan SeeourPackages ogelerini test eder

    Given ziyaretci Hauseheaven Url erisim saglar
    Then ziyaretci Hauseheaven sayfasina erisim sagaladigini dogrular
    And ziyaretci Anasayfa Body bolumunde yer SeeOurPackages sroll yapar
    And Body bolumunde SeeOurPackeges paketlerin yer aldigini kontrol eder
    And Body bolumunde SeeOurPackeges paketlerinde choose plan butonu oldgunu kontrol eder
    And ziyaretci taraciyi kapatir








