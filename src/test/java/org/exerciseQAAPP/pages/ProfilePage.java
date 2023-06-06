package org.exerciseQAAPP.pages;

import org.exerciseQAAPP.utils.data.WebData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage{
    WebData webdata = new WebData();

    @FindBy(css = "img[src='https://snack-code-uploads.s3-us-west-1.amazonaws.com/~asset/33baddbe5b3d0ee4aa320ebf5c251fe6']")
    private WebElement profilePicture;

    @FindBy(css = "div[class='css-1rynq56 r-jwli3a r-ubezar r-vw2c0b']")
    private WebElement logOutBtn;

    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    public boolean isProfilePictureDisplayed(){return profilePicture.isDisplayed();}
    public void clickOnLogOut(){clickElement(logOutBtn);}
}
