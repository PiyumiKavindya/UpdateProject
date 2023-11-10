package web.homepage;





import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.web.HomePage;
//import com.aventstack.extentreports.ExtentHtmlReporter;

import pages.web.UserManagementPage;
import utils.DataUtil;
//import utils.TestListener;
import utils.GetScreenshot;
import utils.WebAssert;
import web.WebSetup;
import pages.web.LoginPage;

import java.io.IOException;

import static org.testng.Assert.assertTrue;

//@Listeners(TestListener.class)
public class HomePageTest extends WebSetup {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    UserManagementPage userManagementPage = new UserManagementPage();
    WebAssert assertions = new WebAssert();
    DataUtil dataUtil = new DataUtil();
    JSONParser parser = new JSONParser();

    ExtentReports extent;

    ExtentTest test;


   // WebDriver driver;

    protected static WebDriver driver;


    @BeforeTest
    public void init()
    {
        extent = new ExtentReports(System.getProperty("user.dir") + "/test-output/ExtentScreenshot.png", true);


    }


    @Test
    public void testLoginPage1() throws InterruptedException {


        loginPage.loginToApplication("curran.ipay", "13456");

    }


    @Test
    void testUrl() throws InterruptedException {

        test = extent.startTest("captureScreenshot");
        loginPage.loginToApplication("curran.ipay", "123456");
        assertions.assertUrl("https://developer.ipay.lk/ipayCallCenterApp/dashboard");
        test.log(LogStatus.PASS, "Test Passed");

    }


    @Test
    void invalidDashboardTitle() throws InterruptedException {

        test = extent.startTest("captureScreenshot");
        driver = new ChromeDriver();
        loginPage.loginToApplication("curran.ipay", "123456");
        assertions.assertText("Dashboard", homePage.getTitle());
        test.log(LogStatus.PASS, "Test Passed");

    }
    @AfterMethod
    public void getResult(ITestResult result) throws IOException
    {
        if(result.getStatus() == ITestResult.FAILURE)
        {
            //GetScreenshot screenshot = new GetScreensot();
            String screenShotPath = GetScreenshot.capture(driver, "screenShotName");
            test.log(LogStatus.FAIL, result.getThrowable());
            test.log(LogStatus.FAIL, "Snapshot below: " + test.addScreenCapture(screenShotPath));
        }
        extent.endTest(test);
    }




    @Test
    void testHeader() throws InterruptedException {

        test = extent.startTest("captureScreenshot");
        loginPage.loginToApplication("curran.ipay", "123456");
        assertions.assertHeader("lakshika", homePage.getHeader());
        test.log(LogStatus.PASS, "Test Passed");

    }

    @Test
    void testName() throws InterruptedException {

        loginPage.loginToApplication("curran.ipay", "123456");
        assertions.assertName("iPay Call Center Portal", homePage.getName());


    }

    @Test
    public void testUserCreation() throws IOException, ParseException, InterruptedException {

        JSONObject jsonData = (JSONObject) parser.parse(dataUtil.jsonReader());
        loginPage.loginToApplication("curran.ipay", "123456");
        userManagementPage.navigateToUserMgt();
        userManagementPage.setFirstName(String.valueOf(jsonData.get("FirstName")));
        userManagementPage.setLastName(String.valueOf(jsonData.get("LastName")));
        userManagementPage.setMobileNumber(String.valueOf(jsonData.get("MobileNumber")));
        userManagementPage.setEmail(String.valueOf(jsonData.get("Email")));
        userManagementPage.setEmployeeNo(String.valueOf(jsonData.get("EmployeeNo")));
        userManagementPage.setRadioButton(String.valueOf(jsonData.get("RadioButton")));
        userManagementPage.setUserName2(String.valueOf(jsonData.get("Username2")));
//        userManagementPage.chooseImageButton(String.valueOf(jsonData.get("chooseImage")));
        userManagementPage.chooseImageButton("D:/project/src/test/resources/Images/Profile.jpeg");
        userManagementPage.clickSave();

        String confirmationMsg = userManagementPage.setConfirmMsg();
        assertTrue(confirmationMsg.contains("Success ! User registration successful"));
    }

    @AfterTest
    public void endreport()
    {
        driver.close();
        extent.flush();
        extent.close();
    }





}




