package config;

import config.converters.StringToBrowserTypeConverter;
import config.converters.StringToMobilePlatformTypeConverter;
import config.converters.StringToMobileRemoteModeTypeConverter;
import config.converters.StringToRemoteModeBrowserTypeConverter;
import config.converters.StringToRunModeBrowserTypeConverter;
import config.converters.StringToURLConverter;
import enums.BrowserRemoteModeType;
import enums.BrowserType;
import enums.MobilePlatformType;
import enums.MobileRemoteModeType;
import enums.RunModeType;
import org.aeonbits.owner.Config;

import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/config.properties",
        "file:${user.dir}/src/test/resources/staging-config.properties",
        "file:${user.dir}/src/test/resources/dev-config.properties"
})
public interface FrameworkConfig extends Config {

    @DefaultValue("staging")
    String environment();

    @Key("${environment}.webUrl")
    String webUrl();

    @DefaultValue("CHROME")
    @ConverterClass(StringToBrowserTypeConverter.class)
    BrowserType browser();

    @Key("runModeBrowser")
    @ConverterClass(StringToRunModeBrowserTypeConverter.class)
    RunModeType browserRunMode();

    @Key("browserRemoteMode")
    @ConverterClass(StringToRemoteModeBrowserTypeConverter.class)
    BrowserRemoteModeType browserRemoteMode();

    @Key("runModeMobile")
    @ConverterClass(StringToRunModeBrowserTypeConverter.class)
    RunModeType mobileRunMode();

    @Key("mobileRemoteMode")
    @ConverterClass(StringToMobileRemoteModeTypeConverter.class)
    MobileRemoteModeType mobileRemoteMode();

    @ConverterClass(StringToURLConverter.class)
    URL seleniumGridURL();

    @ConverterClass(StringToURLConverter.class)
    URL selenoidURL();

    @ConverterClass(StringToURLConverter.class)
    @DefaultValue("http://127.0.0.1:4723/wd/hub")
    URL localAppiumServerURL();

    @ConverterClass(StringToMobilePlatformTypeConverter.class)
    @DefaultValue("ios")
    MobilePlatformType mobilePlatformType();
}
