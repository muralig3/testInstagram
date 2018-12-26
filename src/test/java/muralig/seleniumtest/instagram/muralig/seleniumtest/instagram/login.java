package muralig.seleniumtest.instagram.muralig.seleniumtest.instagram;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class login {

    @Test

    public void startWebDriver(){

        System.setProperty("webdriver.chrome.driver", "E:\\TechM\\chromedriver.exe");
        // objects and variables instantiation

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.instagram.com/");
        WebElement emailOrPhone=driver.findElement(By.xpath("//input[@name='emailOrPhone']"));
        WebElement fullName=driver.findElement(By.xpath("//input[@name='fullName']"));
        WebElement userName=driver.findElement(By.xpath("//input[@name='username']"));
        WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
        WebElement signUp=driver.findElement(By.xpath("//button[@type='submit']"));
        WebElement loginWithFacebook=driver.findElement(By.xpath("//button[@type='button']"));
        WebElement logIn=driver.findElement(By.linkText("Log in"));
        WebElement appStore=driver.findElement(By.xpath("//img[@alt='Available on the App Store']"));
        WebElement googlePlay=driver.findElement(By.xpath("//img[@alt='Available on Google Play']"));
        WebElement microsoftStore=driver.findElement(By.xpath("//img[@alt='Get it from Microsoft']"));

        //Verifying if all the elements are displayed successfully


        String actualTitle = driver.getTitle();
        System.out.println("Title" + " "+ actualTitle + " " + "is displayed successfully");
        if(loginWithFacebook.isDisplayed())
        {
            System.out.println("Login with Facebook button is Displayed");
        }else{
            System.out.println("Login with Facebook button is Not Displayed");
        }
        if(emailOrPhone.isDisplayed())
    {
        System.out.println("Email or Phone field is Displayed");
        }else{
         System.out.println("Email or Phone field is Not Displayed");
        }
        if(fullName.isDisplayed())
        {
            System.out.println("Full Name field is Displayed");
        }else{
            System.out.println("Full Name field is Not Displayed");
        }if(userName.isDisplayed())
        {
            System.out.println("User Name field is Displayed");
        }else{
            System.out.println("User Name field is Not Displayed");
        }if(password.isDisplayed())
        {
            System.out.println("Password field is Displayed");
        }else{
            System.out.println("Password field is Not Displayed");
        }if(signUp.isDisplayed())
        {
            System.out.println("Sign up button is Displayed");
        }else{
            System.out.println("Sign up button is Not Displayed");
        }if(logIn.isDisplayed())
        {
            System.out.println("Log In link is Displayed");
        }else{
            System.out.println("Log In link is Not Displayed");
        }if(appStore.isDisplayed())
        {
            System.out.println("App Store link is Displayed");
        }else{
            System.out.println("App Store link is Not Displayed");
        }if(googlePlay.isDisplayed())
        {
            System.out.println("Google Play link is Displayed");
        }else{
            System.out.println("Google Play link is Not Displayed");
        }if(microsoftStore.isDisplayed())
        {
            System.out.println("Microsoft Store link is Displayed");
        }else{
            System.out.println("Microsoft Store link is Not Displayed");
        }
                WebElement footer = driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/footer"));
                List<WebElement> list = footer.findElements(By.cssSelector("a"));
        for (WebElement link : list) {
            System.out.println(link.getText() + " " + "link is displayed successfully");
        }
        // close the web browser
        driver.close();
        driver.quit();

    }
}
