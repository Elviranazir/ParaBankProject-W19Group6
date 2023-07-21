package TestCases;

import Utilities.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BaseTestCase extends BaseDriver {
    /**Go to https://parabank.parasoft.com/parabank/index.htm
     ❖ Click Register
     ❖ Fill the form on Signing up easy! page
     ❖ Assert that you have registered successfully
     ❖ Logout from the application. **/
    @Test
    public void testBaseTestCase(){
        //Go to https://parabank.parasoft.com/parabank/index.htm
        driver.get("https://parabank.parasoft.com/parabank/index.htm");

        //Click Register

        WebElement register = driver.findElement(By.xpath("//a[.='Register']"));

        ////a[.='Register']


    }
}
