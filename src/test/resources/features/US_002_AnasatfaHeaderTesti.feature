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
