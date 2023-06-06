package org.exerciseQAAPP.utils;

import org.exerciseQAAPP.configuration.web.WebDriverManager;
import org.exerciseQAAPP.pages.LoginPage;
import org.exerciseQAAPP.pages.ProfilePage;
import org.exerciseQAAPP.reporting.Reporter;
import org.exerciseQAAPP.utils.data.WebData;
import org.hamcrest.Matcher;

import static java.lang.String.format;
import static org.hamcrest.Matchers.is;

public class BaseTest {

    WebDriverManager driver;
    LoginPage login;
    ProfilePage profile;
    WebData webData;

    public void testSetup(){
        webData = new WebData();
        driver = new WebDriverManager(webData.getBrowser());
        Reporter.info("Deleting all cookies");
        driver.getDriver().manage().deleteAllCookies();
        Reporter.info(format("Navigating to %s", webData.getUrl()));
        driver.getDriver().get(webData.getUrl());
        driver.getDriver().manage().window().maximize();
        login = new LoginPage(driver.getDriver());
    }

    protected <T> void checkThat(String description, T actualValue, Matcher<? super T> expectedValue){
        Reporter.info(format("Checking that " + description.toLowerCase() + " [Expectation: %s]", expectedValue));
        try{

        } catch (AssertionError e){
            Reporter.error(format("Assrtion error: [%s]", e.getMessage().replaceAll("\n", "")));
        }
    }
    public void login(){
        login.clickOnWebOption();
        login.goToIframe();
        checkThat("Log In is displayed", login.isLoginDisplayed(), is(true));
        checkThat("Email field is displayed", login.isEmailDisplayed(), is(true));
        checkThat("Password field is displayed", login.isPasswordDisplayed(), is(true));
        login.clickOnLoginBtn();
        checkThat("The email field is required", login.isEmailValidatorDisplayed(), is(true));
        checkThat("The password field is required", login.isPasswordValidatorDisplayed(), is(true));
        login.typeEmail();
        login.typePassword();
        login.clickOnLoginBtn();
    }
    public void profile(){
        checkThat("The user entered to the account", profile.isProfilePictureDisplayed(), is(true));
    }

    public void logOutProcess(){
        profile.clickOnLogOut();
    }
    public void logOutValidation(){
        checkThat("The user log out of the account", login.isLoginButtonDisplayed(), is(true));
    }
    public void teardown(){driver.getDriver().quit();}
}
