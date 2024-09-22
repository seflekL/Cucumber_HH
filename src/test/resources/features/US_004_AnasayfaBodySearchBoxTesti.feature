Feature: Ziyaretci olarak ana sayfanin body bolumunde arama yapip sonuc sayisini goruntuleyebilmem icin arama arama fonksiyonun calisir olmasini istiyorum

  Scenario: TC22 ziyaretcinin ana sayfa govde bolumunde uye bilgisinin girmeden konum arama ktusuna metin ve sayi girebilmeldir
  #bug
    Given ziyaretci Hauseheaven Url erisim saglar
    Then ziyaretci Hauseheaven sayfasina erisim sagaladigini dogrular
    And  ziyaretci Anasayfa Body bolumune scroll yapar
    And ziyaretci konum arama kutusuna tiklar
    And ziyaretci arama kutusuna aradigi sehir ulke isiminin "Miami" adini yazar
    And ziyaretci arama butonuna basarak arama yapar
    And ziyaretci sonucun aradigi ulke veya sehir oldugunu dogrular
    And ziyaretci taraciyi kapatir


  Scenario: TC23 ziayaretci anasayfa body bolumunde yer alan searchBox icin pozitf DDM testi

    Given ziyaretci Hauseheaven Url erisim saglar
    Then ziyaretci Hauseheaven sayfasina erisim sagaladigini dogrular
    And ziyaretci Anasayfa Body bolumune scroll yapar
    And ziyaretci search for location box'ina tiklar
    And ziyaretci  searchbox'a istedigi ulke veya sehir ismini yazar
    And ziyaretci Min Price ddm menusunde  istedigi fiyati secer
    And ziyaretci MaxPrice ddm menusunde istedigi fiyati secer
    And ziyaretci Property Type ddm menusunde  istgedi ev turunu secer
    And ziyaretci Bed Rooms"ddm menusunde istedigi  Bedroom turunu secer
    And ziyaretci taraciyi kapatir

  Scenario: TC24 ziyaretci  ana sayfa body bolumunde ki  uye girsi yapmadan arama box'ina  icinde yer alan  "Search for Location" metin ve sayi girisi yapma testi
    Given ziyaretci Hauseheaven Url erisim saglar
    Then ziyaretci Hauseheaven sayfasina erisim sagaladigini dogrular
    And ziyaretci Anasayfa Body bolumune scroll yapar
    And ziyaretci anasayfada yer alan Search for location  box icine yazi ve rakam girer
    And ziyaretci taraciyi kapatir

  Scenario: TC25  ziyaretci  ana sayfa body bolumunde ki  uye girsi yapmadan arama box'ina listede olmayan degelerleri girebilme testi
   #Bug
    Given ziyaretci Hauseheaven Url erisim saglar
    Then ziyaretci Hauseheaven sayfasina erisim sagaladigini dogrular
    And ziyaretci Anasayfa Body bolumune scroll yapar
    And ziyaretci search for location box'ina tiklar
    And ziyaretci  searchbox'a istedigi ulke veya sehir ismini yazar
    And ziyaretci Min Price ddm menusunde  listede olmayan fiyat giris testi
    And ziyaretci MaxPrice ddm menusunde listede olmayan fiyat giris testi
    And ziyaretci Property Type ddm menusunde  listede olmayan tur giris testi
    And ziyaretci Bed Rooms"ddm menusunde ddm menusunde  listede olmayan tur giris testi
    And ziyaretci taraciyi kapatir