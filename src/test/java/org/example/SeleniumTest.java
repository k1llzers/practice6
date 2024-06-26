package org.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SeleniumTest {
    private static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        driver = new ChromeDriver();
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }

    @Test
    public void testProductListPresent() {
        driver.get("https://shop.silpo.ua/category/frukty-ovochi-4788");
        List<WebElement> elements = driver.findElements(By.className("products-list__item"));
        Assertions.assertFalse(elements.isEmpty());
    }

    @Test
    public void testDifferentInfoInPages() throws InterruptedException {
        driver.get("https://shop.silpo.ua/category/frukty-ovochi-4788");
        List<WebElement> firstPageElements = driver.findElements(By.className("products-list__item"));
        WebElement nextButton = driver.findElement(By.className("pagination-item--next-page"));
        nextButton.click();
        Thread.sleep(2000);
        List<WebElement> secondPageElements = driver.findElements(By.className("products-list__item"));
        Assertions.assertNotEquals(firstPageElements, secondPageElements);
    }

    @Test
    public void testFindProducts() throws InterruptedException {
        driver.get("https://shop.silpo.ua/");
        WebElement search = driver.findElement(By.tagName("input"));
        search.click();
        Thread.sleep(1500);
        search.sendKeys("pesto");
        search.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        List<WebElement> productsList = driver.findElements(By.className("products-list__item"));
        Assertions.assertFalse(productsList.isEmpty());
    }
}
