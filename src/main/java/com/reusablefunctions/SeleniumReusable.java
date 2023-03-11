package com.reusablefunctions;

import BaseClass.Library;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.util.List;

public class SeleniumReusable extends Library {


    public SeleniumReusable(WebDriver driver){

        this.driver=driver;
    }
    // Enter The Test of element

    public void EnterValue(WebElement element,String Text) {
        try {
            element.sendKeys((Text));
        } catch (Exception e) {
            System.out.println("No such element Exception");
        }

    }
    public void click(WebElement element)
    {
        try {
            element.click();
        }
        catch (Exception e)
        {
            System.out.println("No such element Exception");
        }
    }
    public void getTitle() {
        try
        {
            System.out.println(driver.getTitle());
        }
        catch(Exception e)
        {
            System.out.println("Couldnt get the Title");
        }
    }
    public void screenshot(String path) {

        TakesScreenshot TS = (TakesScreenshot) driver;
        File source = TS.getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(source, new File(path));
        } catch (Exception e) {
            System.out.println("Screenshot not found");
        }
    }

        public void MultipleGetText(List<WebElement> element)

        {
            List<WebElement> text=element;
            System.out.println(text.size());

            for (WebElement textcount:text)
            {
                String Totallist=textcount.getText();

                System.out.println("************************************************");
                System.out.println(Totallist);
            }
        }
        public void  Getvalue(WebElement element)
        {
            String Text=element.getText();
            System.out.println(Text);
        }


    }
