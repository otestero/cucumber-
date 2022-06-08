package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DataBaseTablePages {
    public DataBaseTablePages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//button[@class='dt-button buttons-create']")
    public WebElement newBotonu;
    @FindBy(xpath = "//input[@id='DTE_Field_first_name']")
    public WebElement firsNameKutusu;
    @FindBy (xpath = "//input[@id='DTE_Field_last_name']")
    public WebElement lastNameKutusu;
    @FindBy(xpath = "//input[@id='DTE_Field_position']")
    public WebElement positionKutusu;
    @FindBy(xpath = "//input[@id='DTE_Field_office']")
    public WebElement officeKutusu;
    @FindBy(xpath = "//input[@id='DTE_Field_extn']")
    public WebElement ExtensionKutusu;
    @FindBy(xpath = "//input[@id='DTE_Field_start_date']")
    public WebElement startDateKutusu;
    @FindBy(xpath = "//input[@id='DTE_Field_salary']")
    public WebElement SalaryKutusu;
    @FindBy(xpath = "//button[@class='btn']")
    public WebElement creatButonu;
    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchKutusu;
    @FindBy(xpath = "//tr[@id='row_43']")
    public WebElement arananisimKutusu;


}
