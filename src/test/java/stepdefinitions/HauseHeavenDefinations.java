package stepdefinitions;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import pages.AdminDashboard;
import pages.HomePage;
import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import static utilities.Driver.driver;


public class HauseHeavenDefinations {
  AdminDashboard adminDashboard=new AdminDashboard();
  HomePage homePage=new HomePage();
  UserDashboard userDashboard=new UserDashboard();

    @Given("ziyaretci Hauseheaven Url erisim saglar")
    public void ziyaretci_hauseheaven_url_erisim_saglar() {
        Driver.getDriver().get(ConfigReader.getProperty("hhUrl"));

    }
    @Then("zirayetci Hauseheaven Url erisim sagladigini kontrol eder")
    public void zirayetci_hauseheaven_url_erisim_sagladigini_kontrol_eder() {
        String expectedUrl="https://qa.hauseheaven.com/";
        String actualUrl=Driver.getDriver().getCurrentUrl();

    }
    @Then("ziyaretci Anasayfa headarin gorunur oldugunu dogrular")
    public void ziyaretci_anasayfa_headarin_gorunur_oldugunu_dogrular() {
    Assertions.assertTrue(homePage.headerSignUpButonu.isDisplayed());

    }
    @Then("zirayetci taraciyi kapatir")
    public void zirayetci_taraciyi_kapatir() {
    Driver.quitDriver();
    }




    @Then("ziyaretci Anasayfa da headerda yer alan SignIn butonuna tiklar")
    public void ziyaretciAnasayfaDaHeaderdaYerAlanSignInButonunaTiklar() {
      homePage.signinButonu.click();
    }

    @And("ziyaretci Login sayfasina erisebildigini kontrol eder")
    public void ziyaretciLoginSayfasinaErisebildiginiKontrolEder() {
      String expectedUrl="https://qa.hauseheaven.com/login";
      String actualUrl=Driver.getDriver().getCurrentUrl();
      Assertions.assertEquals(actualUrl,expectedUrl);
    }

    @And("ziyaretci taraciyi kapatir")
    public void ziyaretciTaraciyiKapatir() {
      Driver.quitDriver();
    }

  @Then("ziyaretci Anasayfa da header bolumunde logo oldugunu test eder")
  public void ziyaretciAnasayfaDaHeaderBolumundeLogoOldugunuTestEder() {
      Assertions.assertTrue(homePage.hauseheavenlogo.isDisplayed());

  }

  @And("ziyaretci Ansayfa da header bolumunde Home tab'in gorunur oldugunu test eder")
  public void ziyaretciAnsayfaDaHeaderBolumundeHomeTabInGorunurOldugunuTestEder() {
    Assertions.assertTrue(homePage.homeButonu.isDisplayed());
  }

  @And("ziyaretci Ansayfa da header bolumunde Listing tab'in gorunur oldugunu test eder")
  public void ziyaretciAnsayfaDaHeaderBolumundeListingTabInGorunurOldugunuTestEder() {
  Assertions.assertTrue(homePage.listingButonu.isDisplayed());
    }

  @And("ziyaretci Ansayfa da header bolumunde Projets tab'in gorunur oldugunu test eder")
  public void ziyaretciAnsayfaDaHeaderBolumundeProjetsTabInGorunurOldugunuTestEder() {
  Assertions.assertTrue(homePage.projectsButonu.isDisplayed());
    }

  @And("ziyaretci Ansayfa da header bolumunde Blog tab'in gorunur oldugunu test eder")
  public void ziyaretciAnsayfaDaHeaderBolumundeBlogTabInGorunurOldugunuTestEder() {
  Assertions.assertTrue(homePage.blogButonu.isDisplayed());
    }

  @And("ziyaretci Ansayfa da header bolumunde Contact tab'in gorunur oldugunu test eder")
  public void ziyaretciAnsayfaDaHeaderBolumundeContactTabInGorunurOldugunuTestEder() {
    Assertions.assertTrue(homePage.contactButonu.isDisplayed());
    }

