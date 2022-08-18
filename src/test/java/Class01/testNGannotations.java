package Class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNGannotations {
    @Test//Test annotation is used to indicate that this is a test case

    public void firstTestCase() {

        System.out.println("hey I am a first Tester case");


    }

    @Test(groups = "smoke")
    public void secondTestCase( ) {
        System.out.println("hey I am a second test case");
    }

    @Test
    public void ThirdTestcase() {

        System.out.println("hey iam a third test case");

    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("HEY I AM  A BEFORE METHOD ");

    }

    @AfterMethod
    public void afterMEthod() {
        System.out.println("heyy! I AM A AFTER METHOD");
    }

}


