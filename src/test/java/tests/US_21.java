package tests;


import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SpendinGoodPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
public class US_21 {
    //1 Vendor  "http://spendinggood.com/"  adresine  gider
    //2 Vendor 'Sign In' a tıklar
    //3.Vendor  gecerli Username girer
    //4.Vendor gecerli Password girer
    //5.Vendor 'SIGN IN' butonuna tiklar
    //6.Vendor 'My Account' a tiklar
    //7.Vendor 'Store Manager' a tiklar
    //8.Vendor ' Reports' a tiklar
    //9.Vendor yilik raporlari (Year) görüntüleyebilmeli
    //10.Vendor en son ay raporunu(Last Month) görüntüleyebilmeli
    //11.Vendor  mevcut ay raporunu(This Month) görüntüleyebilmeli
    //12.Vendor  son 7 gün raporunu(Last 7 Days) görüntüleyebilmeli
    //13.Vendor specific bir tarih araliginda rapor görüntüleyebilmeli


    @Test
    public void test01() {
        SpendinGoodPage spendinGoodPage = new SpendinGoodPage();
        Actions actions = new Actions(Driver.getDriver());
        //1 Vendor  "http://spendinggood.com/"  adresine  gider
        Driver.getDriver().get(ConfigReader.getProperty("spengood"));
        //2 Vendor 'Sign In' a tıklar
        spendinGoodPage.signIn1.click();
        //3.Vendor  gecerli Username girer
        //4.Vendor gecerli Password girer
        //5.Vendor 'SIGN IN' butonuna tiklar
        spendinGoodPage.userName.sendKeys(ConfigReader.getProperty("userName"));
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("password")).sendKeys(Keys.ENTER).perform();
        ReusableMethods.waitFor(2);
        //6.Vendor 'My Account' a tiklar
        spendinGoodPage.myAccount.click();
        //7.Vendor 'Store Manager' a tiklar
        spendinGoodPage.storeManager.click();
        //8.Vendor ' Reports' a tiklar
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        spendinGoodPage.reports.click();
        //9.Vendor yilik raporlari (Year) görüntüleyebilmeli
        spendinGoodPage.reportsyear.click();
        Assert.assertTrue(spendinGoodPage.rapor.isDisplayed());
        //10.Vendor en son ay raporunu(Last Month) görüntüleyebilmeli
        spendinGoodPage.lastmonth.click();
        Assert.assertTrue(spendinGoodPage.rapor.isDisplayed());
        //11.Vendor  mevcut ay raporunu(This Month) görüntüleyebilmeli
        spendinGoodPage.thismonath.click();
        Assert.assertTrue(spendinGoodPage.rapor.isDisplayed());
        //12.Vendor  son 7 gün raporunu(Last 7 Days) görüntüleyebilmeli
        spendinGoodPage.last7days.click();
        Assert.assertTrue(spendinGoodPage.rapor.isDisplayed());
        //13.Vendor specific bir tarih araliginda rapor görüntüleyebilmeli
        spendinGoodPage.custom.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        spendinGoodPage.date1.click();
        ReusableMethods.waitFor(2);
        spendinGoodPage.date2.click();
        Assert.assertTrue(spendinGoodPage.rapor.isDisplayed());



    }
}