  @And("ziyaretci Ansayfa da header bolumunde Signup tab'in gorunur oldugunu test eder")
  public void ziyaretciAnsayfaDaHeaderBolumundeSignupTabInGorunurOldugunuTestEder() {
  Assertions.assertTrue(homePage.signupButonu.isDisplayed());
    }

  @And("ziyaretci Ansayfa da header bolumunde Addproperty tab'in gorunur oldugunu test eder")
  public void ziyaretciAnsayfaDaHeaderBolumundeAddproperyTabInGorunurOldugunuTestEder() {
      Assertions.assertTrue(homePage.addPropertyButonu.isDisplayed());
    }

  @And("ziyaretci Ansayfa da header bolumunde SignIn butonunun gorunur oldugunu test eder")
  public void ziyaretciAnsayfaDaHeaderBolumundeSignInButonununGorunurOldugunuTestEder() {
    Assertions.assertTrue(homePage.signinButonu.isDisplayed());
  }

  @Then("ziyaretci Hauseheaven sayfasina erisim sagaladigini dogrular")
  public void ziyaretciHauseheavenSayfasinaErisimSagaladiginiDogrular() {
      String expectedUrl="https://qa.hauseheaven.com/";
      String actualUrl=Driver.getDriver().getCurrentUrl();
      Assertions.assertEquals(actualUrl,expectedUrl);
  }

  @And("ziyaretci Ansayfa da header bolumunde Listing tab tiklar")
  public void ziyaretciAnsayfaDaHeaderBolumundeListingTabTiklar() {
      homePage.listingButonu.click();
  }

  @And("ziyaretci listing sayfasinda oldugunu kontrol eder")
  public void ziyaretciListingSayfasindaOldugunuKontrolEder() {
    String expectedUrl="https://qa.hauseheaven.com/properties?layout=sidebar";
    String actualUrl=Driver.getDriver().getCurrentUrl();
    Assertions.assertEquals(actualUrl,expectedUrl);
  }

  @And("ziyaretci Headerda bulunan Home Buttonuna tiklar")
  public void ziyaretciHeaderdaBulunanHomeButtonunaTiklar() {
      homePage.homeButonu.click();
  }

  @And("ziyaretci Hauseheven sayfasina erisim sagladdigini kontrol eder")
  public void ziyaretciHausehevenSayfasinaErisimSagladdiginiKontrolEder() {

    String expectedUrl="https://qa.hauseheaven.com/";
    String actualUrl=Driver.getDriver().getCurrentUrl();
    Assertions.assertEquals(actualUrl,expectedUrl);

  }

  @And("ziyaretci header bolumunde {int} adet oge oldgunu dogrular")
  public void ziyaretciHeaderBolumundeAdetOgeOldgunuDogrular(int sayi) {
      Assertions.assertEquals(homePage.headerList.size(),sayi);

  }

  @And("ziyaretci footer bolumene erisim saglar")
  public void ziyaretciFooterBolumeneErisimSaglar() {
    ReusableMethods.hover(homePage.SefFooterElementi);
  }

  @And("ziyaretci footer bolumunde iken header bolumununun gorunurlugunu dogrular")
  public void ziyaretciFooterBolumundeIkenHeaderBolumunununGorunurlugunuDogrular() {
     Assertions.assertTrue(homePage.headerSignUpButonu.isDisplayed());
    }

  @And("ziyaretci Header yer alan Listing butonuna tiklar")
  public void ziyaretciHeaderYerAlanListingButonunaTiklar() {
      homePage.listingButonu.click();
  }

  @And("ziyaretci acilan sayfanin properties oldugunu dogrular")
  public void ziyaretciAcilanSayfaninPropertiesOldugunuDogrular() {
      String expectedUrl="https://qa.hauseheaven.com/properties?layout=sidebar";
      String actualUrl=Driver.getDriver().getCurrentUrl();

  }

  @And("ziyaretci Header yer alan Projects butonuna tiklar")
  public void ziyaretciHeaderYerAlanProjectsButonunaTiklar() {
      homePage.projectsButonu.click();
  }

