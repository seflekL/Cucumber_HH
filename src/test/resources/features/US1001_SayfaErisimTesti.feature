

Feature:US001 Ziyaretçi olarak, siteye erişim sağlayarak siteyi kullanabilmem için erişimimin mümkün olmasını istiyorum.
  Scenario: TC01 Ziyaretci erisim dogrulama testi

    Given ziyaretci Hauseheaven Url erisim saglar
    Then  zirayetci Hauseheaven Url erisim sagladigini kontrol eder
    And   ziyaretci Anasayfa headarin gorunur oldugunu dogrular
    And   zirayetci taraciyi kapatir




