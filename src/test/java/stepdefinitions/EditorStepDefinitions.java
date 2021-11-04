package stepdefinitions;

import io.cucumber.java.en.Then;
import pages.EditorPage;

public class EditorStepDefinitions {

    EditorPage editorPage = new EditorPage();

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

}
