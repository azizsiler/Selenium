package day07_assertions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class C04_DropDownMenu {

   /* amazon'a gidip
   dropdown'dan books secenegini secip
   Java aratalim
   ve arama sonuclarinin Java icerdigini test edelim
 */
WebDriver driver;


@Before
    public void setUp(){
    WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

}
@After
    public void tearDown(){
    driver.quit();
}

@Test
    public void test01() throws InterruptedException {
    driver.get("https://www.amazon.com/");

    WebElement dropDownMenu=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
    Select select=new Select(dropDownMenu);
    select.deselectByVisibleText("Books"); // gorunur isimle seciyor
    //select.deselectByIndex(); // index ile sesiyor
    //select.selectByValue();


    // Arama kutusuna java yazdiralim

    WebElement aramaKutusu=driver.findElement(By.id("twotasearchtextbox"));
    aramaKutusu.sendKeys("Java"+ Keys.ENTER);

    Thread.sleep(5000);
}




}
