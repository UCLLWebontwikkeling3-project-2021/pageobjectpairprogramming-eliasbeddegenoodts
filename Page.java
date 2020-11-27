package domain;

import org.openqa.selenium.WebDriver;

public abstract class Page {

    WebDriver driver;
    String path = "http://localhost:8080/Opdracht1A_war_exploded/Controller";

    public Page (WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public String getPath() {
        return path;
    }

    public String getTitle () {
        return driver.getTitle();
    }

}