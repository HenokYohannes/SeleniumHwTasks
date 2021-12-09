package com.company.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*task3:(use css)
goto:http://syntaxprojects.com/input-form-demo.php
fill in all the textboxes in the form
 */


public class HWTask3 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

    driver.get("http://syntaxprojects.com/input-form-demo.php");

    driver.findElement(By.cssSelector("input[name='first_name']")).sendKeys("Heiko");
        driver.findElement(By.cssSelector("input[name='last_name']")).sendKeys("Wolfgang");
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("heiko@gmx.de");
        driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("+49711246415");
        driver.findElement(By.cssSelector("input[name='address']")).sendKeys("Hornsteg Str.");
        driver.findElement(By.cssSelector("input[name='city']")).sendKeys("Stuttgart");
        driver.findElement(By.cssSelector("select[name='state']")).click();
        driver.findElement(By.xpath("//option[text()='Virginia']")).click();
   driver.findElement(By.cssSelector("input[name='zip']")).sendKeys("72116");
        driver.findElement(By.cssSelector("input[name='website']")).sendKeys("www.heikorderKomiker.de");
        driver.findElement(By.cssSelector("input[value='yes']")).click();
driver.findElement(By.cssSelector("textarea[name='comment']")).sendKeys("Merry Christmas & Happy New Year with No Covid of any variant !");
    }
}