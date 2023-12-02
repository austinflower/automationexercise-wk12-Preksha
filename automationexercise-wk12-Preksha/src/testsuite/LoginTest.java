package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl="http://automationexercise.com";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void loginuserwithcorrtctemailandpassword () throws InterruptedException {
        Thread.sleep(5000);
        String actualMsg = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[1]/a")).getText();
        String expectedMsg = "Home";
        Assert.assertEquals(actualMsg, expectedMsg);
        driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[4]/a")).click();
        String actualmsg2 = driver.findElement(By.xpath("//div[@class='login-form']/h2")).getText();
        String expectedmsg2 = "Login to your account";
        Assert.assertEquals(actualmsg2, expectedmsg2);
        driver.findElement(By.xpath("//form[@action='/login']/input[2]")).sendKeys("tommsmithh@aol.com");
        driver.findElement(By.xpath("//form[@action='/login']/input[3]")).sendKeys("123456789");
        driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
        String actualMsg3 =driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[10]")).getText();
        System.out.println(actualMsg3);
        String expectedMsg3 ="Logged in as Tomm Smithh";
        Assert.assertEquals(actualMsg3,expectedMsg3);
        driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[5]/a")).click();
        String actualMsg4 =driver.findElement(By.xpath("//div[@class='col-sm-9 col-sm-offset-1']/h2/b")).getText();
        String expectedMsg4 = "ACCOUNT DELETED!";
        Assert.assertEquals(actualMsg4,expectedMsg4);

    }
    @Test
    public void loginuserwithINCORRECTemailandpassword() throws InterruptedException {
        Thread.sleep(5000);
        String actualMsg5 = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[1]/a")).getText();
        String expectedMsg5 = "Home";
        Assert.assertEquals(actualMsg5, expectedMsg5);
        driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[4]/a")).click();
        String actualmsg6 = driver.findElement(By.xpath("//div[@class='login-form']/h2")).getText();
        String expectedmsg6 = "Login to your account";
        Assert.assertEquals(actualmsg6, expectedmsg6);
        driver.findElement(By.xpath("//form[@action='/login']/input[2]")).sendKeys("tommsmithh@aolll.com");
        driver.findElement(By.xpath("//form[@action='/login']/input[3]")).sendKeys("12345678999");
        driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
        Thread.sleep(5000);
        String actualMsg7 = driver.findElement(By.xpath("//p[contains(text(),'Your email or password is incorrect!')]")).getText();
        String expectedMsg7 = "Your email or password is incorrect!";
        Assert.assertEquals(actualMsg7, expectedMsg7);
    }
    @Test
    public void logoutUser () throws InterruptedException {
        Thread.sleep(5000);
        String actualMsg8 = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[1]/a")).getText();
        String expectedMsg8 = "Home";
        Assert.assertEquals(actualMsg8, expectedMsg8);
        driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[4]/a")).click();
        String actualmsg9 = driver.findElement(By.xpath("//div[@class='login-form']/h2")).getText();
        String expectedmsg9 = "Login to your account";
        Assert.assertEquals(actualmsg9, expectedmsg9);
        driver.findElement(By.xpath("//form[@action='/login']/input[2]")).sendKeys("tommysmith@aol.com");
        driver.findElement(By.xpath("//form[@action='/login']/input[3]")).sendKeys("123456789");
        driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
        String actualMsg10 =driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[10]")).getText();
        String expectedMsg10 ="Logged in as Tommy";
        Assert.assertEquals(actualMsg10,expectedMsg10);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='shop-menu pull-right']/ul/li[4]/a")).click();
        String actualmsg11 = driver.findElement(By.xpath("//div[@class='login-form']/h2")).getText();
        String expectedmsg11 = "Login to your account";
        Assert.assertEquals(actualmsg11, expectedmsg11);
    }
    @Test
    public void registerUserwithExistingEmail () throws InterruptedException {
        Thread.sleep(5000);
        String actualMsg12 = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[1]/a")).getText();
        String expectedMsg12 = "Home";
        Assert.assertEquals(actualMsg12, expectedMsg12);
        driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[4]/a")).click();
        String actualmsg13 = driver.findElement(By.xpath("//div[@class='signup-form']/h2")).getText();
        String expectedmsg13 = "New User Signup!";
        Assert.assertEquals(actualmsg13, expectedmsg13);
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Tommy Smith");
        driver.findElement(By.xpath("//div[@class='signup-form']/form/input[3]")).sendKeys("tommysmith@aol.com");
        driver.findElement(By.xpath("//button[contains(text(),'Signup')]")).click();
        String actualMsg14 = driver.findElement(By.xpath("//div[@class='signup-form']/form/p")).getText();
        String expectedMsg14 = "Email Address already exist!";
        Assert.assertEquals(actualMsg14, expectedMsg14);
    }
    @Test
    public void verifyTestCasePage() throws InterruptedException {
        Thread.sleep(5000);
        String actualMsg12 = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[1]/a")).getText();
        String expectedMsg12 = "Home";
        Assert.assertEquals(actualMsg12, expectedMsg12);
        driver.findElement(By.xpath("//div[@class='shop-menu pull-right']/ul/li[5]/a")).click();
        String actualMsg14 = driver.findElement(By.xpath("//div[@class='col-sm-9 col-sm-offset-1']/h2/b")).getText();
        String expectedMsg14 = "TEST CASES";
        Assert.assertEquals(actualMsg14, expectedMsg14);
    }
    @Test
    public void verifyAllProductsAndProductDetailPage() throws InterruptedException {
        Thread.sleep(5000);
        String actualMsg12 = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[1]/a")).getText();
        String expectedMsg12 = "Home";
        Assert.assertEquals(actualMsg12, expectedMsg12);
        driver.findElement(By.xpath("//div[@class='shop-menu pull-right']/ul/li[2]/a")).click();
        String actualMsg13 = driver.findElement(By.xpath("//div[@class='features_items']/h2")).getText();
        String expectedMsg13 = "ALL PRODUCTS";
        Assert.assertEquals(actualMsg13, expectedMsg13);
        Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(100,650)","");
        driver.findElement(By.xpath("//div[@class='product-image-wrapper']/div[2]/ul/li/a")).click();

        WebElement pname =driver.findElement(By.xpath("//div[@class='product-information']/h2"));
        Assert.assertTrue(pname.isDisplayed());
        WebElement catname =driver.findElement(By.xpath("//div[@class='product-information']/p"));
        Assert.assertTrue(catname.isDisplayed());
        WebElement price =driver.findElement(By.xpath("//div[@class='product-information']/span/span"));
        Assert.assertTrue(price.isDisplayed());
        WebElement available =driver.findElement(By.xpath("//div[@class='product-information']/p[2]/b"));
        Assert.assertTrue(available.isDisplayed());
        WebElement condition =driver.findElement(By.xpath("//div[@class='product-information']/p[3]/b"));
        Assert.assertTrue(condition.isDisplayed());
        WebElement brand =driver.findElement(By.xpath("//div[@class='product-information']/p[4]/b"));
        Assert.assertTrue(brand.isDisplayed());

    }
    @Test
    public void SearchProduct() throws InterruptedException {
        Thread.sleep(5000);
        String actualMsg12 = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[1]/a")).getText();
        String expectedMsg12 = "Home";
        Assert.assertEquals(actualMsg12, expectedMsg12);
        driver.findElement(By.xpath("//div[@class='shop-menu pull-right']/ul/li[2]/a")).click();
        String actualMsg13 = driver.findElement(By.xpath("//div[@class='features_items']/h2")).getText();
        String expectedMsg13 = "ALL PRODUCTS";
        Assert.assertEquals(actualMsg13, expectedMsg13);
        driver.findElement(By.id("search_product")).sendKeys("Men Tshirt");
        driver.findElement(By.xpath("//button[@id='submit_search']")).click();
        String actualMsg17 = driver.findElement(By.xpath("//div[@class='features_items']/h2")).getText();
        String expectedMsg17 = "SEARCHED PRODUCTS";
        Assert.assertEquals(actualMsg17, expectedMsg17);

    }

}