  @And("ziyaretci acilan sayfanin Projects oldugunu dogrular")
  public void ziyaretciAcilanSayfaninProjectsOldugunuDogrular() {
      String expectedUrl="https://qa.hauseheaven.com/projects";
      String acutalUrl=Driver.getDriver().getCurrentUrl();
      Assertions.assertEquals(acutalUrl,expectedUrl);
  }

  @And("ziyaretci Header yer alan Blog butonuna tiklar")
  public void ziyaretciHeaderYerAlanBlogButonunaTiklar() {
      homePage.blogButonu.click();
  }

  @And("ziyaretci acilan sayfanin Blog oldugunu dogrular")
  public void ziyaretciAcilanSayfaninBlogOldugunuDogrular() {
    String expectedUrl="https://qa.hauseheaven.com/blog";
    String acutalUrl=Driver.getDriver().getCurrentUrl();
    Assertions.assertEquals(acutalUrl,expectedUrl);
  }

  @And("ziyaretci Header yer alan Agents butonuna tiklar")
  public void ziyaretciHeaderYerAlanAgentsButonunaTiklar() {
      homePage.agentsButonu.click();
  }

  @And("ziyaretci acilan sayfanin Agents oldugunu dogrular")
  public void ziyaretciAcilanSayfaninAgentsOldugunuDogrular() {
    String expectedUrl="https://qa.hauseheaven.com/agents";
    String acutalUrl=Driver.getDriver().getCurrentUrl();
    Assertions.assertEquals(acutalUrl,expectedUrl);

  }

  @And("ziyaretci Header yer alan Contact butonuna tiklar")
  public void ziyaretciHeaderYerAlanContactButonunaTiklar() {
      homePage.contactButonu.click();

  }

  @And("ziyaretci acilan sayfanin Contact oldugunu dogrular")
  public void ziyaretciAcilanSayfaninContactOldugunuDogrular() {
    String expectedUrl="https://qa.hauseheaven.com/contact";
    String acutalUrl=Driver.getDriver().getCurrentUrl();
    Assertions.assertEquals(acutalUrl,expectedUrl);
  }

  @And("ziyaretci Header yer alan Signup butonuna tiklar")
  public void ziyaretciHeaderYerAlanSignupButonunaTiklar() {
      homePage.signupButonu.click();
  }

  @And("ziyaretci acilan sayfanin Signup oldugunu dogrular")
  public void ziyaretciAcilanSayfaninSignupOldugunuDogrular() {
    String expectedUrl="https://qa.hauseheaven.com/register";
    String acutalUrl=Driver.getDriver().getCurrentUrl();
    Assertions.assertEquals(acutalUrl,expectedUrl);
  }

  @And("ziyaretci Header yer alan AddProperty butonuna tiklar")
  public void ziyaretciHeaderYerAlanAddPropertyButonunaTiklar() {
      homePage.addPropertyButonu.click();
  }

  @And("ziyaretci acilan sayfanin AddProperty oldugunu dogrular")
  public void ziyaretciAcilanSayfaninAddPropertyOldugunuDogrular() {
    String expectedUrl="https://qa.hauseheaven.com/login";
    String acutalUrl=Driver.getDriver().getCurrentUrl();
    Assertions.assertEquals(acutalUrl,expectedUrl);
  }

  @And("ziyaretci Header yer alan SignIN butonuna tiklar")
  public void ziyaretciHeaderYerAlanSignINButonunaTiklar() {
      homePage.signinButonu.click();
  }

  @And("ziyaretci acilan sayfanin SignIN oldugunu dogrular")
  public void ziyaretciAcilanSayfaninSignINOldugunuDogrular() {
    String expectedUrl="https://qa.hauseheaven.com/login";
    String acutalUrl=Driver.getDriver().getCurrentUrl();
    Assertions.assertEquals(acutalUrl,expectedUrl);
  }

  @And("ziyaretci Anasayfa Body bolumune scroll yapar")
  public void ziyaretciAnasayfaBodyBolumuneScrollYapar() {
      ReusableMethods.hover(homePage.sefSearchBoxPropertyTypeDDM);
  }


