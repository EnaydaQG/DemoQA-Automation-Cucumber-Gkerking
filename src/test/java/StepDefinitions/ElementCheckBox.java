package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ElementCheckBox {
    private WebDriver webDriver;

    @Given("User was in Check Box page")
    public void text_box() throws InterruptedException {
        Thread.sleep(3000);
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.get("https://demoqa.com/checkbox");
        webDriver.manage().window().fullscreen();
        webDriver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
    }
    @And("User click expand all button")
    public void user_set_personal_information() throws InterruptedException {
        Thread.sleep(3000);
        webDriver.findElement(By.xpath(Locators.EXPAND_ALL)).click();
    }
    @When( "User select  one by one the item.")
    public void clickSubmit() throws InterruptedException {
        Thread.sleep(3000);
        webDriver.findElement(By.xpath(Locators.Notes)).click();
        webDriver.findElement(By.xpath(Locators.React)).click();
        //Thread.sleep(3000);
        //webDriver.findElement(By.xpath(Locators.CLASSIFIED)).click();
       /* Thread.sleep(3000);
        webDriver.findElement(By.xpath(Locators.Download)).click();*/


    }
    @Then("User will see a message with the information of selected items")
    public void user_will_see_selected_information() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println(webDriver.findElement(By.xpath("//*[@id=\"result\"]/span[3]")).getText());
        System.out.println(webDriver.findElement(By.xpath("//*[@id=\"result\"]/span[2]")).getText());
        //System.out.println(webDriver.findElement(By.xpath("//*[@id=\"result\"]/span[4]")).getText());
        webDriver.manage().deleteAllCookies();
        webDriver.close();
    }
}
