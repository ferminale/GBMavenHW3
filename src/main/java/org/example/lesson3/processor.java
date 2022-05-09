package org.example.lesson3;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class processor {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.dns-shop.ru/");

        WebElement webElement1 = driver.findElement(By.linkText("комплектующие"));
        WebElement webElement2 = driver.findElement(By.cssSelector(".subcategory__item:nth-child(2) .subcategory__image-content"));
        WebElement webElement3 = driver.findElement(By.cssSelector(".ui-input-search__input_catalog-filter"));
        WebElement webElement4 = driver.findElement(By.cssSelector(".ui-input-search__icon"));
        WebElement webElement5 = driver.findElement(By.cssSelector(".cart-link__price"));

        webElement1.click();
        webElement2.click();
        webElement3.click();
        webElement3.sendKeys("10100");
        webElement4.click();
        webElement5.click();

        Thread.sleep(10000l);
        //Завершаем работу с ресурсом
        // driver.quit();


    }

}