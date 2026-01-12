package utils;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FactoryWebElements {

    public static WebElement initWithXapth(WebDriver driver, String xapth){
        WebElement elemento = null;
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            elemento = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xapth)));
            return elemento;
        }catch (Exception e){
            Assert.assertTrue("Elemento web no encontrado",false);
        }
        return elemento;
    }

}
