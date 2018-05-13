package alipages;

import base.MobileAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends MobileAPI {

    @FindBy(id="com.alibaba.aliexpresshd:id/iv_close_poplayer")
    WebElement couponPopUp;

    public void clickOnPopUp() {
        clickOnElement(ad, "com.alibaba.aliexpresshd:id/iv_close_poplayer");
    }

    public void searchItem(String itemName){
        enterValueOnElement(ad, "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.TextView", itemName);
    }
}
