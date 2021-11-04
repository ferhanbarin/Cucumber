package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.EditorPage;
import utilities.Driver;

public class EditorStepDefinitions {

    EditorPage editorPage = new EditorPage();
    Actions actions = new Actions(Driver.getDriver());

    @Then("New butonuna basar.")
    public void new_butonuna_basar() {

        editorPage.newButton.click();
    }

    @Then("Editor firstname kutusuna {string} bilgileri girer.")
    public void editor_firstname_kutusuna_bilgileri_girer(String firstName) {

        editorPage.firstName.sendKeys(firstName);
    }

    @Then("Editor lastname kutusuna {string} bilgileri girer.")
    public void editor_lastname_kutusuna_bilgileri_girer(String lastName) {

        editorPage.lastName.sendKeys(lastName);
    }

    @Then("Editor position kutusuna {string} bilgileri girer.")
    public void editor_position_kutusuna_bilgileri_girer(String position) {

        editorPage.position.sendKeys(position);
    }

    @Then("Editor office kutusuna {string} bilgileri girer.")
    public void editor_office_kutusuna_bilgileri_girer(String office) {

        editorPage.office.sendKeys(office);
    }

    @Then("Editor extension kutusuna {string} bilgileri girer.")
    public void editor_extension_kutusuna_bilgileri_girer(String extension) {

        editorPage.extension.sendKeys(extension);
    }

    @Then("Editor startdate kutusuna {string} bilgileri girer.")
    public void editor_startdate_kutusuna_bilgileri_girer(String startDate) {

        editorPage.startDate.sendKeys(startDate);
    }

    @Then("Editor salary {string} bilgileri girer.")
    public void editor_salary_bilgileri_girer(String salary) {

        editorPage.salary.sendKeys(salary);
    }

    @Then("Create tusuna basar.")
    public void create_tusuna_basar() {

        editorPage.createButton.click();
    }

    @And("Editor ilgili kutulara {string} {string} {string} {string} {string} {string} {string} bilgilerini girer.")
    public void editorIlgiliKutularaBilgileriniGirer(String firstName, String lastName, String position, String office, String extension, String startDate, String salary) {

        actions.sendKeys(firstName).sendKeys(Keys.TAB)
                .sendKeys(lastName).sendKeys(Keys.TAB)
                .sendKeys(position).sendKeys(Keys.TAB)
                .sendKeys(office).sendKeys(Keys.TAB)
                .sendKeys(extension).sendKeys(Keys.TAB)
                .sendKeys(startDate).sendKeys(Keys.TAB)
                .sendKeys(salary)
                .click(editorPage.createButton).perform();
    }

    @Then("{string} ve {string} girerek kaydin tamamlandigini test eder.")
    public void veGirerekKaydinTamamlandiginiTestEder(String firstName, String lastName) {

        editorPage.searchBox.click();
        editorPage.searchBox.sendKeys(firstName + " " + lastName);

        Assert.assertTrue(editorPage.isimAramaIlkSatir.isDisplayed());
    }
}
