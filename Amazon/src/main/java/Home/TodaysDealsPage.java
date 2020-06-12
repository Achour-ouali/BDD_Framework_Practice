package Home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static webelements.TodaysDealsWebElements.*;

public class TodaysDealsPage extends WebAPI {
    //30182NY_Achour Webelement case N02:
    @FindBy(how= How.XPATH ,using = todaysDealsButtonXP)
    public static WebElement todaysDealsButton;
    @FindBy(how= How.XPATH ,using=SubscribeButtonXP)
    public static WebElement SubscribeButton;
    @FindBy(how= How.XPATH ,using=BacktoHomeBageXP)
    public static WebElement BacktoHomeBage;

    public void setTodaysDealsButton(){ todaysDealsButton.click(); }
        public void setSubscribeButton(){
            SubscribeButton.click();
        }
        public void setBacktoHomeBage(){
            BacktoHomeBage.click();
        }

}
