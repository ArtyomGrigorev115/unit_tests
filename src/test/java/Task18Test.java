import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.*;

import java.io.File;
import java.util.List;
import java.util.Optional;

public class Task18Test implements ConnectSeleniumDrivers{

    WebDriver driver;

    @BeforeTest
    public void setup(){
        File file = new File(EDGE_DRIVER_PATH);
        System.setProperty("webdriver.edge.driver", file.getAbsolutePath());
        driver = new EdgeDriver();

    }

    @Test
    public void task18TestHasPassed() throws InterruptedException {
        String link = "http://suninjuly.github.io/registration1.html";
        driver.get(link);




        List<WebElement> requiredElements = driver.findElements(By.cssSelector("input[required]"));
        int listSize = 0;
        System.out.println(listSize =  requiredElements.size());

        Assert.assertTrue(listSize == 3, "!!Обязательные к заполнению поля!!");

        requiredElements.forEach(webElement ->
                webElement.sendKeys("Какой-то текст"));

        WebElement button = driver.findElement(By.cssSelector("button.btn"));
        button.click();
        Thread.sleep(3000);

        WebElement welcomeTextElement = driver.findElement(By.tagName("h1"));
        String welcomeText = welcomeTextElement.getText();

        Assert.assertEquals(welcomeText,
                "Congratulations! You have successfully registered!");

        driver.quit();


    }

    @Test
    public void task18TestIsNotPassed() throws InterruptedException {
        String link = "http://suninjuly.github.io/registration2.html";
        driver.get(link);




        List<WebElement> requiredElements = driver.findElements(By.cssSelector("input[required]"));
        int listSize = 0;
        System.out.println(listSize =  requiredElements.size());

        Assert.assertTrue(listSize == 3, "!!Обязательные к заполнению поля!!");

        requiredElements.forEach(webElement ->
                webElement.sendKeys("Какой-то текст"));

        WebElement button = driver.findElement(By.cssSelector("button.btn"));
        button.click();
        Thread.sleep(3000);

        WebElement welcomeTextElement = driver.findElement(By.tagName("h1"));
        String welcomeText = welcomeTextElement.getText();

        Assert.assertEquals(welcomeText,
                "Congratulations! You have successfully registered!");

        driver.quit();
    }
}
