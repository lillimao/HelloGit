import static org.junit.Assert.*;

import org.junit.Test;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CheckSauceLabsHomePage {

@Test

public void site_header_is_on_home_page() {   

WebDriver browser;   

//Firefox's geckodriver requires you to specify its location.    

System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");   

browser = new ChromeDriver();    browser.get("http://saucelabs.com");   

WebElement header = browser.findElement(By.id("site-header"));   

assertTrue((header.isDisplayed()));   

browser.close();

}

}