package day04_xpathcssLocator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Xpath {
    public static void main(String[] args) {
        /*
         1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
2- Add Element butonuna basin
3- Delete butonu’nun gorunur oldugunu test edin
4- Delete tusuna basin
5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin

         */
        // Xpath Kullanim: //tagname[@attribute='value']

        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
    }

}
