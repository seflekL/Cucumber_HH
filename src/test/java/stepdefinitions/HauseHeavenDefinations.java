package stepdefinitions;

import com.github.javafaker.Faker;
import dev.failsafe.internal.util.Assert;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.AdminDashboard;
import pages.HomePage;
import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.LeventMethods;
import utilities.ReusableMethods;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import static utilities.Driver.driver;


public class HauseHeavenDefinations {
  AdminDashboard adminDashboard = new AdminDashboard();
  HomePage homePage = new HomePage();
  UserDashboard userDashboard = new UserDashboard();
  Faker faker=new Faker();

  @Given("ziyaretci Hauseheaven Url erisim saglar")
  public void ziyaretci_hauseheaven_url_erisim_saglar() {
    Driver.getDriver().get(ConfigReader.getProperty("hhUrl"));

  }

  @Then("zirayetci Hauseheaven Url erisim sagladigini kontrol eder")
  public void zirayetci_hauseheaven_url_erisim_sagladigini_kontrol_eder() {
    String expectedUrl = "https://qa.hauseheaven.com/";
    String actualUrl = Driver.getDriver().getCurrentUrl();

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
    String expectedUrl = "https://qa.hauseheaven.com/login";
    String actualUrl = Driver.getDriver().getCurrentUrl();
    Assertions.assertEquals(actualUrl, expectedUrl);
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
    String expectedUrl = "https://qa.hauseheaven.com/";
    String actualUrl = Driver.getDriver().getCurrentUrl();
    Assertions.assertEquals(actualUrl, expectedUrl);
  }

  @And("ziyaretci Ansayfa da header bolumunde Listing tab tiklar")
  public void ziyaretciAnsayfaDaHeaderBolumundeListingTabTiklar() {
    homePage.listingButonu.click();
  }

  @And("ziyaretci listing sayfasinda oldugunu kontrol eder")
  public void ziyaretciListingSayfasindaOldugunuKontrolEder() {
    String expectedUrl = "https://qa.hauseheaven.com/properties?layout=sidebar";
    String actualUrl = Driver.getDriver().getCurrentUrl();
    Assertions.assertEquals(actualUrl, expectedUrl);
  }

  @And("ziyaretci Headerda bulunan Home Buttonuna tiklar")
  public void ziyaretciHeaderdaBulunanHomeButtonunaTiklar() {
    homePage.homeButonu.click();
  }

  @And("ziyaretci Hauseheven sayfasina erisim sagladdigini kontrol eder")
  public void ziyaretciHausehevenSayfasinaErisimSagladdiginiKontrolEder() {

    String expectedUrl = "https://qa.hauseheaven.com/";
    String actualUrl = Driver.getDriver().getCurrentUrl();
    Assertions.assertEquals(actualUrl, expectedUrl);

  }

  @And("ziyaretci header bolumunde {int} adet oge oldgunu dogrular")
  public void ziyaretciHeaderBolumundeAdetOgeOldgunuDogrular(int sayi) {
    Assertions.assertEquals(homePage.headerList.size(), sayi);

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
    String expectedUrl = "https://qa.hauseheaven.com/properties?layout=sidebar";
    String actualUrl = Driver.getDriver().getCurrentUrl();

  }

  @And("ziyaretci Header yer alan Projects butonuna tiklar")
  public void ziyaretciHeaderYerAlanProjectsButonunaTiklar() {
    homePage.projectsButonu.click();
  }

  @And("ziyaretci acilan sayfanin Projects oldugunu dogrular")
  public void ziyaretciAcilanSayfaninProjectsOldugunuDogrular() {
    String expectedUrl = "https://qa.hauseheaven.com/projects";
    String acutalUrl = Driver.getDriver().getCurrentUrl();
    Assertions.assertEquals(acutalUrl, expectedUrl);
  }

  @And("ziyaretci Header yer alan Blog butonuna tiklar")
  public void ziyaretciHeaderYerAlanBlogButonunaTiklar() {
    homePage.blogButonu.click();
  }

  @And("ziyaretci acilan sayfanin Blog oldugunu dogrular")
  public void ziyaretciAcilanSayfaninBlogOldugunuDogrular() {
    String expectedUrl = "https://qa.hauseheaven.com/blog";
    String acutalUrl = Driver.getDriver().getCurrentUrl();
    Assertions.assertEquals(acutalUrl, expectedUrl);
  }

  @And("ziyaretci Header yer alan Agents butonuna tiklar")
  public void ziyaretciHeaderYerAlanAgentsButonunaTiklar() {
    homePage.agentsButonu.click();
  }

  @And("ziyaretci acilan sayfanin Agents oldugunu dogrular")
  public void ziyaretciAcilanSayfaninAgentsOldugunuDogrular() {
    String expectedUrl = "https://qa.hauseheaven.com/agents";
    String acutalUrl = Driver.getDriver().getCurrentUrl();
    Assertions.assertEquals(acutalUrl, expectedUrl);

  }

  @And("ziyaretci Header yer alan Contact butonuna tiklar")
  public void ziyaretciHeaderYerAlanContactButonunaTiklar() {
    homePage.contactButonu.click();

  }

  @And("ziyaretci acilan sayfanin Contact oldugunu dogrular")
  public void ziyaretciAcilanSayfaninContactOldugunuDogrular() {
    String expectedUrl = "https://qa.hauseheaven.com/contact";
    String acutalUrl = Driver.getDriver().getCurrentUrl();
    Assertions.assertEquals(acutalUrl, expectedUrl);
  }

  @And("ziyaretci Header yer alan Signup butonuna tiklar")
  public void ziyaretciHeaderYerAlanSignupButonunaTiklar() {
    homePage.signupButonu.click();
  }

  @And("ziyaretci acilan sayfanin Signup oldugunu dogrular")
  public void ziyaretciAcilanSayfaninSignupOldugunuDogrular() {
    String expectedUrl = "https://qa.hauseheaven.com/register";
    String acutalUrl = Driver.getDriver().getCurrentUrl();
    Assertions.assertEquals(acutalUrl, expectedUrl);
  }

  @And("ziyaretci Header yer alan AddProperty butonuna tiklar")
  public void ziyaretciHeaderYerAlanAddPropertyButonunaTiklar() {
    homePage.addPropertyButonu.click();
  }

  @And("ziyaretci acilan sayfanin AddProperty oldugunu dogrular")
  public void ziyaretciAcilanSayfaninAddPropertyOldugunuDogrular() {
    String expectedUrl = "https://qa.hauseheaven.com/login";
    String acutalUrl = Driver.getDriver().getCurrentUrl();
    Assertions.assertEquals(acutalUrl, expectedUrl);
  }

