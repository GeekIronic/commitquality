package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.FactoryWebElements;

public class HomePage {

    public static WebElement getInputNaverHome(WebDriver driver){
        return FactoryWebElements.initWithXapth(driver, "//div[@class='nav-links ']");
    }


    //private String NaverHome = "//div[@class='nav-links ']";
    private String TitelHome = "//p[@class='banner-message']";
    private String ListOptionsNaverHome = "//div[@class='nav-links ']//child::a";
    private String[] LinksNaver = {"Products","Add Product","Practice","Learn","Login"};
    private String InputQuery = "//input[@class='filter-textbox']";
    private String BtnsQuerys = "//button[@class='filter-button']";

    public HomePage() {}

    public HomePage(String naverHome, String titelHome, String listOptionsNaverHome, String[] linksNaver, String inputQuery, String btnsQuerys) {
        //NaverHome = naverHome;
        TitelHome = titelHome;
        ListOptionsNaverHome = listOptionsNaverHome;
        LinksNaver = linksNaver;
        InputQuery = inputQuery;
        BtnsQuerys = btnsQuerys;
    }

    /* public String getNaverHome() {
        return NaverHome;
    }*/

    public String getTitelHome() {
        return TitelHome;
    }

    public String getListOptionsNaverHome() {
        return ListOptionsNaverHome;
    }

    public String[] getLinksNaver() {
        return LinksNaver;
    }

    public String getInputQuery() {
        return InputQuery;
    }

    public String getBtnsQuerys() {
        return BtnsQuerys;
    }
}
