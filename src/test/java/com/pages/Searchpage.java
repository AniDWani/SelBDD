package com.pages;

import BaseClass.Library;
import com.reusablefunctions.SeleniumReusable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Searchpage extends Library {
    private final WebDriver driver;
    SeleniumReusable se;

    public Searchpage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "//input@name='q']")
    WebElement Searchtext;


    @FindBy(xpath = "//html[@lang='en']")
    WebElement Homepage;

    @FindBy(xpath="//html[@class= ' fonts-loaded']")
    WebElement Searchresult;


    public void Search(String Text)
    {
        se=new SeleniumReusable(driver);
        se.EnterValue(Searchtext, Text);

    }

 public void ClickSearch()
 {
     Searchtext.sendKeys(Keys.ENTER);
 }

  public void homescreen()

  {
      System.out.println(Homepage.isDisplayed());
  }
  public void Result()
  {
      System.out.println(Searchresult.isDisplayed());
      System.out.println(driver.getTitle());
  }

}
