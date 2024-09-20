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

    Scenario: TC08 Anasayfa header ogelerine tiklandiginda dogru URL erisim saglama testi

      Given ziyaretci Hauseheaven Url erisim saglar
      Then ziyaretci Hauseheaven sayfasina erisim sagaladigini dogrular
      And ziyaretci Header yer alan Listing butonuna tiklar
      And ziyaretci acilan sayfanin properties oldugunu dogrular
      And ziyaretci taraciyi kapatir

  Scenario: TC09 Anasayfa header Projects butonuna tiklandiginda dogru URL erisim saglama testi

    Given ziyaretci Hauseheaven Url erisim saglar
    Then ziyaretci Hauseheaven sayfasina erisim sagaladigini dogrular
    And ziyaretci Header yer alan Projects butonuna tiklar
    And ziyaretci acilan sayfanin Projects oldugunu dogrular
    And ziyaretci taraciyi kapatir

  Scenario: TC10 Anasayfa header Blog butonuna tiklandiginda dogru URL erisim saglama testi

    Given ziyaretci Hauseheaven Url erisim saglar
    Then ziyaretci Hauseheaven sayfasina erisim sagaladigini dogrular
    And ziyaretci Header yer alan Blog butonuna tiklar
    And ziyaretci acilan sayfanin Blog oldugunu dogrular
    And ziyaretci taraciyi kapatir

  Scenario: TC11 Anasayfa header Agents butonuna tiklandiginda dogru URL erisim saglama testi

    Given ziyaretci Hauseheaven Url erisim saglar
    Then ziyaretci Hauseheaven sayfasina erisim sagaladigini dogrular
    And ziyaretci Header yer alan Agents butonuna tiklar
    And ziyaretci acilan sayfanin Agents oldugunu dogrular
    And ziyaretci taraciyi kapatir

  Scenario: TC12 Anasayfa header Contact butonuna tiklandiginda dogru URL erisim saglama testi

    Given ziyaretci Hauseheaven Url erisim saglar
    Then ziyaretci Hauseheaven sayfasina erisim sagaladigini dogrular
    And ziyaretci Header yer alan Contact butonuna tiklar
    And ziyaretci acilan sayfanin Contact oldugunu dogrular
    And ziyaretci taraciyi kapatir

  Scenario: TC13 Anasayfa header Signup butonuna tiklandiginda dogru URL erisim saglama testi

    Given ziyaretci Hauseheaven Url erisim saglar
    Then ziyaretci Hauseheaven sayfasina erisim sagaladigini dogrular
    And ziyaretci Header yer alan Signup butonuna tiklar
    And ziyaretci acilan sayfanin Signup oldugunu dogrular
    And ziyaretci taraciyi kapatir


  Scenario: TC14 Anasayfa header AddProperty butonuna tiklandiginda dogru URL erisim saglama testi

    Given ziyaretci Hauseheaven Url erisim saglar
    Then ziyaretci Hauseheaven sayfasina erisim sagaladigini dogrular
    And ziyaretci Header yer alan AddProperty butonuna tiklar
    And ziyaretci acilan sayfanin AddProperty oldugunu dogrular
    And ziyaretci taraciyi kapatir

  Scenario: TC15 Anasayfa header SignIn butonuna tiklandiginda dogru URL erisim saglama testi

    Given ziyaretci Hauseheaven Url erisim saglar
    Then ziyaretci Hauseheaven sayfasina erisim sagaladigini dogrular
    And ziyaretci Header yer alan SignIN butonuna tiklar
    And ziyaretci acilan sayfanin SignIN oldugunu dogrular
    And ziyaretci taraciyi kapatir