  @And("ziyaretci Anasayfa Body bolumunde background resmin gorunulugunu test eder")
  public void ziyaretciAnasayfaBodyBolumundeBackgroundResminGorunulugunuTestEder() {
      Assertions.assertTrue(homePage.homepageBackgroundElemnti.isDisplayed());
    }

  @And("ziyaretci Anasayfa Body bolumunde yer alan HowitWorks sroll yapar")
  public void ziyaretciAnasayfaBodyBolumundeYerAlanHowitWorksSrollYapar() {
      ReusableMethods.hover(homePage.EvaluateProperty);
  }

  @And("ziyaretci Anasayfa Body bolumunde EvalateProperty,MeetyourAgent,ClosetheDeal adimlarin yer aldigini test eder")
  public void ziyaretciAnasayfaBodyBolumundeEvalatePropertyMeetyourAgentClosetheDealAdimlarinYerAldiginiTestEder() {
    List<String> howitsworksSubMenus =ReusableMethods.getStringList(homePage.howitworkssubmenulist);

    for (String howitsworksSubMenueachlist : howitsworksSubMenus) {
      System.out.println(howitsworksSubMenueachlist);
      String expectedContent="how it works?\n" +
              "get ready to embark on a seamless real estate journey as we guide you through the process from start to finish, ensuring a smooth and rewarding experience.\n" +
              "evaluate property\n" +
              "our team will assess the value and condition of your property with precision. this helps us provide a competitive and accurate market price.\n" +
              "meet your agent\n" +
              "connect with a dedicated real estate agent who understands your needs and goals. they will guide you through every step of the buying or selling process.\n" +
              "close the deal\n" +
              "we’ll handle the final paperwork and negotiations to ensure a smooth transaction. our goal is to make the closing process as seamless and stress-free as possible.";
      Assertions.assertEquals(expectedContent.toLowerCase(),howitsworksSubMenueachlist.toLowerCase());
    }
       }

  @And("ziyaretci Anasayfa Body bolumunde yer alan HowitWorks basligin gorunurlugunu test eder")
  public void ziyaretciAnasayfaBodyBolumundeYerAlanHowitWorksBasliginGorunurlugunuTestEder() {
  Assertions.assertTrue(homePage.HowItWorks.isDisplayed());
    }

  @And("ziyaretci Anasayfa Body bolumunde yer alan ExploreGoodPlaces sroll yapar")
  public void ziyaretciAnasayfaBodyBolumundeYerAlanExploreGoodPlacesSrollYapar() {
      ReusableMethods.hover(homePage.exploregoodplaceIMGlist.get(0));
  }

  @And("ziyaretci ExploreGoodPlaces bolumundeki listinglerin gorunluguunu test eder")
  public void ziyaretciExploreGoodPlacesBolumundekiListinglerinGorunluguunuTestEder() {
      List<String>homepageListingList=ReusableMethods.getStringList(homePage.exploregoodplaceIMGlist);
      Assertions.assertEquals(homepageListingList.size(),6);
    }

  @And("ziyaretci listing ogelerinde kalp emojisi yer aldigini test eder")
  public void ziyaretciListingOgelerindeKalpEmojisiYerAldiginiTestEder() {
      Assertions.assertTrue(homePage.KalpEmoji.isDisplayed());

  }

  @And("ziyaretci herhangi bir listinge tiklandiginda dogru sayfa acildigini test eder")
  public void ziyaretciHerhangiBirListingeTiklandigindaDogruSayfaAcildiginiTestEder() {
      homePage.exploregoodplaceIMGlist.get(0).click();
      String expectedUrl="https://qa.hauseheaven.com/properties/unparalleled-residence-with-forever-central-park-views";
      String actualUrl=Driver.getDriver().getCurrentUrl();
      Assertions.assertEquals(actualUrl,expectedUrl);
  }

  @And("ziyaretci Findbylocation bolumundeki listinglerin gorunluguunu test eder")
  public void ziyaretciFindbylocationBolumundekiListinglerinGorunluguunuTestEder() {
    List<String>findbyyListingList=ReusableMethods.getStringList(homePage.findByLocationsList);
    Assertions.assertEquals(findbyyListingList.size(),8);

  }

