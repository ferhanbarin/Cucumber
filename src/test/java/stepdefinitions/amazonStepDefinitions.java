package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class amazonStepDefinitions {

    AmazonPage amazonPage = new AmazonPage();

    @When("Kullanici amazon sayfasina gider.")
    public void kullanici_amazon_sayfasina_gider() {

        Driver.getDriver().get(ConfigReader.getProperty("AmazonURL"));
    }

    @When("Nutella icin arama yapar.")
    public void nutella_icin_arama_yapar() {

        amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
    }

    @Then("Sonucun Nutella icerdigini test eder.")
    public void sonucun_nutella_icerdigini_test_eder() {

        Assert.assertTrue(amazonPage.sonucYazisiElement.getText().contains("Nutella"));
    }

    @And("Sayfayi kapatir.")
    public void sayfayi_kapatir() {

        Driver.closeDriver();
    }

    @When("JAVA icin arama yapar.")
    public void java_icin_arama_yapar() {

        amazonPage.aramaKutusu.sendKeys("JAVA" + Keys.ENTER);
    }

    @Then("Sonucun JAVA icerdigini test eder.")
    public void sonucun_java_icerdigini_test_eder() {

        Assert.assertTrue(amazonPage.sonucYazisiElement.getText().contains("JAVA"));
    }

    @When("iPad icin arama yapar.")
    public void i_pad_icin_arama_yapar() {

        amazonPage.aramaKutusu.sendKeys("iPad" + Keys.ENTER);
    }

    @Then("Sonucun iPad icerdigini test eder.")
    public void sonucun_i_pad_icerdigini_test_eder() {

        Assert.assertTrue(amazonPage.sonucYazisiElement.getText().contains("iPad"));
    }
}
