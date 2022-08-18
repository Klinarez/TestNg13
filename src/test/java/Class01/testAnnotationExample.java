package Class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testAnnotationExample {
    public static WebDriver driver;
    //open up the facebook.com
    //enter the invalid username
    //enter the password
    //click login
    //make sure the error is there

//    make sure the text facebook helps u----- is there

    @Test
    public void AtestingForfbText() {

        String text = driver.findElement(By.xpath("//h2")).getText();
        if (text.equals("Facebook helps you connect and share with the people in your life.")) {
            System.out.println("succesfull");
        } else {
            System.out.println("failed");
        }

    }

//    goto fb.com
//    make sure create account text is there

    @Test
    public void createAccountText() {


        String text = driver.findElement(By.xpath("//a[text()='Create new account']")).getText();

        if (text.equals("Create new account")) {
            System.out.println("success");
        } else {
            System.out.println("failure");

        }

    }


    @BeforeMethod
    public void settingupBrowser() {
        //seting up the Webdriver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
//        getting the particular url
        driver.get("https://fb.com");

    }

    @AfterMethod
    public void quitingThebrowser() {

        driver.quit();

    }


}


