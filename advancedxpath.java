package com.company.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class advancedxpath {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[@class='form-hint']/preceding-sibling::input")).sendKeys("jimito");
        driver.findElement(By.xpath("//span[starts-with(text(),'Password')]/preceding-sibling::input")).sendKeys("jimito123");
 Thread.sleep(Long.parseLong("2000"));
        driver.findElement(By.id("//input[@id='btnLogin']")).click();

    }

}
