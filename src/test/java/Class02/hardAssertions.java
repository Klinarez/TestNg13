package Class02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class hardAssertions {
   // navigate to syntaxhrms
    //    we need to write to case to verify the wrong credentials give error message
//    quit the browser
    WebDriver driver;
    //    navigate to syntax HRMS website
    @BeforeMethod
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();;
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

    }
    @Test
    public  void verifyInvalidCredentialsError(){
//finding the username text box
      WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
//send username
        username.sendKeys("WeatherMay");
//        finding the password field
        WebElement pswrd = driver.findElement(By.xpath("//input[@id='txtPassword']"));
//        send password
        pswrd.sendKeys("abcdefgh");
//        finding the element login btn
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
//        click the login
        loginBtn.click();

//        get the element message invalid crdentials
        WebElement errorMsg = driver.findElement(By.xpath("//span[@id='spanMessage']"));
//        extract the error message
        String errorText = errorMsg.getText();
//
        System.out.println(errorText);

//        /declaring the message that we are expecting
        String expectedMsg="Invalid credentials";
        System.out.println(errorText);
//        /declaring the message that we are expecting


//        making assertion to make sure that message is correct
        Assert.assertEquals(errorText,expectedMsg);
username = driver.findElement(By.xpath("//input[@id='txtUsername']"));

        boolean displayed = username.isDisplayed();;
        System.out.println(displayed);
       // Check if the displayed is true or not
        Assert.assertTrue(displayed);





    }

    @AfterMethod
    public  void closeBrowser() {
        driver.quit();


    }



    }


