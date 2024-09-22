Feature: Ziyaretci olarak, ana sayfanın footer bolumundeki öğelerin ve işlevlerin görünür ve aktif olmasını istiyorum


  Scenario: TC27  ziyaretci  anasayfa footer elementleri gorunurluk testi

    Given ziyaretci Hauseheaven Url erisim saglar
    Then ziyaretci Hauseheaven sayfasina erisim sagaladigini dogrular
    And ziyaretci ana sayfa yuklendikten sonra sayfa sonunda yer alan footer bolumune scroll yapar
    And ziyaretci test object de bahsedilen ogelerin footer da ust basliklarin ve alt dizinlinlerin footer icinde goruntulendigini test eder.
    And ziyaretci taraciyi kapatir

  Scenario: TC28  ziyaretci  anasayfa footer bolumunde  logo gorunurluk testi

    Given ziyaretci Hauseheaven Url erisim saglar
    Then ziyaretci Hauseheaven sayfasina erisim sagaladigini dogrular
    And ziyaretci ana sayfa yuklendikten sonra sayfa sonunda yer alan footer bolumune scroll yapar
    And ziyaretci footer bolumunde hauseheaven logosun yer aldigini dogrular
    And ziyaretci footer bolumunde sirket adres bilgilerinin yer aldigini dogrular
    And ziyaretci taraciyi kapatir


  Scenario: TC28  ziyaretci  anasayfa footer bolumunde  sirketadress  gorunurluk testi

    Given ziyaretci Hauseheaven Url erisim saglar
    Then ziyaretci Hauseheaven sayfasina erisim sagaladigini dogrular
    And ziyaretci ana sayfa yuklendikten sonra sayfa sonunda yer alan footer bolumune scroll yapar
    And ziyaretci footer bolumunde sirket adres bilgilerinin yer aldigini dogrular
    And ziyaretci taraciyi kapatir


  Scenario: TC29  ziyaretci  anasayfa footer bolumunde  AboutUs  gorunurluk ve islev testi

    Given ziyaretci Hauseheaven Url erisim saglar
    Then ziyaretci Hauseheaven sayfasina erisim sagaladigini dogrular
    And ziyaretci ana sayfa yuklendikten sonra sayfa sonunda yer alan footer bolumune scroll yapar
    And ziyaretci footer bolumunde yer alan About Us tab'ina tiklar
    And ziyaretci ayni sekmede About Us sayfasinin acildigini kontrol eder
    And ziyaretci About Us sayfasinda asagiya footer bolumune scroll yapar
    And ziyaretci guideline da verilen footer ogelerinin About Ussayfasinin altinda yer aldigini  kontrol eder
    And ziyaretci halen  About Us sayfasinda oldgunu dogrular
    And ziyaretci taraciyi kapatir


  Scenario: TC30 ziyaretci  anasayfa footer bolumunde  ContactUS  gorunurluk ve islev testi

    Given ziyaretci Hauseheaven Url erisim saglar
    Then ziyaretci Hauseheaven sayfasina erisim sagaladigini dogrular
    And ziyaretci ana sayfa yuklendikten sonra sayfa sonunda yer alan footer bolumune scroll yapar
    And ziyaretci footer bolumunde yer alan ContactUS tab'ina tiklar
    And ziyaretci ayni sekmede ContactUS sayfasinin acildigini kontrol eder
    And ziyaretci ContactUS sayfasinda asagiya footer bolumune scroll yapar
    And ziyaretci guideline da verilen footer ogelerinin ContactUS sayfasinin altinda yer aldigini  kontrol eder
    And ziyaretci halen  ContactUS sayfasinda oldgunu dogrular
    And ziyaretci taraciyi kapatir


  Scenario: TC31 ziyaretci  anasayfa footer bolumunde  Terms and Conditions  gorunurluk ve islev testi

    Given ziyaretci Hauseheaven Url erisim saglar
    Then ziyaretci Hauseheaven sayfasina erisim sagaladigini dogrular
    And ziyaretci ana sayfa yuklendikten sonra sayfa sonunda yer alan footer bolumune scroll yapar
    And ziyaretci footer bolumunde yer alan Terms and Conditions tab'ina tiklar
    And ziyaretci ayni sekmede Terms and Conditions sayfasinin acildigini kontrol eder
    And ziyaretci Terms and Conditions sayfasinda asagiya footer bolumune scroll yapar
    And ziyaretci guideline da verilen footer ogelerinin Terms and Conditions sayfasinin altinda yer aldigini  kontrol eder
    And ziyaretci halen Terms and Conditionssayfasinda oldgunu dogrular
    And ziyaretci taraciyi kapatir

  Scenario: TC32 ziyaretci  anasayfa footer bolumunde  All Properties  gorunurluk ve islev testi

    Given ziyaretci Hauseheaven Url erisim saglar
    Then ziyaretci Hauseheaven sayfasina erisim sagaladigini dogrular
    And ziyaretci ana sayfa yuklendikten sonra sayfa sonunda yer alan footer bolumune scroll yapar
    And ziyaretci footer bolumunde yer alan All Properties tab'ina tiklar
    And ziyaretci ayni sekmede All Properties sayfasinin acildigini kontrol eder
    And ziyaretci All Properties sayfasinda asagiya footer bolumune scroll yapar
    And ziyaretci guideline da verilen footer ogelerinin All Properties sayfasinin altinda yer aldigini  kontrol eder
    And ziyaretci halen All Properties sayfasinda oldgunu dogrular
    And ziyaretci taraciyi kapatir

  Scenario: TC33 ziyaretci  anasayfa footer bolumunde  HauseForSale  gorunurluk ve islev testi

    Given ziyaretci Hauseheaven Url erisim saglar
    Then ziyaretci Hauseheaven sayfasina erisim sagaladigini dogrular
    And ziyaretci ana sayfa yuklendikten sonra sayfa sonunda yer alan footer bolumune scroll yapar
    And ziyaretci footer bolumunde yer alan HauseForSale tab'ina tiklar
    And ziyaretci ayni sekmede HauseForSale sayfasinin acildigini kontrol eder
    And ziyaretci HauseForSale sayfasinda asagiya footer bolumune scroll yapar
    And ziyaretci guideline da verilen footer ogelerinin HauseForSale sayfasinin altinda yer aldigini  kontrol eder
    And ziyaretci halen HauseForSale sayfasinda oldgunu dogrular
    And ziyaretci taraciyi kapatir

  Scenario: TC34 ziyaretci  anasayfa footer bolumunde  House For Rent   gorunurluk ve islev testi
    Given ziyaretci Hauseheaven Url erisim saglar
    Then ziyaretci Hauseheaven sayfasina erisim sagaladigini dogrular
    And ziyaretci ana sayfa yuklendikten sonra sayfa sonunda yer alan footer bolumune scroll yapar
    And ziyaretci footer bolumunde yer alan Hause for Rent tab'ina tiklar
    And ziyaretci ayni sekmede Hause for Rent sayfasinin acildigini kontrol eder
    And ziyaretci Hause for Rent sayfasinda asagiya footer bolumune scroll yapar
    And ziyaretci guideline da verilen footer ogelerinin Hause of Rent sayfasinin altinda yer aldigini  kontrol eder
    And ziyaretci halen Hause for Rent sayfasinda oldgunu dogrular
    And ziyaretci taraciyi kapatir

  Scenario: TC35 ziyaretci  anasayfa footer bolumunde  Benefit of Investing   gorunurluk ve islev testi
    #bug
    Given ziyaretci Hauseheaven Url erisim saglar
    Then ziyaretci Hauseheaven sayfasina erisim sagaladigini dogrular
    And ziyaretci ana sayfa yuklendikten sonra sayfa sonunda yer alan footer bolumune scroll yapar
    And ziyaretci footer bolumunde yer alan Benefit of Investing tab'ina tiklar
    And ziyaretci ayni sekmede Benefit of Investing sayfasinin acildigini kontrol eder
    And ziyaretci Benefit of Investing sayfasinda asagiya footer bolumune scroll yapar
    And ziyaretci guideline da verilen footer ogelerinin Benefit of Investing sayfasinin altinda yer aldigini  kontrol eder
    And ziyaretci halen Benefit of Investing sayfasinda oldgunu dogrular
    And ziyaretci taraciyi kapatir

  Scenario: TC36 ziyaretci  anasayfa footer bolumunde  A Guide Story   gorunurluk ve islev testi
    #bug
    Given ziyaretci Hauseheaven Url erisim saglar
    Then ziyaretci Hauseheaven sayfasina erisim sagaladigini dogrular
    And ziyaretci ana sayfa yuklendikten sonra sayfa sonunda yer alan footer bolumune scroll yapar
    And ziyaretci footer bolumunde yer alan A Guide Story tab'ina tiklar
    And ziyaretci ayni sekmede A Guide Story sayfasinin acildigini kontrol eder
    And ziyaretci A Guide Story sayfasinda asagiya footer bolumune scroll yapar
    And ziyaretci guideline da verilen footer ogelerinin A Guide Story sayfasinin altinda yer aldigini  kontrol eder
    And ziyaretci halen A Guide Story sayfasinda oldgunu dogrular
    And ziyaretci taraciyi kapatir

  Scenario: TC37 ziyaretci  anasayfa footer bolumunde Raise gorunurluk ve islev testi
    #bug
    Given ziyaretci Hauseheaven Url erisim saglar
    Then ziyaretci Hauseheaven sayfasina erisim sagaladigini dogrular
    And ziyaretci ana sayfa yuklendikten sonra sayfa sonunda yer alan footer bolumune scroll yapar
    And ziyaretci footer bolumunde yer alanRaise  tab'ina tiklar
    And ziyaretci ayni sekmedeRaise  sayfasinin acildigini kontrol eder
    And ziyaretciRaise  sayfasinda asagiya footer bolumune scroll yapar
    And ziyaretci guideline da verilen footer ogelerininRaise  sayfasinin altinda yer aldigini  kontrol eder
    And ziyaretci halenRaise  sayfasinda oldgunu dogrular
    And ziyaretci taraciyi kapatir

  Scenario: TC38 ziyaretci  anasayfa footer bolumunde How to Stage gorunurluk ve islev testi
    #bug
    Given ziyaretci Hauseheaven Url erisim saglar
    Then ziyaretci Hauseheaven sayfasina erisim sagaladigini dogrular
    And ziyaretci ana sayfa yuklendikten sonra sayfa sonunda yer alan footer bolumune scroll yapar
    And ziyaretci footer bolumunde yer alan  How to Stage tab'ina tiklar
    And ziyaretci ayni sekmede  How to Stage  sayfasinin acildigini kontrol eder
    And ziyaretci  How to Stage  sayfasinda asagiya footer bolumune scroll yapar
    And ziyaretci guideline da verilen footer ogelerinin How to Stage  sayfasinin altinda yer aldigini  kontrol eder
    And ziyaretci  halen How to Stage sayfasinda oldgunu dogrular
    And ziyaretci taraciyi kapatir

  Scenario: TC39 ziyaretci  anasayfa footer bolumunde Investing Link  gorunurluk ve islev testi
    #bug
    Given ziyaretci Hauseheaven Url erisim saglar
    Then ziyaretci Hauseheaven sayfasina erisim sagaladigini dogrular
    And ziyaretci ana sayfa yuklendikten sonra sayfa sonunda yer alan footer bolumune scroll yapar
    And ziyaretci footer bolumunde yer alan  Investing Link  tab'ina tiklar
    And ziyaretci ayni sekmede  Investing Link   sayfasinin acildigini kontrol eder
    And ziyaretci  Investing Link   sayfasinda asagiya footer bolumune scroll yapar
    And ziyaretci guideline da verilen footer ogelerinin Investing Link   sayfasinin altinda yer aldigini  kontrol eder
    And ziyaretci  halen Investing Link  sayfasinda oldgunu dogrular
    And ziyaretci taraciyi kapatir

  Scenario: TC40 ziyaretci  anasayfa footer bolumunde HauseHeaven GoogleAPP link testi
