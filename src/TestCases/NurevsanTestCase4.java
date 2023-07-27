package TestCases;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Utilities.MyMethods;
import org.junit.Assert;
import org.junit.Test;

public class NurevsanTestCase4 extends BaseDriver {
    /*Go to the site
❖ Enter username and password and click login
❖ Click Update Contact Info
❖ Update required fields and click Update Profile
❖ Assert that you have updated your contact information successfully*/
@Test
    public void testContactInfo() {

    driver.get("https://parabank.parasoft.com/parabank/index.htm");

    WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
    username.sendKeys("nurevsan");

    WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
    password.sendKeys("Abc123");

    WebElement login = driver.findElement(By.xpath("//input[@value='Log In']"));
    login.click();

    WebElement updateContactInfoLink = driver.findElement(By.xpath("//a[contains(text(),'Update Contact Info')]"));
    updateContactInfoLink.click();

    WebElement firstName = driver.findElement(By.id("customer.firstName"));
    firstName.clear();
    firstName.sendKeys("Harry");

    WebElement lastName = driver.findElement(By.id("customer.lastName"));
    lastName.clear();
    lastName.sendKeys("Potter");

    WebElement address = driver.findElement(By.id("customer.address.street"));
    address.clear();
    address.sendKeys("New Address");

    WebElement city = driver.findElement(By.id("customer.address.city"));
    city.clear();
    city.sendKeys("Atlanta");

    WebElement state = driver.findElement(By.id("customer.address.state"));
    state.clear();
    state.sendKeys("Georgia");

    WebElement zipCode = driver.findElement(By.id("customer.address.zipCode"));
    zipCode.clear();
    zipCode.sendKeys("44044");

    WebElement phone = driver.findElement(By.id("customer.phoneNumber"));
    phone.clear();
    phone.sendKeys("444000444");

    WebElement updateProfileButton = driver.findElement(By.xpath("//input[@type='submit' and @value='Update Profile']"));
    updateProfileButton.click();

    MyMethods.myWait(1);


    WebElement successMessage = driver.findElement(By.xpath("//p[text()='Your updated address and phone number have been added to the system.']"));
    Assert.assertTrue("Updating Contact Information Failed", successMessage.isDisplayed());

    MyMethods.myWait(1);

    }
}

