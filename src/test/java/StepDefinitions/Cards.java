package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Cards {
    private WebDriver webDriver;
    @Given("User was on the Home page")
    public void homePage() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.get("https://demoqa.com/");
        webDriver.manage().window().fullscreen();
        webDriver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
    }
    @When("User click Elements")
    public void elements() throws InterruptedException {

        webDriver.findElement(By.xpath(Locators.ELEMENT)).click();

    }
    @Then("User will on the Elements page")
    public  void elementSection () throws InterruptedException {
        Thread.sleep(3000);
        System.out.println(webDriver.findElement(By.xpath("//*[@id='app']/div/div/div[1]/div")).getText());
        webDriver.manage().deleteAllCookies();
        webDriver.close();
    }


    @When("User click Forms")
    public void forms() throws InterruptedException {

        webDriver.findElement(By.xpath(Locators.FORMS)).click();

    }
    @Then("User will on the Forms page")
    public  void formsSection () throws InterruptedException {
        Thread.sleep(3000);
        System.out.println(webDriver.findElement(By.xpath("//*[@id='app']/div/div/div[1]/div")).getText());
        webDriver.manage().deleteAllCookies();
        webDriver.close();
    }


    @When("User click Interactions")
    public void interactions() throws InterruptedException {

        webDriver.findElement(By.xpath(Locators.INTERACTIONS)).click();

    }
    @Then("User will on the Interactions page")
    public  void interactionSection () throws InterruptedException {
        Thread.sleep(3000);
        System.out.println(webDriver.findElement(By.xpath("//*[@id='app']/div/div/div[1]/div")).getText());
        webDriver.manage().deleteAllCookies();
        webDriver.close();
    }


    @When("User click Book Store Application")
    public void bookStoreApplication() throws InterruptedException {

        webDriver.findElement(By.xpath(Locators.BOOK_STORE_APPLICATION)).click();

    }
    @Then("User will on the Book Store Application page")
    public  void bookStoreApplicationSection() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println(webDriver.findElement(By.xpath("//*[@id='app']/div/div/div[1]/div")).getText());
        webDriver.manage().deleteAllCookies();
        webDriver.close();
    }


    @When("User click Widgets")
    public void Widgets() throws InterruptedException {

        webDriver.findElement(By.xpath(Locators.WIDGETS)).click();

    }
    @Then("User will on the Widgets page")
    public  void widgetsSection() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println(webDriver.findElement(By.xpath("//*[@id='app']/div/div/div[1]/div")).getText());
        webDriver.manage().deleteAllCookies();
        webDriver.close();
    }

    @When("User click Alerts, Frame & Windows")
    public void alertsFrameWindows() throws InterruptedException {

        webDriver.findElement(By.xpath(Locators.ALERT_FRAME_WINDOWS)).click();

    }
    @Then("User will on the Alerts, Frame & Windows page")
    public  void alertsFrameWindowsSection() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println(webDriver.findElement(By.xpath("//*[@id='app']/div/div/div[1]/div")).getText());
        webDriver.manage().deleteAllCookies();
        webDriver.close();
    }

}
