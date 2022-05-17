package practice02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02 {
     /*
    ...Exercise2...
    http://www.bestbuy.com 'a gidin,
    Sayfa basliginin "Best" icerdigini(contains) dogrulayin
    Ayrica Relative Locator kullanarak;
        logoTest => BestBuy logosunun gorunutulenip goruntulenmedigini dogrulayin
        mexicoLinkTest => Linkin gorunutulenip goruntulenmedigini dogrulayin
 */

static WebDriver driver;

@BeforeClass
    public static void setUp(){
    WebDriverManager.chromedriver().setup();

}
@Before
    public void testtenOnce(){

    driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    driver.get("http://www.bestbuy.com");
}

@Test
    public void titleTest(){
    Assert.assertTrue("title best kelimesi icermiyor",driver.getTitle().contains("Best"));
}
   @After
   public void kapat(){
    driver.close();
   }



}
