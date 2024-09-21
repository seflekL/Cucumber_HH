Feature: Ziyaretci olarak ana sayfanin body bolumunde arama yapip sonuc sayisini goruntuleyebilmem icin arama arama fonksiyonun calisir olmasini istiyorum

Scenario: TC22 Ziyaretcinin ana sayfa govde bolumunde uye bilgisinin girmeden konum arama ktusuna metin ve sayi girebilmeldir
  #bug
  Given ziyaretci Hauseheaven Url erisim saglar
  Then ziyaretci Hauseheaven sayfasina erisim sagaladigini dogrular
  And  ziyaretci Anasayfa Body bolumune scroll yapar
  And ziyaretci konum arama kutusuna tiklar
  And ziyaretci arama kutusuna aradigi sehir ulke isiminin "Miami" adini yazar
  And ziyaretci arama butonuna basarak arama yapar
  And ziyaretci sonucun aradigi ulke veya sehir oldugunu dogrular
  And ziyaretci taraciyi kapatir
