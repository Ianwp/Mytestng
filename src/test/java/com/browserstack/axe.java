// import org.openqa.selenium.JavascriptExecutor;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.remote.DesiredCapabilities;
// import org.openqa.selenium.remote.RemoteWebDriver;
// import java.io.File;
// import java.io.FileWriter;
// import java.net.URL;
// import java.nio.file.Files;
// import java.nio.file.Path;
// import java.nio.file.Paths;


// import org.openqa.selenium.By;
// import org.openqa.selenium.WebElement;
// import io.percy.selenium.Percy;
// import org.openqa.selenium.JavascriptExecutor;

// import org.testng.Assert;
// import org.testng.annotations.Test;
// import org.openqa.selenium.Cookie;


// public class axe extends BrowserStackTestNGTest {
//     public Percy percy;
//     @Test
//     public void test() throws Exception {
// 		 driver.get("https://www.google.com");

// 		 JavascriptExecutor jse = (JavascriptExecutor)driver;
// 		 Path path = Paths.get("/Users/ianpasch/Desktop/Automate/testng-browserstack/src/test/java/com/browserstack/axe.min.js");

// 		 String content = new String(Files.readAllBytes(path));
// 		 jse.executeScript(content);

// 		 File output = new File("/report.json");
// 		 FileWriter writer = new FileWriter(output);
// 		 String result = String.valueOf(jse.executeAsyncScript("var callback = arguments[arguments.length - 1]; axe.run().then(results => callback(results));"));
// 		 writer.write(result);
// 		 writer.flush();
// 		 writer.close();
// 		 //driver.quit();
// 	}
// }
