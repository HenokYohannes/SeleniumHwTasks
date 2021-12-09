package com.company.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*task2:(use advance xpath)
RMS Application Negative Login:
Open chrome browser
Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
Enter valid username
enter wrong password
Click on login button
Verify error message with text “Invalid Credenitals” is displayed.

 */


public class HWTask2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        Thread.sleep(Long.parseLong("2000"));
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("abcdef123!");
        Thread.sleep(Long.parseLong("2000"));

        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

        WebElement element = driver.findElement(By.xpath("//span[text()='Invalid credentials']"));
        System.out.println(element.getText());

    }
}