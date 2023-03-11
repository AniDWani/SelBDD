package BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Library {
    public static Properties prop;
    public static WebDriver driver;
    public void launchapplication() throws IOException {

        FileInputStream input=new FileInputStream("src\\test\\resources\\properties\\config.properties");
        prop=new Properties();
        prop.load(input);

        try{
            if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
            {
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();

            }
            else if (prop.getProperty("browser").equalsIgnoreCase("firefox"))
            {
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();

            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.MICROSECONDS);
            driver.get(prop.getProperty("url"));
        }
        catch (Exception e)
        {
            System.out.println("Browser didn't launch");
        }
    }

public void teardown()
{
    driver.close();
}
}


