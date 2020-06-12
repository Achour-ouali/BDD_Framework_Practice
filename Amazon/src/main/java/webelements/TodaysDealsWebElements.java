package webelements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TodaysDealsWebElements {
    //30182NY_Achour testLocators#1
    public static final String message="Amazon is launching";
    //30182NY_Achour testLocators#2:
    public static final String todaysDealsButtonXP ="//*[@id=\"nav-xshop\"]/a[5]";
    public static final String SubscribeButtonXP ="//*[@id=\"gbox-item-0.0.0\"]/div/div/div[2]/a";
    public static final String BacktoHomeBageXP="/html/body/div[4]/div/div/form/span/a";
    //30182NY_Achour testLocators#3:
    public static final String warehouseSectionXP ="//*[@id=\"nav-subnav\"]/a[5]/span";
    public static final String seeAllCategoriesXP="//*[@id=\"leftNav\"]/ul/div/li[8]/span/a/span";
    //30182NY_Achour testLocators#4:
    public static final String amazonDeviceXP ="//*[@id=\"widgetFilters\"]/div[1]/div[2]/span[1]/div/label/input";
    public static final String AddToCartXP="//*[@id=\"101 bc0fd1e9-announce\"]";
    //30182NY_Achour testLocators#5:
    public static final String spportoutdoorsXP ="//*[@id=widgetFilters]/div/div[3]/div[9]/span/a/div/div[2]/span";
    public static final String seedetauilsXP="//*[@id=\"nav-subnav\"]/a[7]/span";
    public static final String addAllToListXP="//*[@id=\"bxw-woot-page\"]/div[1]/div[2]/p/a";
//30182NY_Achour testLocators#6:






    //30182NY_Achour Webelement case N03:
    @FindBy(how= How.XPATH ,using=warehouseSectionXP)
    public static WebElement warehouseSection;
    @FindBy(how= How.XPATH ,using=seeAllCategoriesXP)
    public static WebElement seeAllCategories;
    //30182NY_Achour Webelement case N03:
    @FindBy(how= How.XPATH ,using=amazonDeviceXP)
    public static WebElement amazonDevice;
    @FindBy(how= How.XPATH ,using=AddToCartXP)
    public static WebElement AddToCart;
    //30182NY_Achour Webelement case N04:
    @FindBy(how= How.XPATH ,using=spportoutdoorsXP)
    public static WebElement spportoutdoors;
    @FindBy(how= How.XPATH ,using=seedetauilsXP)
    public static WebElement seedetauils;
    @FindBy(how= How.XPATH ,using=addAllToListXP)
    public static WebElement addAllToList;
}
