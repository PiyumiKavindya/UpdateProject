package utils;

import driver.DriverManager;
import org.junit.Assert;

public class WebAssert {
    public void assertUrl(String expectedUrl){
        String url = DriverManager.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, url);
    }

    public void assertText(String expectedText, String actualText){
        Assert.assertEquals(expectedText, actualText);
    }

    public void assertHeader(String expectedHeader, String actualHeader ){
        Assert.assertEquals(expectedHeader, actualHeader);
    }

    public void assertName(String expectedName, String actualName ){
        Assert.assertEquals(expectedName,actualName);

    }

    public void assertConfirm(String expectedConfirm, String actualConfirm){
        Assert.assertEquals(expectedConfirm,actualConfirm);
    }


    public void assertConfirm1(String expectedConfirm, String actualConfirm) {
        Assert.assertEquals(expectedConfirm, actualConfirm);

    }

    public void assertConfirm2(String expectedConfirm, String actualConfirm) {
        Assert.assertEquals(expectedConfirm, actualConfirm);

    }


}
