package cnbctests;

import cnbcPages.HomePage;
import org.testng.annotations.Test;

public class TestHomePage extends HomePage {

    @Test
    public void Test01(){
        System.out.println("CNBC launched.");
        clickOnHomeBtn();
        clickOnNews();
    }
}
