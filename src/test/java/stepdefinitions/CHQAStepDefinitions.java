package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.CHQAPage;
import utilities.Driver;

public class CHQAStepDefinitions {

    CHQAPage chqaPage = new CHQAPage();


    @Then("CH Login linkine tiklar.")
    public void ch_login_linkine_tiklar() {

        chqaPage.loginMenu.click();
    }

    @Then("CH Username kutusuna {string} yazar.")
    public void ch_username_kutusuna_yazar(String kullaniciAdi) {

        chqaPage.usernameKutusu.sendKeys(kullaniciAdi);
    }

    @Then("CH Password kutusuna {string} yazar.")
    public void ch_password_kutusuna_yazar(String sifre) {

        chqaPage.passwordKutusu.sendKeys(sifre);
    }

    @Then("CH Login butonuna basar.")
    public void ch_login_butonuna_basar() {

        chqaPage.loginButonu.click();
    }

    @Then("Giris yapilamadigini test eder.")
    public void giris_yapilamadigini_test_eder() {

        Assert.assertTrue(chqaPage.hataliGirisTextElement.isDisplayed());
    }

    @Then("CH basarili giris yapildigini test eder.")
    public void chBasariliGirisYapildiginiTestEder() {

        Assert.assertTrue(Driver.getDriver().getTitle().contains("Admin"));
    }
}
