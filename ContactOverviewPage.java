package domain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class ContactOverviewPage extends Page {

    public ContactOverviewPage(WebDriver driver) {
        super(driver);
        this.driver.get(getPath()+"?command=ContactOverview");
    }

    public boolean containsName(String fullName) {
        ArrayList<WebElement> listItems=(ArrayList<WebElement>) this.driver.findElements(By.cssSelector("td"));
        boolean found=false;
        for (WebElement listItem:listItems) {
            if (listItem.getText().contains(fullName)) {
                found=true;
            }
        }
        return found;
    }
}