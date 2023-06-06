package org.exerciseQAAPP.pages;

import org.exerciseQAAPP.utils.data.WebData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    WebData webData = new WebData();

    @FindBy(css = "iframe._1ln5482")
    private WebElement iframe;

    @FindBy(css = "input[placeholder='Email']")
    private WebElement email;

    @FindBy(css = "input[placeholder='Password']")
    private WebElement password;

    @FindBy(css = "div.css-1rynq56.r-jwli3a.r-ubezar.r-vw2c0b.r-q4m81j")
    private  WebElement LoginBtn;

    @FindBy(xpath = "//div[contains(text(),'Please enter a valid email')]")
    private WebElement emailValidator;

    @FindBy(xpath = "//div[contains(text(),'Please enter a valid password')]")
    private WebElement passwordValidator;

    public LoginPage(WebDriver driver) {
        super(driver);
    }
}