  @And("ziyaretci Anasayfa Body bolumunde yer alan Findybylocation sroll yapar")
  public void ziyaretciAnasayfaBodyBolumundeYerAlanFindybylocationSrollYapar() {
    ReusableMethods.hover(homePage.findByLocationsList.get(3));
  }

  @And("ziyaretci Newyork  location tiklandiginda dogru sayfa acildigini test eder")
  public void ziyaretciNewyorkLocationTiklandigindaDogruSayfaAcildiginiTestEder() {

    homePage.findByLocationsList.get(3).click();
    String expectedUrl="https://qa.hauseheaven.com/city/new-york";
    String actualUrl=Driver.getDriver().getCurrentUrl();
    Assertions.assertEquals(actualUrl,expectedUrl);
  }

  @And("ziyaretci Anasayfa Body bolumunde yer alan GoodReviewByCusotmer sroll yapar")
  public void ziyaretciAnasayfaBodyBolumundeYerAlanGoodReviewByCusotmerSrollYapar() {
      ReusableMethods.hover(homePage.goodreviewsbycustomerSlider);

  }

   @And("Body bolumunde yer alan GoodReviewByCusotmer slider oldugunu test eder")
  public void bodyBolumundeYerAlanGoodReviewByCusotmerSliderOldugunuTestEder() {
Assertions.assertTrue(homePage.goodreviewsbycustomerSlider.isDisplayed());
  }

  @And("ziyaretci Anasayfa Body bolumunde yer SeeOurPackages sroll yapar")
  public void ziyaretciAnasayfaBodyBolumundeYerSeeOurPackagesSrollYapar() {
      ReusableMethods.hover(homePage.SeeOurPackages);
  }

  @And("Body bolumunde SeeOurPackeges paketlerin yer aldigini kontrol eder")
  public void bodyBolumundeSeeOurPackegesPaketlerinYerAldiginiKontrolEder() {
      List<String>seeourpackageList=ReusableMethods.getStringList(homePage.PostPlanList);
    System.out.println(seeourpackageList);
      Assertions.assertEquals(seeourpackageList.size(),3);

  }

  @And("Body bolumunde SeeOurPackeges paketlerinde choose plan butonu oldgunu kontrol eder")
  public void bodyBolumundeSeeOurPackegesPaketlerindeChoosePlanButonuOldgunuKontrolEder() {
      Assertions.assertTrue(homePage.ChoosePlan.isDisplayed());
  }

  @And("ziyaretci konum arama kutusuna tiklar")
  public void ziyaretciKonumAramaKutusunaTiklar() {
    homePage.sefUsercookies.click();
    homePage.sefUserSearhforloactionboxElementi.click();

  }


  @And("ziyaretci sonucun aradigi ulke veya sehir oldugunu dogrular")
  public void ziyaretciSonucunAradigiUlkeVeyaSehirOldugunuDogrular() {
    List <String> searchedResultList=ReusableMethods.getElementsText(userDashboard.sefUsersearchedList);
    String aranacakKelime="Miami";
    System.out.println(searchedResultList);
    Assertions.assertTrue(searchedResultList.contains("Miami"));
  }

  @And("ziyaretci arama kutusuna aradigi sehir ulke isiminin {string} adini yazar")
  public void ziyaretciAramaKutusunaAradigiSehirUlkeIsimininAdiniYazar(String sehirUlkeisim) {
    homePage.sefUserSearhforloactionboxElementi.sendKeys(sehirUlkeisim);
    ReusableMethods.wait(2);
    ReusableMethods.getFullScreenshot(Driver.getDriver());
  }

  @And("ziyaretci arama butonuna basarak arama yapar")
  public void ziyaretciAramaButonunaBasarakAramaYapar() {
   ReusableMethods.hover(homePage.sefUserBodysearchButtonElementi);
    ReusableMethods.wait(2);
    homePage.sefUserBodysearchButtonElementi.click();


  }
}