Feature: Ziyaretci olarak, sitedeki mülklerin listelendiği liste sayfasına ulaşarak mevcut mülk sayısını görebilmem, ilanların ayrıntılarına erişebilmem ve arama yaparak sonuçları görüntüleyebilmem için gerekli fonksiyonların olmasını istiyorum.

  Scenario: TC48 ziyaretci  Listing Sayfasi  gorunurluk ve islev testi
    Given ziyaretci Hauseheaven Url erisim saglar
    Then ziyaretci Hauseheaven sayfasina erisim sagaladigini dogrular
    And ziyaretci listing yazisina click yapar
    And ziyaretci listing sayfasina yonlendirildigini dogrular
    And ziyaretci yonlendirildigi sayfada mulklerin listelendigini dogrular
    And ziyaretci taraciyi kapatir


  Scenario: TC49 ziyaretci Listing Sayfasi  gorunurluk ve islev testi

    Given ziyaretci Hauseheaven Url erisim saglar
    Then ziyaretci Hauseheaven sayfasina erisim sagaladigini dogrular
    And ziyaretci listing yazisina click yapar
    And ziyaretci listing sayfasina yonlendirildigini dogrular
    And ziyaretci yonlendirildigi sayfada mulklerin listelendigini dogrular
    And ziyaretci taraciyi kapatir

  Scenario: TC50 ziyaretci Listing Sayfasi Listing basliklari  gorunurluk ve islev testi
#bug
    Given ziyaretci Hauseheaven Url erisim saglar
    Then ziyaretci Hauseheaven sayfasina erisim sagaladigini dogrular
    And ziyaretci listing yazisina click yapar
    And ziyaretci listinglerin basliklari oldugunu dogrular
    And ziyaretci listinglerin aciklamasi oldugunu dogrular
    And ziyaretci listinglerin fiyatlari oldugunu dogrular
    And ziyaretci listinglerin konum bilgisi oldugunu dogrular
    And ziyaretci taraciyi kapatir

  Scenario: TC51 Listing sayfasindaki arama formunda arama yapilmasi testi
    #bug
    Given ziyaretci Hauseheaven Url erisim saglar
    Then ziyaretci Hauseheaven sayfasina erisim sagaladigini dogrular
    And ziyaretci listing yazisina click yapar
    And ziyaretci location tab'ina NewJersey yazar
    And ziyaretci city kutusuna click yapar
    And ziyaretci city kutusunda  Borden Town yazar
    And ziyaretci  FindNewHome butonunua tiklar
    And ziyaretci Borden Town sehirdeki evlerin listenedigini dogrular
    And ziyaretci taraciyi kapatir

    Scenario: : TC52 Listing sayfasindaki Listingyapilmasi testi

      Given ziyaretci Hauseheaven Url erisim saglar
      Then ziyaretci Hauseheaven sayfasina erisim sagaladigini dogrular
      And ziyaretci listing yazisina click yapar
      And ziyaretci location tab'inda ilk listingi secer
      And ziyaretci city kutusuna click yapar
      And ziyaretci city kutusunda  Borden Town yazar
      And ziyaretci  FindNewHome butonunua tiklar
      And ziyaretci Borden Town sehirdeki evlerin listenedigini dogrular
      And ziyaretci taraciyi kapatir














