package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.SmartBizLoan_Page;

public class Utility {


   public static void switchToFrame(WebElement element){

       WebDriverWait wait = new WebDriverWait(Driver.getDriver(),17);
       wait.until(ExpectedConditions.visibilityOf(element));
       Driver.getDriver().switchTo().frame(element);
       SmartBizLoan_Page.closeIframeButton.click();
       Driver.getDriver().switchTo().parentFrame();

   }

   public static void selectByVisibleText(WebElement element, String selectDropdown){
       Select select = new Select(element);
       select.selectByVisibleText(selectDropdown);
   }

   public static void pageScrollDownJavaScript(){
       JavascriptExecutor jse = (JavascriptExecutor)Driver.getDriver();
       jse.executeScript("window.scrollBy(0,250)");
   }

   public static void clickJavaScript(WebElement element){
       JavascriptExecutor jse = (JavascriptExecutor)Driver.getDriver();
       jse.executeScript("arguments[0].click();",element);
   }

   public static void waitUntilUrlContains(String string){

       WebDriverWait wait = new WebDriverWait(Driver.getDriver(),17);
       wait.until(ExpectedConditions.urlContains(string));

   }

   public static void waitUntilVisibilityOf(WebElement element){
       WebDriverWait wait = new WebDriverWait(Driver.getDriver(),17);
       wait.until(ExpectedConditions.visibilityOf(element));

   }

}