  @And("ziyaretci Header yer alan SignIN butonuna tiklar")
  public void ziyaretciHeaderYerAlanSignINButonunaTiklar() {
    homePage.signinButonu.click();
  }

  @And("ziyaretci acilan sayfanin SignIN oldugunu dogrular")
  public void ziyaretciAcilanSayfaninSignINOldugunuDogrular() {
    String expectedUrl = "https://qa.hauseheaven.com/login";
    String acutalUrl = Driver.getDriver().getCurrentUrl();
    Assertions.assertEquals(acutalUrl, expectedUrl);
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
    List<String> howitsworksSubMenus = ReusableMethods.getStringList(homePage.howitworkssubmenulist);

    for (String howitsworksSubMenueachlist : howitsworksSubMenus) {
      System.out.println(howitsworksSubMenueachlist);
      String expectedContent = "how it works?\n" +
              "get ready to embark on a seamless real estate journey as we guide you through the process from start to finish, ensuring a smooth and rewarding experience.\n" +
              "evaluate property\n" +
              "our team will assess the value and condition of your property with precision. this helps us provide a competitive and accurate market price.\n" +
              "meet your agent\n" +
              "connect with a dedicated real estate agent who understands your needs and goals. they will guide you through every step of the buying or selling process.\n" +
              "close the deal\n" +
              "we’ll handle the final paperwork and negotiations to ensure a smooth transaction. our goal is to make the closing process as seamless and stress-free as possible.";
      Assertions.assertEquals(expectedContent.toLowerCase(), howitsworksSubMenueachlist.toLowerCase());
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
    List<String> homepageListingList = ReusableMethods.getStringList(homePage.exploregoodplaceIMGlist);
    Assertions.assertEquals(homepageListingList.size(), 6);
  }

  @And("ziyaretci listing ogelerinde kalp emojisi yer aldigini test eder")
  public void ziyaretciListingOgelerindeKalpEmojisiYerAldiginiTestEder() {
    Assertions.assertTrue(homePage.KalpEmoji.isDisplayed());

  }

  @And("ziyaretci herhangi bir listinge tiklandiginda dogru sayfa acildigini test eder")
  public void ziyaretciHerhangiBirListingeTiklandigindaDogruSayfaAcildiginiTestEder() {
    homePage.exploregoodplaceIMGlist.get(0).click();
    String expectedUrl = "https://qa.hauseheaven.com/properties/unparalleled-residence-with-forever-central-park-views";
    String actualUrl = Driver.getDriver().getCurrentUrl();
    Assertions.assertEquals(actualUrl, expectedUrl);
  }

  @And("ziyaretci Findbylocation bolumundeki listinglerin gorunluguunu test eder")
  public void ziyaretciFindbylocationBolumundekiListinglerinGorunluguunuTestEder() {
    List<String> findbyyListingList = ReusableMethods.getStringList(homePage.findByLocationsList);
    Assertions.assertEquals(findbyyListingList.size(), 8);

  }

  @And("ziyaretci Anasayfa Body bolumunde yer alan Findybylocation sroll yapar")
  public void ziyaretciAnasayfaBodyBolumundeYerAlanFindybylocationSrollYapar() {
    ReusableMethods.hover(homePage.findByLocationsList.get(3));
  }

  @And("ziyaretci Newyork  location tiklandiginda dogru sayfa acildigini test eder")
  public void ziyaretciNewyorkLocationTiklandigindaDogruSayfaAcildiginiTestEder() {

    homePage.findByLocationsList.get(3).click();
    String expectedUrl = "https://qa.hauseheaven.com/city/new-york";
    String actualUrl = Driver.getDriver().getCurrentUrl();
    Assertions.assertEquals(actualUrl, expectedUrl);
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
    List<String> seeourpackageList = ReusableMethods.getStringList(homePage.PostPlanList);
    System.out.println(seeourpackageList);
    Assertions.assertEquals(seeourpackageList.size(), 3);

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
    List<String> searchedResultList = ReusableMethods.getElementsText(userDashboard.sefUsersearchedList);
    String aranacakKelime = "Miami";
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


  @And("ziyaretci search for location box'ina tiklar")
  public void ziyaretciSearchForLocationBoxInaTiklar() {
    homePage.sefUserSearhforloactionboxElementi.click();
    homePage.sefUsercookies.click();

  }


  @And("ziyaretci  searchbox'a istedigi ulke veya sehir ismini yazar")
  public void ziyaretciSearchboxAIstedigiUlkeVeyaSehirIsminiYazar() {
    homePage.sefUserSearhforloactionboxElementi.sendKeys("New York");

  }

  @And("ziyaretci Min Price ddm menusunde  istedigi fiyati secer")
  public void ziyaretciMinPriceDdmMenusundeIstedigiFiyatiSecer() {
    Select selectMinPrice = new Select(homePage.sefSearchBoxMinPriceDDM);
    selectMinPrice.selectByValue("500");
  }

  @And("ziyaretci MaxPrice ddm menusunde istedigi fiyati secer")
  public void ziyaretciMaxPriceDdmMenusundeIstedigiFiyatiSecer() {
    Select selectMax = new Select(homePage.sefSearchBoxMaxPriceDDM);
    selectMax.selectByValue("2000");
  }

  @And("ziyaretci Property Type ddm menusunde  istgedi ev turunu secer")
  public void ziyaretciPropertyTypeDdmMenusundeIstgediEvTurunuSecer() {
    Select selectProperty = new Select(homePage.sefSearchBoxPropertyTypeDDM);
    selectProperty.selectByValue("3");
  }

  @And("ziyaretci Bed Rooms\"ddm menusunde istedigi  Bedroom turunu secer")
  public void ziyaretciBedRoomsDdmMenusundeIstedigiBedroomTurunuSecer() throws Throwable {    // Write code here that turns the phrase above into concrete actions    throw new cucumber.api.PendingException();}
    Select selectBedroom = new Select(homePage.sefSearchBoxBedroomTypeDDM);
    selectBedroom.selectByValue("3");
  }

  @And("ziyaretci anasayfada yer alan Search for location  box icine yazi ve rakam girer")
  public void ziyaretciAnasayfadaYerAlanSearchForLocationBoxIcineYaziVeRakamGirer() {
    homePage.sefUserSearhforloactionboxElementi.sendKeys("zonya42@");
    homePage.sefUserSearhforloactionboxElementi.click();
    ReusableMethods.wait(1);
    homePage.sefUserSearhforloactionboxElementi.sendKeys(Keys.BACK_SPACE);
    homePage.sefUserSearhforloactionboxElementi.sendKeys(Keys.BACK_SPACE);
    homePage.sefUserSearhforloactionboxElementi.sendKeys(Keys.BACK_SPACE);
    homePage.sefUserSearhforloactionboxElementi.sendKeys(Keys.BACK_SPACE);
    homePage.sefUserSearhforloactionboxElementi.sendKeys(Keys.BACK_SPACE);
    homePage.sefUserSearhforloactionboxElementi.sendKeys(Keys.BACK_SPACE);
    homePage.sefUserSearhforloactionboxElementi.sendKeys(Keys.BACK_SPACE);
    homePage.sefUserSearhforloactionboxElementi.sendKeys(Keys.BACK_SPACE);
  }

  @And("ziyaretci Min Price ddm menusunde  listede olmayan fiyat giris testi")
  public void ziyaretciMinPriceDdmMenusundeListedeOlmayanFiyatGirisTesti() {
    Select selectMinPrice=new Select(homePage.sefSearchBoxMinPriceDDM);
    selectMinPrice.selectByValue("200");
  }

  @And("ziyaretci MaxPrice ddm menusunde listede olmayan fiyat giris testi")
  public void ziyaretciMaxPriceDdmMenusundeListedeOlmayanFiyatGirisTesti() {
    Select selectMax=new Select(homePage.sefSearchBoxMaxPriceDDM);
    selectMax.selectByValue("70000000");

  }

  @And("ziyaretci Property Type ddm menusunde  listede olmayan tur giris testi")
  public void ziyaretciPropertyTypeDdmMenusundeListedeOlmayanTurGirisTesti() {
    Select  selectProperty=new Select(homePage.sefSearchBoxPropertyTypeDDM);
    selectProperty.selectByValue("10");
  }

  @And("ziyaretci Bed Rooms\"ddm menusunde ddm menusunde  listede olmayan tur giris testi")
  public void ziyaretciBedRoomsDdmMenusundeDdmMenusundeListedeOlmayanTurGirisTesti() {
    Select  selectBedroom=new Select(homePage.sefSearchBoxBedroomTypeDDM);
    selectBedroom.selectByValue("6");
  }





  @And("ziyaretci ana sayfa yuklendikten sonra sayfa sonunda yer alan footer bolumune scroll yapar")
  public void ziyaretciAnaSayfaYuklendiktenSonraSayfaSonundaYerAlanFooterBolumuneScrollYapar() {
    ReusableMethods.hover(homePage.SefFooterElementi);
    homePage.sefUsercookies.click();
    ReusableMethods.wait(2);
  }

  @And("ziyaretci test object de bahsedilen ogelerin footer da ust basliklarin ve alt dizinlinlerin footer icinde goruntulendigini test eder.")
  public void ziyaretciTestObjectDeBahsedilenOgelerinFooterDaUstBasliklarinVeAltDizinlinlerinFooterIcindeGoruntulendiginiTestEder() {
    List <String> footerAltUstDizinList=ReusableMethods.getStringList(homePage.sefFooterGenelList);
    System.out.println(footerAltUstDizinList);
    String expetedFooterElements="[4655 Wild Indigo St Houston Tx 77027-7080 Usa\n" +
            "+1 246-345-0695\n" +
            "info@hauseheaven.com, About\n" +
            "About us\n" +
            "Contact us\n" +
            "Terms & Conditions, More Information\n" +
            "All properties\n" +
            "Houses for sale\n" +
            "Houses for rent, News\n" +
            "The Benefits Of Investing In Emerging Real Estate Markets\n" +
            "A Guide To Negotiating The Best Deal On Your Dream Home\n" +
            "The Rise Of Sustainable Homes: Building For A Greener Future\n" +
            "How to Stage Your Home for a Quick and Profitable Sale\n" +
            "Investing in Vacation Rental Properties: A Lucrative Opportunity, Download Apps\n" +
            "Google Play\n" +
            "Get It Now\n" +
            "App Store\n" +
            "Now it Available]";
    for (String eachelements : footerAltUstDizinList) {
      Assertions.assertTrue(expetedFooterElements.contains(eachelements));

    }

  }

  @And("ziyaretci footer bolumunde sirket adres bilgilerinin yer aldigini dogrular")
  public void ziyaretciFooterBolumundeSirketAdresBilgilerininYerAldiginiDogrular() {
    Assertions.assertTrue(homePage.seffooterAddresselementi.isDisplayed());

  }

  @And("ziyaretci footer bolumunde hauseheaven logosun yer aldigini dogrular")
  public void ziyaretciFooterBolumundeHauseheavenLogosunYerAldiginiDogrular() {
    Assertions.assertTrue(homePage.sefFooterLogo.isDisplayed());

  }

  @And("ziyaretci footer bolumunde yer alan {string} tab'ina tiklar")
  public void ziyaretciFooterBolumundeYerAlanTabInaTiklar(String tabinadi) {
  homePage.sefFooterAboutUsElementi.click();
  }


  @And("ziyaretci footer bolumunde yer alan About Us tab'ina tiklar")
  public void ziyaretciFooterBolumundeYerAlanAboutUsTabInaTiklar() {
    homePage.sefFooterAboutUsElementi.click();
  }

  @And("ziyaretci ayni sekmede About Us sayfasinin acildigini kontrol eder")
  public void ziyaretciAyniSekmedeAboutUsSayfasininAcildiginiKontrolEder() {
    int winHandleTimes = 1;
    Assertions.assertEquals(Driver.getDriver().getWindowHandles().size(), winHandleTimes);
  }

  @And("ziyaretci About Us sayfasinda asagiya footer bolumune scroll yapar")
  public void ziyaretciAboutUsSayfasindaAsagiyaFooterBolumuneScrollYapar() {
    ReusableMethods.hover(homePage.SefFooterElementi);
    ReusableMethods.wait(2);
  }

  @And("ziyaretci guideline da verilen footer ogelerinin About Ussayfasinin altinda yer aldigini  kontrol eder")
  public void ziyaretciGuidelineDaVerilenFooterOgelerininAboutUssayfasininAltindaYerAldiginiKontrolEder() {
    List<String> footerAltUstDizinList = ReusableMethods.getStringList(homePage.sefFooterGenelList);
    System.out.println(footerAltUstDizinList);
    String expetedFooterElements = "[4655 Wild Indigo St Houston Tx 77027-7080 Usa\n" +
            "+1 246-345-0695\n" +
            "info@hauseheaven.com, About\n" +
            "About us\n" +
            "Contact us\n" +
            "Terms & Conditions, More Information\n" +
            "All properties\n" +
            "Houses for sale\n" +
            "Houses for rent, News\n" +
            "The Benefits Of Investing In Emerging Real Estate Markets\n" +
            "A Guide To Negotiating The Best Deal On Your Dream Home\n" +
            "The Rise Of Sustainable Homes: Building For A Greener Future\n" +
            "How to Stage Your Home for a Quick and Profitable Sale\n" +
            "Investing in Vacation Rental Properties: A Lucrative Opportunity, Download Apps\n" +
            "Google Play\n" +
            "Get It Now\n" +
            "App Store\n" +
            "Now it Available]";
  }

  @And("ziyaretci halen  About Us sayfasinda oldgunu dogrular")
  public void ziyaretciHalenAboutUsSayfasindaOldgunuDogrular() {
    String expectedUrl="https://qa.hauseheaven.com/about-us";
    String actualUrl=Driver.getDriver().getCurrentUrl();
    Assertions.assertEquals(actualUrl,expectedUrl);

  }

  @And("ziyaretci footer bolumunde yer alan ContactUS tab'ina tiklar")
  public void ziyaretciFooterBolumundeYerAlanContactUSTabInaTiklar() {
    homePage.sefFooterContactUsElmenti.click();

  }

  @And("ziyaretci ayni sekmede ContactUS sayfasinin acildigini kontrol eder")
  public void ziyaretciAyniSekmedeContactUSSayfasininAcildiginiKontrolEder() {
    int winHandleTimes = 1;
    Assertions.assertEquals(Driver.getDriver().getWindowHandles().size(), winHandleTimes);

  }

  @And("ziyaretci ContactUS sayfasinda asagiya footer bolumune scroll yapar")
  public void ziyaretciContactUSSayfasindaAsagiyaFooterBolumuneScrollYapar() {
    ReusableMethods.hover(homePage.SefFooterElementi);
    ReusableMethods.wait(2);
  }

  @And("ziyaretci guideline da verilen footer ogelerinin ContactUS sayfasinin altinda yer aldigini  kontrol eder")
  public void ziyaretciGuidelineDaVerilenFooterOgelerininContactUSSayfasininAltindaYerAldiginiKontrolEder() {
    List<String> footerAltUstDizinList = ReusableMethods.getStringList(homePage.sefFooterGenelList);
    System.out.println(footerAltUstDizinList);
    String expetedFooterElements = "[4655 Wild Indigo St Houston Tx 77027-7080 Usa\n" +
            "+1 246-345-0695\n" +
            "info@hauseheaven.com, About\n" +
            "About us\n" +
            "Contact us\n" +
            "Terms & Conditions, More Information\n" +
            "All properties\n" +
            "Houses for sale\n" +
            "Houses for rent, News\n" +
            "The Benefits Of Investing In Emerging Real Estate Markets\n" +
            "A Guide To Negotiating The Best Deal On Your Dream Home\n" +
            "The Rise Of Sustainable Homes: Building For A Greener Future\n" +
            "How to Stage Your Home for a Quick and Profitable Sale\n" +
            "Investing in Vacation Rental Properties: A Lucrative Opportunity, Download Apps\n" +
            "Google Play\n" +
            "Get It Now\n" +
            "App Store\n" +
            "Now it Available]";
    for (String eachelements : footerAltUstDizinList) {
      Assertions.assertTrue(expetedFooterElements.contains(eachelements));
    }
  }

  @And("ziyaretci halen  ContactUS sayfasinda oldgunu dogrular")
  public void ziyaretciHalenContactUSSayfasindaOldgunuDogrular() {
    String expectedUrl="https://qa.hauseheaven.com/contact";
    String actualUrl=Driver.getDriver().getCurrentUrl();

    Assertions.assertEquals(actualUrl,expectedUrl);


  }

  @And("ziyaretci footer bolumunde yer alan Terms and Conditions tab'ina tiklar")
  public void ziyaretciFooterBolumundeYerAlanTermsAndConditionsTabInaTiklar() {
    homePage.sefFooterTermsandCondtionsElementi.click();

  }

  @And("ziyaretci ayni sekmede Terms and Conditions sayfasinin acildigini kontrol eder")
  public void ziyaretciAyniSekmedeTermsAndConditionsSayfasininAcildiginiKontrolEder() {
    int winHandleTimes = 1;
    Assertions.assertEquals(Driver.getDriver().getWindowHandles().size(), winHandleTimes);

  }

  @And("ziyaretci Terms and Conditions sayfasinda asagiya footer bolumune scroll yapar")
  public void ziyaretciTermsAndConditionsSayfasindaAsagiyaFooterBolumuneScrollYapar() {
    ReusableMethods.hover(homePage.SefFooterElementi);
    ReusableMethods.wait(2);

  }

  @And("ziyaretci guideline da verilen footer ogelerinin Terms and Conditions sayfasinin altinda yer aldigini  kontrol eder")
  public void ziyaretciGuidelineDaVerilenFooterOgelerininTermsAndConditionsSayfasininAltindaYerAldiginiKontrolEder() {
    List<String> footerAltUstDizinList = ReusableMethods.getStringList(homePage.sefFooterGenelList);
    System.out.println(footerAltUstDizinList);
    String expetedFooterElements = "[4655 Wild Indigo St Houston Tx 77027-7080 Usa\n" +
            "+1 246-345-0695\n" +
            "info@hauseheaven.com, About\n" +
            "About us\n" +
            "Contact us\n" +
            "Terms & Conditions, More Information\n" +
            "All properties\n" +
            "Houses for sale\n" +
            "Houses for rent, News\n" +
            "The Benefits Of Investing In Emerging Real Estate Markets\n" +
            "A Guide To Negotiating The Best Deal On Your Dream Home\n" +
            "The Rise Of Sustainable Homes: Building For A Greener Future\n" +
            "How to Stage Your Home for a Quick and Profitable Sale\n" +
            "Investing in Vacation Rental Properties: A Lucrative Opportunity, Download Apps\n" +
            "Google Play\n" +
            "Get It Now\n" +
            "App Store\n" +
            "Now it Available]";
    for (String eachelements : footerAltUstDizinList) {
      Assertions.assertTrue(expetedFooterElements.contains(eachelements));
    }
  }

  @And("ziyaretci halen Terms and Conditionssayfasinda oldgunu dogrular")
  public void ziyaretciHalenTermsAndConditionssayfasindaOldgunuDogrular() {
    String expectedUrl = "https://qa.hauseheaven.com/terms-amp-conditions";
    String actualUrl = Driver.getDriver().getCurrentUrl();

  }

  @And("ziyaretci footer bolumunde yer alan All Properties tab'ina tiklar")
  public void ziyaretciFooterBolumundeYerAlanAllPropertiesTabInaTiklar() {
    homePage.sefFooterAllPropertiesElementi.click();

  }

  @And("ziyaretci ayni sekmede All Properties sayfasinin acildigini kontrol eder")
  public void ziyaretciAyniSekmedeAllPropertiesSayfasininAcildiginiKontrolEder() {
    int winHandleTimes = 1;
    Assertions.assertEquals(Driver.getDriver().getWindowHandles().size(), winHandleTimes);

  }

  @And("ziyaretci All Properties sayfasinda asagiya footer bolumune scroll yapar")
  public void ziyaretciAllPropertiesSayfasindaAsagiyaFooterBolumuneScrollYapar() {
    ReusableMethods.hover(homePage.SefFooterElementi);
    ReusableMethods.wait(2);

  }

  @And("ziyaretci guideline da verilen footer ogelerinin All Properties sayfasinin altinda yer aldigini  kontrol eder")
  public void ziyaretciGuidelineDaVerilenFooterOgelerininAllPropertiesSayfasininAltindaYerAldiginiKontrolEder() {
    //Ziyaretci guideline da verilen footer ogelerinin "All Properties "sayfasinin altinda yer aldigini  kontrol eder
    List<String> footerAltUstDizinList = ReusableMethods.getStringList(homePage.sefFooterGenelList);
    System.out.println(footerAltUstDizinList);
    String expetedFooterElements = "[4655 Wild Indigo St Houston Tx 77027-7080 Usa\n" +
            "+1 246-345-0695\n" +
            "info@hauseheaven.com, About\n" +
            "About us\n" +
            "Contact us\n" +
            "Terms & Conditions, More Information\n" +
            "All properties\n" +
            "Houses for sale\n" +
            "Houses for rent, News\n" +
            "The Benefits Of Investing In Emerging Real Estate Markets\n" +
            "A Guide To Negotiating The Best Deal On Your Dream Home\n" +
            "The Rise Of Sustainable Homes: Building For A Greener Future\n" +
            "How to Stage Your Home for a Quick and Profitable Sale\n" +
            "Investing in Vacation Rental Properties: A Lucrative Opportunity, Download Apps\n" +
            "Google Play\n" +
            "Get It Now\n" +
            "App Store\n" +
            "Now it Available]";
    for (String eachelements : footerAltUstDizinList) {
      Assertions.assertTrue(expetedFooterElements.contains(eachelements));
    }
  }

  @And("ziyaretci halen All Properties sayfasinda oldgunu dogrular")
  public void ziyaretciHalenAllPropertiesSayfasindaOldgunuDogrular() {
    String expectedUrl="https://qa.hauseheaven.com/properties";
    String actualUrl=Driver.getDriver().getCurrentUrl();

  }

  @And("ziyaretci footer bolumunde yer alan HauseForSale tab'ina tiklar")
  public void ziyaretciFooterBolumundeYerAlanHauseForSaleTabInaTiklar() {
    homePage.sefFooterHouseForRentElementi.click();

  }

  @And("ziyaretci ayni sekmede HauseForSale sayfasinin acildigini kontrol eder")
  public void ziyaretciAyniSekmedeHauseForSaleSayfasininAcildiginiKontrolEder() {
    int winHandleTimes = 1;
    Assertions.assertEquals(Driver.getDriver().getWindowHandles().size(), winHandleTimes);
  }

  @And("ziyaretci HauseForSale sayfasinda asagiya footer bolumune scroll yapar")
  public void ziyaretciHauseForSaleSayfasindaAsagiyaFooterBolumuneScrollYapar() {
    ReusableMethods.hover(homePage.SefFooterElementi);
    ReusableMethods.wait(2);

  }

  @And("ziyaretci guideline da verilen footer ogelerinin HauseForSale sayfasinin altinda yer aldigini  kontrol eder")
  public void ziyaretciGuidelineDaVerilenFooterOgelerininHauseForSaleSayfasininAltindaYerAldiginiKontrolEder() {
    List<String> footerAltUstDizinList = ReusableMethods.getStringList(homePage.sefFooterGenelList);
    System.out.println(footerAltUstDizinList);
    String expetedFooterElements = "[4655 Wild Indigo St Houston Tx 77027-7080 Usa\n" +
            "+1 246-345-0695\n" +
            "info@hauseheaven.com, About\n" +
            "About us\n" +
            "Contact us\n" +
            "Terms & Conditions, More Information\n" +
            "All properties\n" +
            "Houses for sale\n" +
            "Houses for rent, News\n" +
            "The Benefits Of Investing In Emerging Real Estate Markets\n" +
            "A Guide To Negotiating The Best Deal On Your Dream Home\n" +
            "The Rise Of Sustainable Homes: Building For A Greener Future\n" +
            "How to Stage Your Home for a Quick and Profitable Sale\n" +
            "Investing in Vacation Rental Properties: A Lucrative Opportunity, Download Apps\n" +
            "Google Play\n" +
            "Get It Now\n" +
            "App Store\n" +
            "Now it Available]";
    for (String eachelements : footerAltUstDizinList) {
      Assertions.assertTrue(expetedFooterElements.contains(eachelements));
    }
  }

  @And("ziyaretci halen HauseForSale sayfasinda oldgunu dogrular")
  public void ziyaretciHalenHauseForSaleSayfasindaOldgunuDogrular() {
    String expectedUrl="https://qa.hauseheaven.com/properties?type=rent";
    String actualUrl=Driver.getDriver().getCurrentUrl();

    Assertions.assertEquals(actualUrl,expectedUrl);

  }

  @And("ziyaretci footer bolumunde yer alan Hause for Rent tab'ina tiklar")
  public void ziyaretciFooterBolumundeYerAlanHauseForRentTabInaTiklar() {
    homePage.sefFooterHouseForRentElementi.click();

  }

  @And("ziyaretci ayni sekmede Hause for Rent sayfasinin acildigini kontrol eder")
  public void ziyaretciAyniSekmedeHauseForRentSayfasininAcildiginiKontrolEder() {
    int winHandleTimes = 1;
    Assertions.assertEquals(Driver.getDriver().getWindowHandles().size(), winHandleTimes);

  }

  @And("ziyaretci Hause for Rent sayfasinda asagiya footer bolumune scroll yapar")
  public void ziyaretciHauseForRentSayfasindaAsagiyaFooterBolumuneScrollYapar() {
    ReusableMethods.hover(homePage.SefFooterElementi);
    ReusableMethods.wait(2);
  }

  @And("ziyaretci guideline da verilen footer ogelerinin Hause of Rent sayfasinin altinda yer aldigini  kontrol eder")
  public void ziyaretciGuidelineDaVerilenFooterOgelerininHauseOfRentSayfasininAltindaYerAldiginiKontrolEder() {
    List<String> footerAltUstDizinList = ReusableMethods.getStringList(homePage.sefFooterGenelList);
    System.out.println(footerAltUstDizinList);
    String expetedFooterElements = "[4655 Wild Indigo St Houston Tx 77027-7080 Usa\n" +
            "+1 246-345-0695\n" +
            "info@hauseheaven.com, About\n" +
            "About us\n" +
            "Contact us\n" +
            "Terms & Conditions, More Information\n" +
            "All properties\n" +
            "Houses for sale\n" +
            "Houses for rent, News\n" +
            "The Benefits Of Investing In Emerging Real Estate Markets\n" +
            "A Guide To Negotiating The Best Deal On Your Dream Home\n" +
            "The Rise Of Sustainable Homes: Building For A Greener Future\n" +
            "How to Stage Your Home for a Quick and Profitable Sale\n" +
            "Investing in Vacation Rental Properties: A Lucrative Opportunity, Download Apps\n" +
            "Google Play\n" +
            "Get It Now\n" +
            "App Store\n" +
            "Now it Available]";
    for (String eachelements : footerAltUstDizinList) {
      Assertions.assertTrue(expetedFooterElements.contains(eachelements));
    }
  }

  @And("ziyaretci halen Hause for Rent sayfasinda oldgunu dogrular")
  public void ziyaretciHalenHauseForRentSayfasindaOldgunuDogrular() {
    String expectedUrl="https://qa.hauseheaven.com/properties?type=rent";
    String actualUrl=Driver.getDriver().getCurrentUrl();

    Assertions.assertEquals(actualUrl,expectedUrl);

  }

  @And("ziyaretci footer bolumunde yer alan Benefit of Investing tab'ina tiklar")
  public void ziyaretciFooterBolumundeYerAlanBenefitOfInvestingTabInaTiklar() {
    homePage.sefFooterBenefirInvestingElementi.click();
    ReusableMethods.getFullScreenshot(Driver.getDriver());
  }

  @And("ziyaretci ayni sekmede Benefit of Investing sayfasinin acildigini kontrol eder")
  public void ziyaretciAyniSekmedeBenefitOfInvestingSayfasininAcildiginiKontrolEder() {
    int winHandleTimes = 1;
    Assertions.assertEquals(Driver.getDriver().getWindowHandles().size(), winHandleTimes);

  }

  @And("ziyaretci Benefit of Investing sayfasinda asagiya footer bolumune scroll yapar")
  public void ziyaretciBenefitOfInvestingSayfasindaAsagiyaFooterBolumuneScrollYapar() {
    ReusableMethods.hover(homePage.SefFooterElementi);
    ReusableMethods.wait(2);

  }

  @And("ziyaretci guideline da verilen footer ogelerinin Benefit of Investing sayfasinin altinda yer aldigini  kontrol eder")
  public void ziyaretciGuidelineDaVerilenFooterOgelerininBenefitOfInvestingSayfasininAltindaYerAldiginiKontrolEder() {
    List<String> footerAltUstDizinList = ReusableMethods.getStringList(homePage.sefFooterGenelList);
    System.out.println(footerAltUstDizinList);
    String expetedFooterElements = "[4655 Wild Indigo St Houston Tx 77027-7080 Usa\n" +
            "+1 246-345-0695\n" +
            "info@hauseheaven.com, About\n" +
            "About us\n" +
            "Contact us\n" +
            "Terms & Conditions, More Information\n" +
            "All properties\n" +
            "Houses for sale\n" +
            "Houses for rent, News\n" +
            "The Benefits Of Investing In Emerging Real Estate Markets\n" +
            "A Guide To Negotiating The Best Deal On Your Dream Home\n" +
            "The Rise Of Sustainable Homes: Building For A Greener Future\n" +
            "How to Stage Your Home for a Quick and Profitable Sale\n" +
            "Investing in Vacation Rental Properties: A Lucrative Opportunity, Download Apps\n" +
            "Google Play\n" +
            "Get It Now\n" +
            "App Store\n" +
            "Now it Available]";
    for (String eachelements : footerAltUstDizinList) {
      Assertions.assertTrue(expetedFooterElements.contains(eachelements));
     }
     }

  @And("ziyaretci halen Benefit of Investing sayfasinda oldgunu dogrular")
  public void ziyaretciHalenBenefitOfInvestingSayfasindaOldgunuDogrular() {
    String expectedUrl="https://hauseheaven.com/news/benefit-of-investing";
    String actualUrl=Driver.getDriver().getCurrentUrl();
    Assertions.assertEquals(actualUrl,expectedUrl);
  }

  @And("ziyaretci footer bolumunde yer alan A Guide Story tab'ina tiklar")
  public void ziyaretciFooterBolumundeYerAlanAGuideStoryTabInaTiklar() {
    homePage.sefFooterAGuideToNegoElementi.click();
    ReusableMethods.getFullScreenshot(Driver.getDriver());
  }

  @And("ziyaretci ayni sekmede A Guide Story sayfasinin acildigini kontrol eder")
  public void ziyaretciAyniSekmedeAGuideStorySayfasininAcildiginiKontrolEder() {
    int winHandleTimes = 1;
    Assertions.assertEquals(Driver.getDriver().getWindowHandles().size(), winHandleTimes);

  }

  @And("ziyaretci A Guide Story sayfasinda asagiya footer bolumune scroll yapar")
  public void ziyaretciAGuideStorySayfasindaAsagiyaFooterBolumuneScrollYapar() {
    ReusableMethods.hover(homePage.SefFooterElementi);
    ReusableMethods.wait(2);

  }

  @And("ziyaretci guideline da verilen footer ogelerinin A Guide Story sayfasinin altinda yer aldigini  kontrol eder")
  public void ziyaretciGuidelineDaVerilenFooterOgelerininAGuideStorySayfasininAltindaYerAldiginiKontrolEder() {
    List<String> footerAltUstDizinList = ReusableMethods.getStringList(homePage.sefFooterGenelList);
    System.out.println(footerAltUstDizinList);
    String expetedFooterElements = "[4655 Wild Indigo St Houston Tx 77027-7080 Usa\n" +
            "+1 246-345-0695\n" +
            "info@hauseheaven.com, About\n" +
            "About us\n" +
            "Contact us\n" +
            "Terms & Conditions, More Information\n" +
            "All properties\n" +
            "Houses for sale\n" +
            "Houses for rent, News\n" +
            "The Benefits Of Investing In Emerging Real Estate Markets\n" +
            "A Guide To Negotiating The Best Deal On Your Dream Home\n" +
            "The Rise Of Sustainable Homes: Building For A Greener Future\n" +
            "How to Stage Your Home for a Quick and Profitable Sale\n" +
            "Investing in Vacation Rental Properties: A Lucrative Opportunity, Download Apps\n" +
            "Google Play\n" +
            "Get It Now\n" +
            "App Store\n" +
            "Now it Available]";
    for (String eachelements : footerAltUstDizinList) {
      Assertions.assertTrue(expetedFooterElements.contains(eachelements));
    }
  }

  @And("ziyaretci halen A Guide Story sayfasinda oldgunu dogrular")
  public void ziyaretciHalenAGuideStorySayfasindaOldgunuDogrular() {
    String expectedUrl="https://hauseheaven.com/news/a-guide-to-negotiating";
    String actualUrl=Driver.getDriver().getCurrentUrl();

    Assertions.assertEquals(actualUrl,expectedUrl);

  }

  @And("ziyaretci footer bolumunde yer alanRaise  tab'ina tiklar")
  public void ziyaretciFooterBolumundeYerAlanRaiseTabInaTiklar() {
    homePage.sefFooterRiseOfSustainebaleElementi.click();
    ReusableMethods.getFullScreenshot(Driver.getDriver());
  }

  @And("ziyaretci ayni sekmedeRaise  sayfasinin acildigini kontrol eder")
  public void ziyaretciAyniSekmedeRaiseSayfasininAcildiginiKontrolEder() {
    int winHandleTimes = 1;
    Assertions.assertEquals(Driver.getDriver().getWindowHandles().size(), winHandleTimes);

  }

  @And("ziyaretciRaise  sayfasinda asagiya footer bolumune scroll yapar")
  public void ziyaretciraiseSayfasindaAsagiyaFooterBolumuneScrollYapar() {
    ReusableMethods.hover(homePage.SefFooterElementi);
    ReusableMethods.wait(2);
  }

  @And("ziyaretci guideline da verilen footer ogelerininRaise  sayfasinin altinda yer aldigini  kontrol eder")
  public void ziyaretciGuidelineDaVerilenFooterOgelerininRaiseSayfasininAltindaYerAldiginiKontrolEder() {
    List<String> footerAltUstDizinList = ReusableMethods.getStringList(homePage.sefFooterGenelList);
    System.out.println(footerAltUstDizinList);
    String expetedFooterElements = "[4655 Wild Indigo St Houston Tx 77027-7080 Usa\n" +
            "+1 246-345-0695\n" +
            "info@hauseheaven.com, About\n" +
            "About us\n" +
            "Contact us\n" +
            "Terms & Conditions, More Information\n" +
            "All properties\n" +
            "Houses for sale\n" +
            "Houses for rent, News\n" +
            "The Benefits Of Investing In Emerging Real Estate Markets\n" +
            "A Guide To Negotiating The Best Deal On Your Dream Home\n" +
            "The Rise Of Sustainable Homes: Building For A Greener Future\n" +
            "How to Stage Your Home for a Quick and Profitable Sale\n" +
            "Investing in Vacation Rental Properties: A Lucrative Opportunity, Download Apps\n" +
            "Google Play\n" +
            "Get It Now\n" +
            "App Store\n" +
            "Now it Available]";
    for (String eachelements : footerAltUstDizinList) {
      Assertions.assertTrue(expetedFooterElements.contains(eachelements));
    }
  }

  @And("ziyaretci halenRaise  sayfasinda oldgunu dogrular")
  public void ziyaretciHalenRaiseSayfasindaOldgunuDogrular() {

    String expectedUrl="https://hauseheaven.com/news/the-rise-of-sutainable-homes";
    String actualUrl=Driver.getDriver().getCurrentUrl();

    Assertions.assertEquals(actualUrl,expectedUrl);
  }

  @And("ziyaretci footer bolumunde yer alan  How to Stage tab'ina tiklar")
  public void ziyaretciFooterBolumundeYerAlanHowToStageTabInaTiklar() {
    homePage.sefFooterHowtoStageElementi.click();
    ReusableMethods.getFullScreenshot(Driver.getDriver());
  }

  @And("ziyaretci ayni sekmede  How to Stage  sayfasinin acildigini kontrol eder")
  public void ziyaretciAyniSekmedeHowToStageSayfasininAcildiginiKontrolEder() {
    int winHandleTimes = 1;
    Assertions.assertEquals(Driver.getDriver().getWindowHandles().size(), winHandleTimes);

  }

  @And("ziyaretci  How to Stage  sayfasinda asagiya footer bolumune scroll yapar")
  public void ziyaretciHowToStageSayfasindaAsagiyaFooterBolumuneScrollYapar() {
    ReusableMethods.hover(homePage.SefFooterElementi);
    ReusableMethods.wait(2);

  }

  @And("ziyaretci guideline da verilen footer ogelerinin How to Stage  sayfasinin altinda yer aldigini  kontrol eder")
  public void ziyaretciGuidelineDaVerilenFooterOgelerininHowToStageSayfasininAltindaYerAldiginiKontrolEder() {
    List<String> footerAltUstDizinList = ReusableMethods.getStringList(homePage.sefFooterGenelList);
    System.out.println(footerAltUstDizinList);
    String expetedFooterElements = "[4655 Wild Indigo St Houston Tx 77027-7080 Usa\n" +
            "+1 246-345-0695\n" +
            "info@hauseheaven.com, About\n" +
            "About us\n" +
            "Contact us\n" +
            "Terms & Conditions, More Information\n" +
            "All properties\n" +
            "Houses for sale\n" +
            "Houses for rent, News\n" +
            "The Benefits Of Investing In Emerging Real Estate Markets\n" +
            "A Guide To Negotiating The Best Deal On Your Dream Home\n" +
            "The Rise Of Sustainable Homes: Building For A Greener Future\n" +
            "How to Stage Your Home for a Quick and Profitable Sale\n" +
            "Investing in Vacation Rental Properties: A Lucrative Opportunity, Download Apps\n" +
            "Google Play\n" +
            "Get It Now\n" +
            "App Store\n" +
            "Now it Available]";
    for (String eachelements : footerAltUstDizinList) {
      Assertions.assertTrue(expetedFooterElements.contains(eachelements));
    }
  }

  @And("ziyaretci  halen How to Stage sayfasinda oldgunu dogrular")
  public void ziyaretciHalenHowToStageSayfasindaOldgunuDogrular() {

    String expectedUrl="https://hauseheaven.com/news/how-to-stage-your-home-for-sale";
    String actualUrl=Driver.getDriver().getCurrentUrl();

    Assertions.assertEquals(actualUrl,expectedUrl);


  }

  @And("ziyaretci footer bolumunde yer alan  Investing Link  tab'ina tiklar")
  public void ziyaretciFooterBolumundeYerAlanInvestingLinkTabInaTiklar() {
    homePage.sefFooterRiseOfSustainebaleElementi.click();
    ReusableMethods.getFullScreenshot(Driver.getDriver());
  }

  @And("ziyaretci ayni sekmede  Investing Link   sayfasinin acildigini kontrol eder")
  public void ziyaretciAyniSekmedeInvestingLinkSayfasininAcildiginiKontrolEder() {
    int winHandleTimes = 1;
    Assertions.assertEquals(Driver.getDriver().getWindowHandles().size(), winHandleTimes);

  }

  @And("ziyaretci  Investing Link   sayfasinda asagiya footer bolumune scroll yapar")
  public void ziyaretciInvestingLinkSayfasindaAsagiyaFooterBolumuneScrollYapar() {
    LeventMethods.footerhomepageScroll();

  }

  @And("ziyaretci guideline da verilen footer ogelerinin Investing Link   sayfasinin altinda yer aldigini  kontrol eder")
  public void ziyaretciGuidelineDaVerilenFooterOgelerininInvestingLinkSayfasininAltindaYerAldiginiKontrolEder() {
    LeventMethods.footerOgeKarsilastirma();

  }

  @And("ziyaretci  halen Investing Link  sayfasinda oldgunu dogrular")
  public void ziyaretciHalenInvestingLinkSayfasindaOldgunuDogrular() {

    String expectedUrl = "https://hauseheaven.com/news/investing-in-vacation";
    String actualUrl = Driver.getDriver().getCurrentUrl();

    Assertions.assertEquals(actualUrl, expectedUrl);
  }

  @And("ziyaretci footer bolumunde yer alan Hauseheaven Google App tab'ina tiklar")
  public void ziyaretciFooterBolumundeYerAlanHauseheavenGoogleAppTabInaTiklar() {
    homePage.sefFooterGoogleAPPelementi.click();

  }

  @And("ziyaretci farkli sekmede {string} sayfasinin acildigini kontrol eder")
  public void ziyaretciFarkliSekmedeSayfasininAcildiginiKontrolEder(String arg0) {

    ReusableMethods.getFullScreenshot(Driver.getDriver());
    LeventMethods.windowsHanldes(2);
  }

  @And("ziyaretci footer bolumunde yer alan Hauseheaven Apple App tab'ina tiklar")
  public void ziyaretciFooterBolumundeYerAlanHauseheavenAppleAppTabInaTiklar() {
    homePage.sefFooterAppleAPPElementi.click();

  }

  @And("ziyaretci farkli sekmede Hauseheaven Apple App sayfasinin acildigini kontrol eder")
  public void ziyaretciFarkliSekmedeHauseheavenAppleAppSayfasininAcildiginiKontrolEder() {
    ReusableMethods.getFullScreenshot(Driver.getDriver());
    LeventMethods.windowsHanldes(2);
  }

  @And("Ziyaretci anasayfa footer bolumunde yer alan Subscribe box gecerli email adresi girer")

  public void ziyaretciAnasayfaFooterBolumundeYerAlanSubscribeBoxGecerliEmailAdresiGirer() {
    homePage.sefFooterSubscribeBox.sendKeys(faker.internet().emailAddress());

  }

  @And("ziyaretci anasayfa footer bolumunde yer alan subsribe buttonu tiklar")
  public void ziyaretciAnasayfaFooterBolumundeYerAlanSubsribeButtonuTiklar() {
    homePage.getSefFooterSubscribeBoxButtonElementi.click();

  }

  @And("ziyaretci Email adresinin basarali sekilde kaydedilgini dogrular")
  public void ziyaretciEmailAdresininBasaraliSekildeKaydedilginiDogrular() {

    ReusableMethods.wait(4);
    Assertions.assertTrue(homePage.seffooterSubscribeConfirmYaziElementi.isDisplayed());
  }

  @And("ziyaretci footer bolumunde yer alan {string} logosuna  tiklar")
  public void ziyaretciFooterBolumundeYerAlanLogosunaTiklar(String arg0) {
    homePage.SeffooterfacebookBoxElementi.click();

  }

  @And("ziyaretci yeni sekmede {string} sayfasinin ayri sekmede acildigini kontrol eder")
  public void ziyaretciYeniSekmedeSayfasininAyriSekmedeAcildiginiKontrolEder(String arg0) {
    ReusableMethods.wait(3);
    LeventMethods.windowsHanldes(2);
  }

  @And("ziyaretci footer bolumunde yer alan Twitter logosuna  tiklar")
  public void ziyaretciFooterBolumundeYerAlanTwitterLogosunaTiklar() {
    homePage.SeftwitterBoxButtonElementi.click();

  }

  @And("ziyaretci yeni sekmede Hauseheaven-Twitter sayfasinin ayri sekmede acildigini kontrol eder")
  public void ziyaretciYeniSekmedeHauseheavenTwitterSayfasininAyriSekmedeAcildiginiKontrolEder() {
    LeventMethods.windowsHanldes(2);

  }

  @And("ziyaretci Twitter'in resmi websitesine gittigini onaylar")
  public void ziyaretciTwitterInResmiWebsitesineGittiginiOnaylar() {
    String expectedUrL="https://www.twitter.com/";
    String actualurl=Driver.getDriver().getCurrentUrl();
    Assertions.assertEquals(actualurl,expectedUrL);
    ReusableMethods.getFullScreenshot(Driver.getDriver());
  }

  @And("ziyaretci footer bolumunde yer alan Instagram  logosuna  tiklar")
  public void ziyaretciFooterBolumundeYerAlanInstagramLogosunaTiklar() {
    homePage.SefFooterInstagramButtonElementi.click();

  }

  @And("ziyaretci yeni sekmede Hauseheaven-Instagram sayfasinin ayri sekmede acildigini kontrol eder")
  public void ziyaretciYeniSekmedeHauseheavenInstagramSayfasininAyriSekmedeAcildiginiKontrolEder() {
    LeventMethods.windowsHanldes(2);

  }

  @And("ziyaretci footer bolumunde yer alan Linkedin  logosuna  tiklar")
  public void ziyaretciFooterBolumundeYerAlanLinkedinLogosunaTiklar() {
    homePage.SefFooterLinkedinButtonElementi.click();

  }

  @And("ziyaretci yeni sekmede Hauseheaven-Linkedinsayfasinin ayri sekmede acildigini kontrol eder")
  public void ziyaretciYeniSekmedeHauseheavenLinkedinsayfasininAyriSekmedeAcildiginiKontrolEder() {
    LeventMethods.windowsHanldes(2);

  }

  @And("ziyaretci footer bolumunde yer alan Pinterest  logosuna  tiklar")
  public void ziyaretciFooterBolumundeYerAlanPinterestLogosunaTiklar() {
    homePage.SefFooterPintestButtonElementi.click();

  }

  @And("ziyaretci yeni sekmede Hauseheaven-Pinterest ayri sekmede acildigini kontrol eder")
  public void ziyaretciYeniSekmedeHauseheavenPinterestAyriSekmedeAcildiginiKontrolEder() {
    LeventMethods.windowsHanldes(2);


  }
}