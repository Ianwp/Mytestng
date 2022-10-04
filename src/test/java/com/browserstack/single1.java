package com.browserstack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.percy.selenium.Percy;
import org.openqa.selenium.JavascriptExecutor;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.Cookie;

public class single1 extends BrowserStackTestNGTest {
    public Percy percy;
    @Test
    public void test() throws Exception {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        percy = new Percy(driver);
        driver.get("https://sit-apply.evetest.wellsfargo.com:15311/getting_started?product_code=CC&subproduct_code=AC&applicationtype=consumercreditcard");
        Thread.sleep(5000);
        // js.executeScript("document.cookie='ac=ydqKFVKVmPJS5AfqTV1Kmg'");
        // Thread.sleep(3000);
        // driver.navigate().refresh();
        // Thread.sleep(6000);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        // Thread.sleep(6000);
        //WebElement element = driver.findElement(By.name("q"));
        //element.sendKeys("Eric Wang");
        // percy.snapshot('Java', {
        //     requestHeaders: {
        //       Authorization: 'ac=ydqKFVKVmPJS5AfqTV1Kmg'
        //     }
        //   });
        // Thread.sleep(10000);
        // percy.snapshot("ptbr");
        // //element.submit();
        // Thread.sleep(5000);
        // driver.get("https://live.leagueoflegends.com/es-es/news/");
        // Thread.sleep(5000);
        // js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        // Thread.sleep(10000);
        // percy.snapshot("eses");
        // Thread.sleep(5000);
        // driver.get("https://live.leagueoflegends.com/en-us/news/");
        // Thread.sleep(5000);
        // js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        // Thread.sleep(10000);
        // percy.snapshot("enus");
        // Thread.sleep(5000);
        // driver.get("https://live.leagueoflegends.com/en-gb/news/");
        // Thread.sleep(5000);
        // js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        // Thread.sleep(10000);
        // percy.snapshot("engb");
        // Thread.sleep(5000);
        // driver.get("https://live.leagueoflegends.com/de-de/news/");
        // Thread.sleep(5000);
        // js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        // Thread.sleep(10000);
        // percy.snapshot("dede");
        // Thread.sleep(5000);
        // driver.get("https://live.leagueoflegends.com/fr-fr/news/");
        // Thread.sleep(5000);
        // js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        // Thread.sleep(10000);
        // percy.snapshot("frfr");
        // Thread.sleep(5000);
        // driver.get("https://live.leagueoflegends.com/it-it/news/");
        // Thread.sleep(5000);
        // js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        // Thread.sleep(10000);
        // percy.snapshot("itit");
        // Thread.sleep(5000);
        // driver.get("https://live.leagueoflegends.com/en-pl/news/");
        // Thread.sleep(5000);
        // js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        // Thread.sleep(10000);
        // percy.snapshot("enpl");
        // Thread.sleep(5000);
        // driver.get("https://live.leagueoflegends.com/pl-pl/news/");
        // Thread.sleep(5000);
        // js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        // Thread.sleep(10000);
        // percy.snapshot("plpl");
        // Thread.sleep(5000);
        // driver.get("https://live.leagueoflegends.com/el-gr/news/");
        // Thread.sleep(5000);
        // js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        // Thread.sleep(10000);
        // percy.snapshot("elgr");
        // Thread.sleep(5000);
        // driver.get("https://live.leagueoflegends.com/ro-ro/news/");
        // Thread.sleep(5000);
        // js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        // Thread.sleep(10000);
        // percy.snapshot("roro");
        // Thread.sleep(5000);
       
        // driver.get("https://live.leagueoflegends.com/hu-hu/news/");
        // Thread.sleep(5000);
        // js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        // Thread.sleep(10000);
        // percy.snapshot("huhu");
        // Thread.sleep(5000);
        // driver.get("https://live.leagueoflegends.com/cs-cz/news/");
        // Thread.sleep(5000);
        // js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        // Thread.sleep(10000);
        // percy.snapshot("cscz");
        // Thread.sleep(5000);
        // driver.get("https://live.leagueoflegends.com/es-mx/news/");
        // Thread.sleep(5000);
        // js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        // Thread.sleep(10000);
        // percy.snapshot("esmx");
        // Thread.sleep(5000);
        // driver.get("https://live.leagueoflegends.com/es-ar/news/");
        // Thread.sleep(5000);
        // js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        // Thread.sleep(10000);
        // percy.snapshot("esar");
        // Thread.sleep(5000);
        // driver.get("https://live.leagueoflegends.com/ja-jp/news/");
        // Thread.sleep(5000);
        // js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        // Thread.sleep(10000);
        // percy.snapshot("jajp");
        // Thread.sleep(5000);
        // driver.get("https://live.leagueoflegends.com/ru-ru/news/");
        // Thread.sleep(5000);
        // js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        // Thread.sleep(10000);
        // percy.snapshot("ruru");
        // Thread.sleep(5000);
        // driver.get("https://live.leagueoflegends.com/tr-tr/news/");
        // Thread.sleep(5000);
        // js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        // Thread.sleep(10000);
        // percy.snapshot("trtr");
        // Thread.sleep(5000);
        // driver.get("https://live.leagueoflegends.com/en-au/news/");
        // Thread.sleep(5000);
        // js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        // Thread.sleep(10000);
        // percy.snapshot("enau");
        // Thread.sleep(5000);
        // driver.get("https://live.leagueoflegends.com/ko-kr/news/");
        // Thread.sleep(5000);
        // js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        // Thread.sleep(10000);
        // percy.snapshot("kokr");
        // Thread.sleep(3000);
        
            
        Assert.assertEquals("Eric Wang - Google Search", driver.getTitle());
    }
}
