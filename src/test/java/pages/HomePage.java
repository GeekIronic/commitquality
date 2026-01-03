package pages;

public class HomePage {

    private String NaverHome = "//div[@class='nav-links ']";
    private String TitelHome = "//p[@class='banner-message']";
    private String ListOptionsNaverHome = "//div[@class='nav-links ']//child::a";
    private String[] LinksNaver = {"Products","Add Product","Practice","Learn","Login"};

    public HomePage() {}

    public HomePage(String NaverHome, String TitelHome, String ListOptionsNaverHome, String[] LinksNaver){
        this.NaverHome = NaverHome;
        this.TitelHome = TitelHome;
        this.ListOptionsNaverHome = ListOptionsNaverHome;
        this.LinksNaver = LinksNaver;
    }

    public String[] getLinksNaver() {
        return LinksNaver;
    }

    public String getTitelHome(){
        return this.TitelHome;
    }

    public String getNaverHome(){
        return this.NaverHome;
    }

    public String getListOptionsNaverHome(){
        return this.ListOptionsNaverHome;
    }

}
