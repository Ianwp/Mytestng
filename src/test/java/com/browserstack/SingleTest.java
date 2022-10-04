package com.browserstack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.percy.selenium.Percy;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import java.io.*;
import java.util.*;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.Cookie;

public class SingleTest extends BrowserStackTestNGTest {
    public Percy percy;
    @Test
    public void test() throws Exception {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        percy = new Percy(driver);
        String userAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.103 Safari/537.36 OPR/60.0.3255.170";
        
        //options.addPreference("general.useragent.override",userAgent);

        driver.get("https://www.dropbox.com/");
        Thread.sleep(3000);
        //driver.get("http://whatismyip.akamai.com/advanced");
        //WebElement element = driver.findElement(By.xpath("//*[@id='mainContent']/div[5]/h3"));
        //js.executeScript("arguments[0].scrollIntoView(true);",element);
        //Thread.sleep(3000);
        //WebElement element1 = driver.findElement(By.id("nuance-chat-anchored"));
        //element1.click();
        // WebElement element2 = driver.findElement(By.xpath("//*[@id='root']/div/div/div[4]/div[2]/div[2]/div/div/div[1]/button[1]"));
        // element2.click();
        // Thread.sleep(3000);
        // //Get the Web Element corresponding to the field Business Email (Textfield)
        // WebElement email = driver.findElement(By.id("j_username"));
        // email.sendKeys("RUEYEOPRE");
        // // //Get the Web Element corresponding to the Password Field 
        // WebElement password = driver.findElement(By.id("j_password"));
        // password.sendKeys("12fdsa12");
        // WebElement element1 = driver.findElement(By.id("continue"));
        // element1.click();
        // email.sendKeys(“RUETPERER”);
        // // password.sendKeys(“12fdsa12”)
        // Thread.sleep(3000);
        // WebElement element4 = driver.findElement(By.xpath("//*[@id='Signon']//div/input[1]"));
        // element4.click();
        // Thread.sleep(5000);
        // WebElement email2 = driver.findElement(By.id("j_username"));
        // email2.sendKeys("yppeqqirt");
        // WebElement password2 = driver.findElement(By.id("j_password"));
        // password2.sendKeys("12fdsa12");
        // Thread.sleep(3000);
        // WebElement element5 = driver.findElement(By.xpath("//*[@id='root']/div/div/div[4]/div[2]/div[2]/div/div/div[2]/div[3]/div[1]/button"));
        // element5.click();
        // element1.click();
        //percy.snapshot("Welcome");
        //js.executeScript("document.cookie='ac=ydqKFVKVmPJS5AfqTV1Kmg'");
        // Thread.sleep(3000);
        // WebElement element = driver.findElement(By.xpath("//*[@id='Hero']/div/div/div/div/div/div[2]/div[3]/div/div[2]/a"));
        // element.click();
        // driver.get("https://www.morganstanley.com/ideas?filter=personal-finance");
        // Thread.sleep(3000);
      //   System.out.println("================== BROWSER LOGS =======================");
      //   LogEntries logEntries = driver.manage().logs().get("browser");
      //   for (LogEntry entry : logEntries) {
      //     System.out.println(new Date(entry.getTimestamp()) + " " + entry.getLevel() + " " + entry.getMessage() + " " + entry.toString());
      // }
      //   System.out.println("=======================================================");

      
        //Thread.sleep(30000);
        //Thread.sleep(5000);
      
        percy.snapshot("personal");
        // // // //driver.navigate().refresh();
        // driver.get("https://www.morganstanley.com/what-we-do/investment-banking");
        // Thread.sleep(3000);
        // // // WebElement element3 = driver.findElement(By.xpath("//*[@id='Hero']/div/div/div/div/div/div[2]/div[3]/div/div[3]/a"));
        // // // element3.click();
        // percy.snapshot("Investment");
        // driver.get("https://www.morganstanley.com/about-us/leadership");
        // Thread.sleep(3000);
        // // // WebElement element4 = driver.findElement(By.xpath("//*[@id='Hero']/div/div/div/div/div/div[2]/div[3]/div/div[4]/a"));
        // // // element4.click();
        //percy.snapshot("Leadership");

        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(1000);
        //WebElement element = driver.findElement(By.name("q"));
        //element.sendKeys("Eric Wang");
        // percy.snapshot('Java', {
        //     requestHeaders: {
        //       Authorization: 'ac=ydqKFVKVmPJS5AfqTV1Kmg'
        //     }
        //   });
        //percy.snapshot("Java");
        //element.submit();
        // Thread.sleep(3000);
        // driver.get("https://www.qualtrics.com/about/");
        // percy.snapshot("Com");
        // Thread.sleep(5000);
        // driver.get("https://www.qualtrics.com/education/");
        // percy.snapshot("Biz");

        //Assert.assertEquals("Eric Wang - Google Search", driver.getTitle());
        driver.getTitle();
        if (driver.getTitle().equals("Morgan Stanley | Global Leader in Financial Services")) {
            js.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"passed\", \"reason\": \"Title matched!\"}}");
          }
          else {
            js.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\":\"failed\", \"reason\": \"Title not matched\"}}");
          }
    }
  
}  