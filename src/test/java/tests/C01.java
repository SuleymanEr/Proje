package tests;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C01 {

    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("spengood"));
    }
}
