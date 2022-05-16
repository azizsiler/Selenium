package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class C04_DriverMethodlari{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");
        String sayfaKaynakKodlari=driver.getPageSource();
        String arananKelime="spend less";
        if (sayfaKaynakKodlari.contains(arananKelime)){
            System.out.println("kaynak kodu testi past");
        }else{
            System.out.println("kaynak kodlarinda aranan kelime yok test fa'dl");
        }
    }
}
