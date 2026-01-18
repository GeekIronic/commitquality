package definitions;

import configs.WebDriverManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class QueryTest {

    WebDriver driver = WebDriverManager.getDriver();
    WebElement InputFilter;
    WebElement BtnFilter;
    WebElement BtnResert;

    @When("el usuario visualiza el campo Filter y los botones Filter y Reset")
    public void el_usuario_visualiza_el_campo_filter_y_los_botones_filter_y_reset() throws InterruptedException {
        InputFilter = driver.findElement(By.xpath("//input[@class='filter-textbox']"));
        Assert.assertTrue(InputFilter.isDisplayed());
        BtnFilter = driver.findElement(By.xpath("//button[@data-testid='filter-button']"));
        BtnResert = driver.findElement(By.xpath("//button[@data-testid='reset-filter-button']"));
        Assert.assertTrue(BtnResert.isDisplayed());
        Assert.assertTrue(BtnFilter.isDisplayed());
        Thread.sleep(2000);
    }
    @When("el usuario agrega en el campo busqueda el valor {string} y da clic en Buscar")
    public void el_usuario_agrega_en_el_campo_busqueda_el_valor_y_da_clic_en_buscar(String string) throws InterruptedException {
        InputFilter.sendKeys(string);
        BtnFilter.click();
        Thread.sleep(2000);
    }
    @Then("el sistema mostrar en la tabla de resultados la información que contenga en sus valores el valor {string}")
    public void el_sistema_mostrar_en_la_tabla_de_resultados_la_información_que_contenga_en_sus_valores_el_valor(String string) {
        List<WebElement> ListResult = driver.findElements(By.xpath("//tbody//child::td"));
        Assert.assertTrue(ListResult.size() >  1);
    }

}
