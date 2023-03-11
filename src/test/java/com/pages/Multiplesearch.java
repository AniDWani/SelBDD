package com.pages;

import BaseClass.Library;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Multiplesearch extends Library {

    public Multiplesearch(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }
}
