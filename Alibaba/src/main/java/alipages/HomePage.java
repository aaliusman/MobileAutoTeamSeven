package alipages;

import base.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends MobileAPI {

    @FindBy(xpath="com.alibaba.aliexpresshd:id/iv_close_poplayer")
    WebElement couponPopUp;
    public void clickOnPopUp(){
        ad.switchTo().frame(0);
        couponPopUp.click();
    }
}
