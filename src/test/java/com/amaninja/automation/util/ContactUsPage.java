package com.amaninja.automation.util;

import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage {

WebDriver webDriver;

By contactUsName = By.id("id=ContactForm-name");
By contactUsEmail = By.id("ContactForm-email");
By PhoneNumber = By.id("ContactForm-phone");
By Comment = By.id("ContactForm-body");

    public ContactUsPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void userDetail(DataTable dataTable){
        for (int i = 0; i < dataTable.height(); i++){
            String name = dataTable.row(i).get(0);
            String email = dataTable.row(i).get(2);
            String phoneNumber = dataTable.row(i).get(1);
            String comment = dataTable.row(i).get(3);

        }
    }
    public void setContactUsName(By contactUsName) {
        webDriver.findElement(contactUsName).sendKeys("");
    }
}
