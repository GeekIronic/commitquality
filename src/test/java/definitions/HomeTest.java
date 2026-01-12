package definitions;

import configs.WebDriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.HomePage;

import java.util.List;

public class HomeTest {


    WebDriver driver = WebDriverManager.getDriver();
    List<WebElement> NavListPage;
    WebElement getTitelHome;
    WebElement LinkSelectAddProduct;
    WebElement LinkSelectPractice;
    WebElement LinkSelectLearn;
    WebElement LinkSelectLogin;
    WebElement FormAddProduct;

    HomePage homepage = new HomePage();

    @Given("que el usuario entro a la pagina web")
    public void que_el_usuario_entro_a_la_pagina_web() {
        driver.get("https://commitquality.com/");
        driver.manage().window().maximize();
    }

    @And("que el usuario visualiza el naver del home")
    public void que_el_usuario_visualiza_el_naver_del_home() {



        //WebElement naver = driver.findElement(By.xpath(homepage.getNaverHome()));
        getTitelHome = driver.findElement(By.xpath(homepage.getTitelHome()));
        //Assert.assertTrue("El menú de navegación no es visible en la página", naver.isDisplayed());
        Assert.assertTrue("El menú de navegación no es visible en la página", HomePage.getInputNaverHome(driver).isDisplayed());
    }
    @When("el sistema mostrara las opciones habilitadas del naver y visualizara un titulo de entrada")
    public void el_sistema_mostrara_las_opciones_habilitadas_del_naver_y_visualizara_un_titulo_de_entrada() {
        NavListPage = driver.findElements(By.xpath(homepage.getListOptionsNaverHome()));
        /* for (int i = 0; i < NavListPage.size(); i++) {
            System.out.println(NavListPage.get(i).getText());
        }*/
    }
    @Then("el sistema verificara que las opciones habilitabas del naver sean las mismas descritas")
    public void el_sistema_verificara_que_las_opciones_habilitabas_del_naver_sean_las_mismas_descritas() {
        Assert.assertEquals("Products", NavListPage.get(0).getText());
        Assert.assertEquals("Add Product", NavListPage.get(1).getText());
        Assert.assertEquals("Practice", NavListPage.get(2).getText());
        Assert.assertEquals("Learn", NavListPage.get(3).getText());
        Assert.assertEquals("Login", NavListPage.get(4).getText());
    }
    @And("el sistema mostrar el titulo {string}")
    public void el_sistema_mostrar_el_titulo(String TitelHome) throws InterruptedException {
        Assert.assertEquals(TitelHome, getTitelHome.getText());
        Thread.sleep(4000);
    }

    // Redireccion a la opción del naver

    @When("el usuario da clic en la opcion {string}")
    public void el_usuario_da_clic_en_la_opcion(String string) throws InterruptedException {
        LinkSelectAddProduct = driver.findElement(By.xpath("//div[@class='nav-links ']//child::a[@href='/add-product']"));
        LinkSelectPractice = driver.findElement(By.xpath("//div[@class='nav-links ']//child::a[@href='/practice']"));
        LinkSelectLearn = driver.findElement(By.xpath("//div[@class='nav-links ']//child::a[@href='https://www.youtube.com/@commitquality']"));
        LinkSelectLogin = driver.findElement(By.xpath("//div[@class='nav-links ']//child::a[@href='/login']"));
        if (string.equals("Add Product")) {
            Assert.assertEquals(string, LinkSelectAddProduct.getText());
            Thread.sleep(2000);
            LinkSelectAddProduct.click();
        }else if (string.equals("Practice")) {
            Assert.assertEquals(string, LinkSelectPractice.getText());
            Thread.sleep(2000);
            LinkSelectPractice.click();
        } else if (string.equals("Learn")){
            Assert.assertEquals(string, LinkSelectLearn.getText());
            Thread.sleep(2000);
            LinkSelectLearn.click();
        }else if (string.equals("Login")){
            Assert.assertEquals(string, LinkSelectLogin.getText());
            Thread.sleep(2000);
            LinkSelectLogin.click();
        }
        Thread.sleep(4000);
    }
    @Then("el sistema lo redireccionara al formulario de Agregar Producto")
    public void el_sistema_lo_redireccionara_al_formulario_de_agregar_producto() {
        FormAddProduct = driver.findElement(By.xpath("//form"));
        Assert.assertTrue("No se encuentra el formulario de registro", FormAddProduct.isDisplayed());
        WebElement FormAddProductName = driver.findElement(By.xpath("//Form//child::input[@id='name']"));
        WebElement FormAddProductPrice =  driver.findElement(By.xpath("//Form//child::input[@id='price']"));
        WebElement FormAddProductDateStocked =  driver.findElement(By.xpath("//Form//child::input[@id='dateStocked']"));
        WebElement FormAddProductButonSubmit =  driver.findElement(By.xpath("//Form//child::button[@class='btn btn-primary button']"));
        WebElement FormAddProductButonCancel =  driver.findElement(By.xpath("//Form//child::a[@class='btn btn-secondary']"));
        Assert.assertTrue("No existe el campo nombre de producto",FormAddProductName.isDisplayed());
        Assert.assertTrue("No existe el campo precio de producto",FormAddProductPrice.isDisplayed());
        Assert.assertTrue("No existe el campo fecha de producto", FormAddProductDateStocked.isDisplayed());
        Assert.assertTrue("No existe el botón de guardar registro",FormAddProductButonSubmit.isDisplayed());
        Assert.assertTrue("No existe el botón de cancelar registro",FormAddProductButonCancel.isDisplayed());
    }


    @Then("el sistema lo redireccionara a la pagina de Practice mostrando la nota {string}")
    public void el_sistema_lo_redireccionara_a_la_pagina_de_practice_mostrando_la_nota(String string) throws InterruptedException {
        System.out.println("Entro");
        Thread.sleep(4000);
    }

    @Then("el sistema mostrara los cuadros con cada tipo de componente a practricar")
    public void el_sistema_mostrara_los_cuadros_con_cada_tipo_de_componente_a_practricar() throws InterruptedException {
        System.out.println("Entro");
        Thread.sleep(4000);
    }

    @Then("el sistema lo redireccionara al formulario del login")
    public void el_sistema_lo_redireccionara_al_formulario_del_login() throws InterruptedException {
        WebElement titel_login  = driver.findElement(By.xpath("//h1"));
        Assert.assertEquals("Login", titel_login.getText());
        WebElement FormLogin =  driver.findElement(By.xpath("//form"));
        Assert.assertTrue("No se encuentra el formulario", FormLogin.isDisplayed());
        WebElement FormLoginUser = driver.findElement(By.xpath("//form//child::input[@type='text']"));
        WebElement FormLoginPassword = driver.findElement(By.xpath("//form//child::input[@type='password']"));
        WebElement FormLoginButton = driver.findElement(By.xpath("//form//child::button"));
        Assert.assertTrue("No existe el formualrio de login",FormLogin.isDisplayed());
        Assert.assertTrue("No existe el campo de usuario",FormLoginUser.isDisplayed());
        Assert.assertTrue("No existe el campo de password",FormLoginPassword.isDisplayed());
        Assert.assertTrue("No existe el botón de login",FormLoginButton.isDisplayed());
        Thread.sleep(4000);
    }
}
