package pages;

import java.time.Duration;
import java.util.List;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    //Variable to store the WebDriver instance
    protected static WebDriver driver;
    
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    static{
        driver = new ChromeDriver();
    }

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
    }

    public static void navigateTo(String url) {
        driver.get(url);  
    }

    //Columna vertebral
    private WebElement Find(String locator){
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }

    public void clickElement(String locator){
        Find(locator).click();
    }

    public static void closeBrowser(){
        driver.quit();
    }

    public void write(String locator, String text){
        Find(locator).clear();
        Find(locator).sendKeys(text);
    }

    public void findElementDropDown(String locator, String value){
        Select dropdown = new Select(Find(locator));
        dropdown.selectByVisibleText(value);
    }

    public int sizeDropDown(String locator){
        Select dropdown = new Select(Find(locator));
        return dropdown.getOptions().size();
    }

    public List<String> getValueDropDown(String locator){
        Select dropdown = new Select(Find(locator));
        List<WebElement> options = dropdown.getOptions();
        List<String> values = new ArrayList<>();
        for (WebElement option : options) {
            values.add(option.getText());
        }
        return values;
    }


    
}
