package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class C03_IlkTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", " resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //1- https://www.amazon.com url'ine gidin
         driver.get("https://www.amazon.com");
    //2- Basligin Amazon kelimesi discerning test edin
        String  actualTitle=driver.getTitle();
        String arananKelime="Amazon";
        if (actualTitle.contains(arananKelime)){
            System.out.println("Title testi past");
        }else {
            System.out.println("Title aranan kelimeyi icermiyor "
                    +arananKelime+"faild");
        }
   // 3- Url'in "https://www.amazon.com" a esit oldugunu test edin
        String actualUrl= driver.getCurrentUrl();
        String expectedURL="https://www.amazon.com";
        if (actualUrl.equals(expectedURL)){
            System.out.println("URL testi past");
        }else {
            System.out.println("url beklenen url den farkli test fa'ld");
        }
   // 4- sayfayi kapatin
driver.close();
    }
}
