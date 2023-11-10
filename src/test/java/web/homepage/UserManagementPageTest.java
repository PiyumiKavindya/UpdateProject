//package web.homepage;
//
//import org.junit.jupiter.api.Test;
//import pages.web.LoginPage;
//import pages.web.UserManagementPage;
//import utils.WebAssert;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//
//public class UserManagementPageTest extends UserManagementPage{
//
//    UserManagementPage newUser = new UserManagementPage();
//
//    LoginPage userPage = new LoginPage();
//
//    WebAssert assertions2 = new WebAssert();
//
//    @Test
//    public void testPage() throws InterruptedException {
//
//
//        userPage.loginToApplication("curran.ipay", "123456");
//    }
//
//   @Test
//
//    public void managementLogin() throws InterruptedException{
//       userPage.loginToApplication("curran.ipay", "123456");
//
//   }
//
//    @Test
//
//    public void createUserLogin() throws InterruptedException{
//        userPage.loginToApplication("curran.ipay", "123456");
//
//    }
//
//    @Test
//
//    public void testFirstName() throws InterruptedException, IOException {
//
//
//        String jsonBody = new String(Files.readAllBytes(Paths.get("src/test/resources/userHomePage.json")));
//
//    }
//
//    @Test
//
//    public void testLastName() throws InterruptedException{
//        userPage.loginToApplication("curran.ipay", "123456");
//
//    }
//
//    @Test
//
//    public void testMobileNumber() throws InterruptedException{
//        userPage.loginToApplication("curran.ipay", "123456");
//
//    }
//    @Test
//
//    public void testEmail() throws InterruptedException{
//        userPage.loginToApplication("curran.ipay", "123456");
//
//    }
//
//    @Test
//
//    public void testEmployeeNo() throws InterruptedException{
//        userPage.loginToApplication("curran.ipay", "123456");
//
//    }
//
//    @Test
//
//    public void userName() throws InterruptedException{
//        userPage.loginToApplication("curran.ipay", "123456");
//
//    }
//
//    @Test
//
//    public void testRadioButton() throws InterruptedException{
//        userPage.loginToApplication("curran.ipay", "123456");
//
//    }
//
//    @Test
//
//    public void testProfilePicture() throws InterruptedException{
//        userPage.loginToApplication("curran.ipay", "123456");
//
//    }
//
//
//}
