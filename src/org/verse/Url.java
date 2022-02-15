package org.verse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Url {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ragup\\eclipse-workspace\\Day1\\src\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get(" http://adactinhotelapp.com/");


WebElement element = driver.findElement(By.id("username"));
element.sendKeys("ragurajan");


WebElement element2 = driver.findElement(By.id("password"));
element2.sendKeys("africaasia");

WebElement element3 = driver.findElement(By.name("login"));
element3.click();
driver.quit();

}
}
