package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By username = By.xpath("//div[@class='card-body']/div[@class='form-group']/input[@id='name']");
    private By phone = By.xpath("//div[@class='card-body']/div[@class='form-group']/input[@id='phone']");
    private By email = By.xpath("//div[@class='card-body']/div[@class='form-group']/input[@id='email']");
    private By password = By.xpath("//div[@class='card-body']/div[@class='form-group']/input[@id='password']");
    private By btnLogin = By.xpath("/html/body/div/div[2]/div[2]/button");
    private By gender = By.xpath("//div[@class='card-body']/div[@class='form-check'][2]//input[@id='male']");
    private By dayOfweek = By.xpath("//div[@class='card-body']/div[@class='form-check'][5]//input[@id='wednesday']");
    private By travel = By.xpath("//div[@class='card border-success mb-3'][3]//div[@class='form-group']/select/option[3]");
    private By exp = By.xpath("//div[@class='card border-success mb-3'][4]/div[@class='card-body']/div[@class='form-group'][1]/div[@class='custom-control custom-radio'][2]/label[@class='custom-control-label']");
    private By autoTools = By.xpath("//div[@class='card border-success mb-3'][4]/div[@class='card-body']/div[@class='form-group'][2]/div[@class='custom-control custom-checkbox'][1]");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void setUsername(String user){
        driver.findElement(username).sendKeys(user);
    }

    public void setPhone(String num){
        driver.findElement(phone).sendKeys(num);
    }

    public void setEmail(String mail){
        driver.findElement(email).sendKeys(mail);
    }

    public void setPassword(String pass){
        driver.findElement(password).sendKeys(pass);
    }

    public void setButton(){
        driver.findElement(btnLogin).click();
    }

    public void checkGender(){
        driver.findElement(gender).click();
    }

    public void pickDay(){
        driver.findElement(dayOfweek).click();
    }

    public void travelToCountry(){
        driver.findElement(travel).click();
    }

    public void yearsOfExperionce(){
        driver.findElement(exp).click();
    }

    public void pickTool(){
        driver.findElement(autoTools).click();
    }
}
