import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class HelloWebDriver {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver=new ChromeDriver();
        driver.get("http://seleniumhq.org");
        Thread.sleep(2000);
        driver.quit();




    }

}
