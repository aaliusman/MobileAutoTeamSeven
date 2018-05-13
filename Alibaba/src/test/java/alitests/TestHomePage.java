package alitests;

import alipages.HomePage;
import org.testng.annotations.Test;
import reporting.TestLogger;

import static alipages.AccessibilityPage.clickNodeProvider;

public class TestHomePage extends HomePage {
    @Test
    public void test01() throws Exception {
        TestLogger.log("app is launched ...");
        clickOnPopUp();
//        searchItem("tea cup");
        System.out.println("Test Case 1 Passed");
    }
}