#bug
    Given ziyaretci Hauseheaven Url erisim saglar
    Then ziyaretci Hauseheaven sayfasina erisim sagaladigini dogrular
    And ziyaretci ana sayfa yuklendikten sonra sayfa sonunda yer alan footer bolumune scroll yapar
    And ziyaretci footer bolumunde yer alan Hauseheaven Google App tab'ina tiklar
    And ziyaretci farkli sekmede "Hauseheaven Google App" sayfasinin acildigini kontrol eder
    And ziyaretci taraciyi kapatir


  Scenario: TC41 ziyaretci  anasayfa footer bolumunde HauseHeaven Apple APP link testi
#bug
    Given ziyaretci Hauseheaven Url erisim saglar
    Then ziyaretci Hauseheaven sayfasina erisim sagaladigini dogrular
    And ziyaretci ana sayfa yuklendikten sonra sayfa sonunda yer alan footer bolumune scroll yapar
    And ziyaretci footer bolumunde yer alan Hauseheaven Apple App tab'ina tiklar
    And ziyaretci farkli sekmede Hauseheaven Apple App sayfasinin acildigini kontrol eder
    And ziyaretci taraciyi kapatir

  Scenario: TC42 ziyaretci  anasayfa footer bolumunde Subscribe Box  gorunurluk ve islev testi

    Given ziyaretci Hauseheaven Url erisim saglar
    Then ziyaretci Hauseheaven sayfasina erisim sagaladigini dogrular
    And ziyaretci ana sayfa yuklendikten sonra sayfa sonunda yer alan footer bolumune scroll yapar
    And Ziyaretci anasayfa footer bolumunde yer alan Subscribe box gecerli email adresi girer
    And ziyaretci anasayfa footer bolumunde yer alan subsribe buttonu tiklar
    And ziyaretci Email adresinin basarali sekilde kaydedilgini dogrular
    And ziyaretci taraciyi kapatir

  Scenario: TC43 ziyaretci  anasayfa footer bolumunde Facebook buton  gorunurluk ve islev testi

    Given ziyaretci Hauseheaven Url erisim saglar
    Then ziyaretci Hauseheaven sayfasina erisim sagaladigini dogrular
    And ziyaretci ana sayfa yuklendikten sonra sayfa sonunda yer alan footer bolumune scroll yapar
    And  ziyaretci footer bolumunde yer alan "FaceBook" logosuna  tiklar
    And ziyaretci yeni sekmede "Hauseheaven-Facebook" sayfasinin ayri sekmede acildigini kontrol eder
    And ziyaretci taraciyi kapatir

  Scenario: TC44 ziyaretci  anasayfa footer bolumunde Twitter buton  gorunurluk ve islev testi
