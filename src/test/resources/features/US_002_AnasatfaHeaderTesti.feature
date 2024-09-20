Feature:  US_002 Ziyaretçi olarak, ana sayfanın üst bölümündeki menülerin görünür ve aktif olmasını istiyorum.

  Scenario: TC04 ziyaretci anasayfa header ogeleri testi

    Given ziyaretci Hauseheaven Url erisim saglar
    Then  ziyaretci Anasayfa da header bolumunde logo oldugunu test eder
    And   ziyaretci Ansayfa da header bolumunde Home tab'in gorunur oldugunu test eder
    And   ziyaretci Ansayfa da header bolumunde Listing tab'in gorunur oldugunu test eder
    And   ziyaretci Ansayfa da header bolumunde Projets tab'in gorunur oldugunu test eder
    And   ziyaretci Ansayfa da header bolumunde Blog tab'in gorunur oldugunu test eder
    And   ziyaretci Ansayfa da header bolumunde Contact tab'in gorunur oldugunu test eder
    And   ziyaretci Ansayfa da header bolumunde Signup tab'in gorunur oldugunu test eder
    And   ziyaretci Ansayfa da header bolumunde Addproperty tab'in gorunur oldugunu test eder
    And   ziyaretci Ansayfa da header bolumunde SignIn butonunun gorunur oldugunu test eder

  Scenario: TC05 ziyaretci navigasyon testi
    Given ziyaretci Hauseheaven Url erisim saglar
    Then  ziyaretci Hauseheaven sayfasina erisim sagaladigini dogrular
    And   ziyaretci Ansayfa da header bolumunde Listing tab tiklar
    And   ziyaretci listing sayfasinda oldugunu kontrol eder
    And   ziyaretci Headerda bulunan Home Buttonuna tiklar
    And   ziyaretci Hauseheven sayfasina erisim sagladdigini kontrol eder
    And   ziyaretci taraciyi kapatir

  Scenario: TC06 ziyaretci header ogeleri testi
    Given ziyaretci Hauseheaven Url erisim saglar
    Then  ziyaretci Hauseheaven sayfasina erisim sagaladigini dogrular
    And   ziyaretci header bolumunde 7 adet oge oldgunu dogrular
    And   ziyaretci taraciyi kapatir

  Scenario: TC07 ziyaretci header SignIN buttonu gorunurluk testi
    Given ziyaretci Hauseheaven Url erisim saglar
    Then  ziyaretci Hauseheaven sayfasina erisim sagaladigini dogrular
    And   ziyaretci Ansayfa da header bolumunde Signup tab'in gorunur oldugunu test eder
    And   ziyaretci taraciyi kapatir

  Scenario: TC07 ziyaretci footer indiginde header'in gorunurlugu testi

    Given  ziyaretci Hauseheaven Url erisim saglar
    Then   ziyaretci Hauseheaven sayfasina erisim sagaladigini dogrular
    And   ziyaretci footer bolumene erisim saglar
    And   ziyaretci footer bolumunde iken header bolumununun gorunurlugunu dogrular
    And   ziyaretci taraciyi kapatir

    Scenario: TC08
