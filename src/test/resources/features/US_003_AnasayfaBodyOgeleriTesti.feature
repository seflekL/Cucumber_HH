Feature: Ziyaretci oalarak ana sayfain body bolumndeki ogelerin gorunurluk ve islevsellik testi

  Scenario: TC016 Resimlerin body bolumunde gorunurluk testi

    Given ziyaretci Hauseheaven Url erisim saglar
    Then ziyaretci Hauseheaven sayfasina erisim sagaladigini dogrular
    And ziyaretci Anasayfa Body bolumune scroll yapar
    And ziyaretci Anasayfa Body bolumunde background resmin gorunulugunu test eder
    And ziyaretci taraciyi kapatir