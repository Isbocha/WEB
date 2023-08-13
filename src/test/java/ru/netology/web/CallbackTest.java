package ru.netology.web;

import io.github.bonigarcia.wdm.WebDriverManager;


import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

class CallbackTest {
    private WebDriver driver;


    @BeforeAll
    public static void setupAll() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
    }
    @AfterEach
    void tearDown() {
        driver.quit();
        driver = null;
    }

    @Test
    void shouldTest() throws InterruptedException {
        driver.get("http://localhost:9999");
//                WebElement form = driver.findElement(By.cssSelector("[form_theme_alfa-on-white]"));
//        form.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Петрова");
//        form.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+77771234567");
//        form.findElement(By.cssSelector("[data-test-id=agreement]")).click();
//        form.findElement(By.cssSelector("[button_theme_alfa-on-white]")).click();
//        String text = driver.findElement(By.className("paragraph_theme_alfa-on-white")).getText();
//        Assertions.assertEquals(  "Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.", text.trim());
//        $(".alert-success").shouldHave(exactText("Ваша заявка успешно отправлена!"));

        Thread.sleep(5000);
    }


//
//    @Test
//    void shouldTest2() throws InterruptedException {
//        driver.get("http://0.0.0.0:9999");
////                WebElement form = driver.findElement(By.cssSelector("[form_theme_alfa-on-white]"));
////        form.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("sfsfsds");
////        form.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+77771234567");
////        form.findElement(By.cssSelector("[data-test-id=agreement]")).click();
////        form.findElement(By.cssSelector("[button_theme_alfa-on-white]")).click();
////        String text = driver.findElement(By.className("data - test - id = name")).getText();
////        Assertions.assertEquals(  "Имя и Фамилия указаные неверно. Допустимы только русские буквы, пробелы и дефисы.", text.trim());
//////        $(".alert-success").shouldHave(exactText("Имя и Фамилия указаные неверно. Допустимы только русские буквы, пробелы и дефисы."));
//
//        Thread.sleep(5000);
//    }

}