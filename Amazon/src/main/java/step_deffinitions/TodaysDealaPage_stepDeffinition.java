package step_deffinitions;

import Home.HomePage;
import Home.TodaysDealsPage;
import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class TodaysDealaPage_stepDeffinition extends WebAPI {
    @Before
    public  void openBrowser() throws IOException {
        setUp(false, "browserstack", "os", "x", "chrome", "83", "https://www.amazon.com/"); }

    @After
    public  void closeBrowser() {
        cleanUp(); }
    static HomePage homePage;
    static TodaysDealsPage todaysDealsPage;

    public static void init() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        todaysDealsPage= PageFactory.initElements(driver, TodaysDealsPage.class);
    }

    @Given("Iam at amzon.con home page")
    public void iam_at_amzon_con_home_page() {
        init();

    }

    @When("I click on todays deals")
    public void i_click_on_todays_deals() {
        init();
        todaysDealsPage.setTodaysDealsButton();
    }

    @When("I click on subscribe to get the page")
    public void i_click_on_subscribe_to_get_the_page() {
        init();
        todaysDealsPage.setSubscribeButton();

    }

    @Then("I click to get back to the main page")
    public void i_click_to_get_back_to_the_main_page() {
        init();
       todaysDealsPage.setBacktoHomeBage();

    }

}
