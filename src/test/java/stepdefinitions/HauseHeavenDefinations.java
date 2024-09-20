package stepdefinitions;

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
}