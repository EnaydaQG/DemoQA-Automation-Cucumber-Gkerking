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

public class Elements {
   private WebDriver webDriver;

    @Given("User was in Text Box")
    public void text_box() throws InterruptedException {
        Thread.sleep(3000);
       WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.get("https://demoqa.com/text-box");
        webDriver.manage().window().fullscreen();
        webDriver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
            }
    @When("User set personal information")
    public void user_set_personal_information() throws InterruptedException {
      Thread.sleep(3000);
        webDriver.findElement(By.xpath(Locators.FULL_NAME)).sendKeys("Enayda");
        webDriver.findElement(By.xpath(Locators.EMAIL)).sendKeys("enayda@gmil.com");
        webDriver.findElement(By.xpath(Locators.CURRENT_ADDRESS)).sendKeys("America Street 234 between Simon lopes and Hatawallpa");
        webDriver.findElement(By.xpath(Locators.PERMANENT_ADDRESS)).sendKeys("Linde Street s/n Tiquipaya place");
    }
    @And( "User click Submit button")
    public void clickSubmit() throws InterruptedException {
        Thread.sleep(3000);
        JavascriptExecutor executor = (JavascriptExecutor) webDriver;
        executor.executeScript("arguments[0].click();", webDriver.findElement(By.id("submit")));
    }
    @Then("User will see personal information")
    public void user_will_see_personal_information() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println(webDriver.findElement(By.id("name")).getText());
        System.out.println(webDriver.findElement(By.id("email")).getText());
        System.out.println(webDriver.findElement(By.id("currentAddress")).getText());
        System.out.println(webDriver.findElement(By.id("permanentAddress")).getText());
        webDriver.findElement(By.id("currentAddress")).isDisplayed();
        webDriver.findElement(By.id("permanentAddress")).isDisplayed();
        webDriver.manage().deleteAllCookies();
        webDriver.close();
    }

}
