package day07_assertions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static day06_radioButton_checkBox.C01_BeforeClass_AfterClass.setUp;

public class C01_Assertions {


    // amazon ana sayfasina gidin
    // 3 farkili test methodu olusturarak asagidaki gorevleri yapin
    //1- Url@nin amazon icerdigini test edein
    //2- titlenin facebook icermedigini test edin
    //3- sol ust kosede amazon logosunun goruldugunu test edin

    static WebDriver driver;


        @BeforeClass
                public static void setUp(){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            driver.get("https://www.amazon.com");

        }
        @AfterClass
    public static void tearDown(){
            driver.close();
        }

@Test
        public void test01(){
            driver.get("https://www.amazon.com");
    //1- Url@nin amazon icerdigini test edein

    String arananKelime="amazon";
    String actualUrl=driver.getCurrentUrl();
    Assert.assertTrue(actualUrl.contains(arananKelime));

        }
            @Test
            public void test02(){
                //2- titlenin facebook icermedigini test edin

                String istenmeyenKelime="Facebook";
                String actuakTitle=driver.getTitle();
                Assert.assertFalse(actuakTitle.contains(istenmeyenKelime));



            }

          @Test
            public void test03(){
              //3- sol ust kosede amazon logosunun goruldugunu test edin
              WebElement logoElementi= driver.findElement(By.id("nav-logo-sprites"));
              Assert.assertTrue(logoElementi.isDisplayed());
          }


}
