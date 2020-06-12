package step_definitions;

import Home.HomePage;
import common.WebAPI;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;

public class HomePage_Stepdeffinition extends WebAPI {

    @Before
    public  void openBrowser() throws IOException {
        setUp(false, "browserstack", "os", "x", "chrome", "83", "https://www.amazon.com/"); }

    @After
    public  void closeBrowser() {
        cleanUp(); }

    static HomePage homePage;

    public static void init() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }


    @Given("I am at amazon Home Page")
    public void i_am_at_amazon_Home_Page() throws IOException {
        init();
    }

    @And("I Enter Hand Sanitizer in search input field")
    public void i_Enter_Hand_Sanitizer_in_search_input_field() {
        init();
        homePage.enterKeyWord("Hand Sanitizer");
    }

    @When("I Click search button")
    public void i_Click_search_button() {
        init();
        homePage.clickSearchButton();
    }

    @Then("I should see Hand Sanitizer")
    public void i_should_see_Hand_Sanitizer() {
        init();
        homePage.validateSearchProduct("\"Hand Sanitizer\"");
    }


    @Given("I Enter {string} in search input field")
    public void i_Enter_in_search_input_field(String string) {
        init();
        homePage.enterKeyWord(string);
    }

    @Then("I should see {string}")
    public void i_should_see(String string) {
        init();
        homePage.validateSearchProduct(string);
    }


    @Given("I Enter Items in search input field")
    public void i_Enter_Items_in_search_input_field(List<String> items) {

        init();
        homePage.validateSearchProduct(items);


    }


}