package org.example.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;

public class purchase {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.dns-shop.ru/");

        WebElement webElement1 = driver.findElement(By.cssSelector("input.cart-link__badge"));
        WebElement webElement2 = driver.findElement(By.xpath(".//div[@id='total-amount']/div/div[2]/button/span"));
        WebElement webElement3 = driver.findElement(By.id("ir-8kb4"));
        WebElement webElement4 = driver.findElement(By.id("ir-64qt9q"));

        webElement1.click();
        webElement2.click();
        webElement3.click();
        webElement3.sendKeys("+7 999 999-99-99");
        webElement4.sendKeys("test@test.ru");

        Thread.sleep(10000l);
        //Завершаем работу с ресурсом
        // driver.quit();


    }

}
