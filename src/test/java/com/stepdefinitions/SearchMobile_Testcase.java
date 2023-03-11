package com.stepdefinitions;


import BaseClass.Library;
import com.pages.Searchpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class SearchMobile_Testcase extends Library {
    Searchpage sp;


    @Given("Launch the Flipkart Application")
    public void launch_the_flipkart_application() throws IOException {
        launchapplication();
    }


    @When("Close the popup")
    public void close_the_popup() {
        System.out.println(driver.getTitle());

    }
    @Then("It should Navigate to the Home page")
    public void it_should_navigate_to_the_home_page() {
      sp=new  Searchpage(driver);
    }

    @Given("User enter the text in the search field")
    public void User_enter_the_Text_in_the_search_field() {
        sp.Search("Mobile");
    }

    @When("Click the search button")
    public void Click_the_search_button() {
        sp.ClickSearch();

        }

        @Then("It should navigate to the search result page and display the relevant details")

        public void It_should_navigate_to_the_search_result_page_and_display_the_relevant_details(){

        sp.Result();





    }
    }


