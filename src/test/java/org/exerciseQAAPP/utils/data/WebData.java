package org.exerciseQAAPP.utils.data;

public class WebData {
    private String url;
    private String browser;
    private String email;
    private String password;

    public WebData() {
        this.url = "https://snack.expo.dev/?platform=web";
        this.browser = "chrome";
        this.email = "jordan.mail@gmail.com";
        this.password = "pwd123";
    }

    public String getUrl() {
        return url;
    }

    public String getBrowser() {
        return browser;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
