Feature:US001 Ziyaretçi olarak, siteye erişim sağlayarak siteyi kullanabilmem için erişimimin mümkün olmasını istiyorum.

  Scenario: TC01 Ziyaretci erisim dogrulama testi

    Given ziyaretci Hauseheaven Url erisim saglar
    Then  zirayetci Hauseheaven Url erisim sagladigini kontrol eder
    And   ziyaretci Anasayfa headarin gorunur oldugunu dogrular
    And   zirayetci taraciyi kapatir

    #FIREFOX -EDGE  FARKI BORWSER  TEST BASARIZ OLDU
   #DENEN YOLLAR : YENI TESTRUNNER TAG YAPILARAK
   #POM XML TESTNG EKLEYIP XML DENEMEK
   #DRIVER DOSYASINDA FARKLI DENEMELEMER VS
  Scenario: TC02 Ziyaretci farkli browserlarda  erisim dogrulama testi

    Given ziyaretci Hauseheaven Url erisim saglar
    Then  zirayetci Hauseheaven Url erisim sagladigini kontrol eder
    And   ziyaretci Anasayfa headarin gorunur oldugunu dogrular
    And   zirayetci taraciyi kapatir

    Scenario: TC03 Ziyaretci icerik erisim testi

      Given ziyaretci Hauseheaven Url erisim saglar
      Then  ziyaretci Anasayfa da headerda yer alan SignIn butonuna tiklar
      And   ziyaretci Login sayfasina erisebildigini kontrol eder
      And   ziyaretci taraciyi kapatir








