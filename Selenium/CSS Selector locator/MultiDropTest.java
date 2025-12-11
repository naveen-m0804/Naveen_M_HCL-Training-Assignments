package redbusTesting.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MultiDropTest {

    @Test
    public void MultipleDropTest() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        driver.get("https://demo.mobiscroll.com/jquery/select/multiple-select");

        driver.findElement(By.cssSelector("#multiple-select-context > label > span.mbsc-ios.mbsc-ltr.mbsc-textfield-inner.mbsc-textfield-inner-outline.mbsc-textfield-inner-stacked.mbsc-textarea-inner.mbsc-textfield-tags-inner > span.mbsc-textfield-tags.mbsc-ios.mbsc-ltr.mbsc-textfield.mbsc-textfield-outline.mbsc-select.mbsc-textfield-stacked.mbsc-textfield-outline-stacked.mbsc-textarea > span")).click();


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(
        	    By.xpath("//div[@role='option' and text()='Books']/span")
        	)).click();
        
        wait.until(ExpectedConditions.elementToBeClickable(
        	    By.xpath("//div[@role='option' and text()='Movies, Music & Games']/span")
        	)).click();
        
        wait.until(ExpectedConditions.elementToBeClickable(
        	    By.xpath("//div[@role='option' and text()='Electronics & Computers']/span")
        	)).click();
        
        wait.until(ExpectedConditions.elementToBeClickable(
        	    By.xpath("//div[@role='option' and text()='Toys, Kids & Baby']/span")
        	)).click();
        
        wait.until(ExpectedConditions.elementToBeClickable(
        	    By.xpath("//div[@role='option' and text()='Sports & Outdoors']/span")
        	)).click();
        
        wait.until(ExpectedConditions.elementToBeClickable(
        	    By.xpath("//div[@role='option' and text()='Home, Garden & Tools']/span")
        	)).click();
    }
}

