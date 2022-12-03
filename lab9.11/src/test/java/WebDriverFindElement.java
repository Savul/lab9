import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class WebDriverFindElement {
    public static void main(String[] args) throws InterruptedException
    {
       /* WebDriver driver = new ChromeDriver();
        driver.get("http://seleniumhq.org");
      WebElement searchBtn1= driver.findElement(By.xpath(" //*[@id=\"docsearch\"]/button/span[1]/span"));
        searchBtn1.click();

        WebElement searchBtn = driver.findElement(By.xpath(" //*[@id=\"docsearch-input\"]"));
        searchBtn.sendKeys("selenium java");

        Thread.sleep(2000);
        driver.quit();*/
        /*Корзина*/
         WebDriver driver = new ChromeDriver();
        driver.get(" https://www.wildberries.by/");
        WebElement searchBtn1= driver.findElement(By.xpath("//span[@class='navbar-pc__icon navbar-pc__icon--basket']"));
        searchBtn1.click();


       /* WebDriver driver = new ChromeDriver();
        driver.get(" https://www.wildberries.by/");
        WebElement searchBtn1= driver.findElement(By.xpath("//span[@class='navbar-pc__icon navbar-pc__icon--basket']"));
        searchBtn1.click();
        WebElement searchBtn2= driver.findElement(By.xpath("//[@class='nav-element__logo j-wba-header-item\" data-wba-header-name=\"Main\"']"));
        searchBtn2.click();*/


    }



}
