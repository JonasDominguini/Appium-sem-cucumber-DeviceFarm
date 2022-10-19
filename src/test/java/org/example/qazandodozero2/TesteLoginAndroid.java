package org.example.qazandodozero2;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class TesteLoginAndroid {

    private static ScreenLogin ScreenLogin;
    private static AppiumDriver<RemoteWebElement> driver;

    @BeforeClass
    public static void caps() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app", new File("apps/app-debug.apk"));
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("unicodeKeyboard", true);
        driver = new AndroidDriver<RemoteWebElement>(new URL("http://localhost:4723/wd/hub"), capabilities);
        ScreenLogin = new ScreenLogin(driver);
    }

    @Test
    public void testeLogin() {
        ScreenLogin.logar();
    }
}