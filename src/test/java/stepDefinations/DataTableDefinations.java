package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.DataBaseTablePages;
import utilities.ConfigReader;
import utilities.Driver;

public class DataTableDefinations {
DataBaseTablePages dataBaseTablePages=new DataBaseTablePages();

    @When("kullanici {string} icin arama yapar")
    public void kullanici_icin_arama_yapar(String dataTablesUrl) {
        Driver.getDriver().get(ConfigReader.getProperty("dataTablesUrl"));
        
    }
    @Then("new butonuna basar")
    public void new_butonuna_basar() {
        dataBaseTablePages.newBotonu.click();

        
    }
    @Then("isim bolumune {string} yazar")
    public void isim_bolumune_yazar(String string) {
       dataBaseTablePages.firsNameKutusu.sendKeys("AAAAA");
    }
    @Then("soyisim bolumune {string} yazar")
    public void soyisim_bolumune_yazar(String string) {
        dataBaseTablePages.lastNameKutusu.sendKeys("ABBBBB");
        
    }
    @Then("position bolumune {string} yazar")
    public void position_bolumune_yazar(String string) {
      dataBaseTablePages.positionKutusu.sendKeys("Tester");
    }
    @Then("office bolumune {string} yazar")
    public void office_bolumune_yazar(String string) {
        dataBaseTablePages.officeKutusu.sendKeys("Üst Kat");
       
    }
    @Then("extension bolumune {string} yazar")
    public void extension_bolumune_yazar(String string) {
       dataBaseTablePages.ExtensionKutusu.sendKeys("Görgülü");
    }
    @Then("startDate bolumune {string} yazar")
    public void start_date_bolumune_yazar(String string) {
        dataBaseTablePages.startDateKutusu.sendKeys("2022 06 08");
       
    }
    @Then("salary bolumune {string} yazar")
    public void salary_bolumune_yazar(String string) {
      dataBaseTablePages.SalaryKutusu.sendKeys("15000");
    }
    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
       dataBaseTablePages.creatButonu.click();
    }
    @When("kullanici ilk isim ile arama yapar")
    public void kullanici_ilk_isim_ile_arama_yapar() {
        dataBaseTablePages.searchKutusu.sendKeys("Bruno"+ Keys.ENTER);
       
    }
    @Then("isim bolumunde isminin oldugunu dogrular")
    public void isim_bolumunde_isminin_oldugunu_dogrular() {
    String beklenen="Bruno";
    Assert.assertTrue(dataBaseTablePages.arananisimKutusu.getText().contains(beklenen));
    }


    @And("sayfayi kapatir")
    public void sayfayiKapatir() {

    }
}
