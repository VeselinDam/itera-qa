package Base;

import org.testng.annotations.Test;

public class Login extends BasePage {
    @Test
    public static void testUser(){
        homePage.setUsername("Admin");
        homePage.setPhone("123-456-789");
        homePage.setEmail("admin123@gmail.com");
        homePage.setPassword("admin123");
        homePage.checkGender();
        homePage.pickDay();
        homePage.travelToCountry();
        homePage.yearsOfExperionce();
        homePage.pickTool();
        homePage.setButton();
    }
}
