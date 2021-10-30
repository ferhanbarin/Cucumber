package stepdefinitions;

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
}
