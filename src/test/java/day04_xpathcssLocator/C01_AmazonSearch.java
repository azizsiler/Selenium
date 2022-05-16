package day04_xpathcssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_AmazonSearch {
    public static void main(String[] args) {
      /*
        2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
                a.google web sayfasına gidin. https://www. amazon.com/
        b. Search(ara) “city bike”
        c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        d. “Shopping” e tıklayın.
        e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
       */

        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com/");

        //a.google web sayfasına gidin. https://www. amazon.com/

       // b. Search(ara) “city bike”
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike"+ Keys.ENTER);
       // c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın

        List<WebElement> istenenElementListesi=driver.findElements(By.className("a-section a-spacing-small a-spacing-top-small"));
        WebElement sonucYazisiElementi=istenenElementListesi.get(0);
        System.out.println(sonucYazisiElementi.getText());


        List<WebElement>urunResimleri=driver.findElements(By.className("s-image"));
        WebElement ilkUrunResmi=urunResimleri.get(0);
        ilkUrunResmi.click();
     //d Sonra karşınıza çıkan ilk sonucun resmine tıklayın.






    }
}
