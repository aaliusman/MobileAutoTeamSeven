package cnbcPages;

import base.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends MobileAPI {
    @FindBy(id = "com.cnbc.client:id/index_text")
    WebElement home;
    public void clickOnHomeBtn(){
        home.click();
    }
}
