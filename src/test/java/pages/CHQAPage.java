package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CHQAPage {


    public CHQAPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (linkText = "Log in")
    public WebElement loginMenu;

    @FindBy(xpath="//input[@name='UserName']")
    public WebElement usernameKutusu;

    @FindBy(xpath="//input[@name='Password']")
    public WebElement passwordKutusu;

    @FindBy (xpath = "//input[@id='btnSubmit']")
    public WebElement loginButonu;

    @FindBy(xpath="//span[text()='Try again please']")
    public WebElement hataliGirisTextElement;

}
