import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class First {
    String SITE_URL="https://mvnrepository.com/";
    WebDriver driver;                     //Объявление переменной

    @BeforeEach                           //Анотация объвляет что испоьзуемый метод будет применяться перед каждым тестолвым методом
    public void start() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();      //Переменной присваивается созданный объект WebDriver
        driver.manage().window().maximize();  // Окно браузера с максимальным размером
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);  // Время ожидания
    }

    @AfterEach
    public void finish() {
        driver.quit();
    }

    @Test
    public void firstTest() {
        driver.get(SITE_URL);

    }

    @Test
    public void secondTest() {
        driver.get(SITE_URL);

    }
}