#bug x.com gidiyor
    Given ziyaretci Hauseheaven Url erisim saglar
    Then ziyaretci Hauseheaven sayfasina erisim sagaladigini dogrular
    And ziyaretci ana sayfa yuklendikten sonra sayfa sonunda yer alan footer bolumune scroll yapar
    And  ziyaretci footer bolumunde yer alan Twitter logosuna  tiklar
    And ziyaretci yeni sekmede Hauseheaven-Twitter sayfasinin ayri sekmede acildigini kontrol eder
    And ziyaretci Twitter'in resmi websitesine gittigini onaylar
    And ziyaretci taraciyi kapatir

  Scenario: TC45 ziyaretci  anasayfa footer bolumunde Instagram buton  gorunurluk ve islev testi
    Given ziyaretci Hauseheaven Url erisim saglar
    Then ziyaretci Hauseheaven sayfasina erisim sagaladigini dogrular
    And ziyaretci ana sayfa yuklendikten sonra sayfa sonunda yer alan footer bolumune scroll yapar
    And  ziyaretci footer bolumunde yer alan Instagram  logosuna  tiklar
    And ziyaretci yeni sekmede Hauseheaven-Instagram sayfasinin ayri sekmede acildigini kontrol eder
    And ziyaretci taraciyi kapatir

  Scenario: TC46 ziyaretci  anasayfa footer bolumunde Linkedin buton  gorunurluk ve islev testi
    Given ziyaretci Hauseheaven Url erisim saglar
    Then ziyaretci Hauseheaven sayfasina erisim sagaladigini dogrular
    And ziyaretci ana sayfa yuklendikten sonra sayfa sonunda yer alan footer bolumune scroll yapar
    And  ziyaretci footer bolumunde yer alan Linkedin  logosuna  tiklar
    And ziyaretci yeni sekmede Hauseheaven-Linkedinsayfasinin ayri sekmede acildigini kontrol eder
    And ziyaretci taraciyi kapatir

  Scenario: TC47 ziyaretci  anasayfa footer bolumunde Pinterest buton  gorunurluk ve islev testi
    Given ziyaretci Hauseheaven Url erisim saglar
    Then ziyaretci Hauseheaven sayfasina erisim sagaladigini dogrular
    And ziyaretci ana sayfa yuklendikten sonra sayfa sonunda yer alan footer bolumune scroll yapar
    And  ziyaretci footer bolumunde yer alan Pinterest  logosuna  tiklar
    And ziyaretci yeni sekmede Hauseheaven-Pinterest ayri sekmede acildigini kontrol eder
    And ziyaretci taraciyi kapatir















