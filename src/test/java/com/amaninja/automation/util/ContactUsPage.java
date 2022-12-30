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
    public String getName (DataTable dataTable){
        String name = "";
        for (int i = 0; i < dataTable.height(); i++) {
            name = dataTable.row(i).get(0);
        }
        return name;
    }
    public void setName(String name) {
        webDriver.findElement(contactUsName).sendKeys(name);
    }

    public String getEmail (DataTable dataTable) {
        String email = "";
        for (int i = 0; i < dataTable.height(); i++) {
            email = dataTable.row(i).get(2);
        }
        return email;
    }
        public void setEmail(String email) {
          webDriver.findElement(contactUsEmail).sendKeys(email);

        }

        public String getPhoneNumber (DataTable dataTable) {
        String phoneNumber = "";
        for (int i = 0; i < dataTable.height(); i++) {
            phoneNumber = dataTable.row(i).get(1);

        }
        return  phoneNumber;
        }
       public void setPhoneNumber(String phoneNumber) {
        webDriver.findElement(PhoneNumber).sendKeys(phoneNumber);
       }

     public  String getComment (DataTable dataTable) {
         String comment = "";
         for (int i = 0; i < dataTable.height(); i++) {
             comment = dataTable.row(i).get(3);
         }
         return comment;

     }
             public void setComment(String comment) {
            webDriver.findElement(Comment).sendKeys(comment);
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
