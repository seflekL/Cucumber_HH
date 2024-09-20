package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import pages.AdminDashboard;
import pages.HomePage;
import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.Driver;
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


    @Given("ziyaretci Hauseheaven Url'sine EDGE browser ile erisim saglar")
    public void ziyaretciHauseheavenUrlSineEDGEBrowserIleErisimSaglar() {
        System.setProperty("browser", "edge");
        driver.get("https://qa.hauseheaven.com/");
    }
}