package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // amazona gidip nutella aratalim

        driver.get("https://www.amazon.com");
       //WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
     //  aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

     //  WebElement aramaKutusu= driver.findElement(By.className("nav-search-field "));
        //  bu locator calismadi bu locatoru alirken gozumuzden kacan detaylar olabilir
        //  aldigimiz bu locator calismazsa alternatifler denemeliyiz;

        WebElement aramaKutusu= driver.findElement(By.className("nav-input nav-progressive-attribute"));
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);


/*
<input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off" placeholder=""
class="nav-input nav-progressive-attribute" dir="auto" tabindex="0" aria-label="Search">
 */
    }
}
