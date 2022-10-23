package tests;


import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SpendinGoodPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
public class US_20 {
    //1 Vendor  "http://spendinggood.com/"  adresine  gider
    //2 Vendor 'Sign In' a tıklar
    //3.Vendor  gecerli Username girer
    //4.Vendor gecerli Password girer
    //5.Vendor 'SIGN IN' butonuna tiklar
    //6.Vendor 'My Account' a tiklar
    //7.Vendor 'Store Manager' a tiklar
    //8.Vendor 'Reviews' a tiklar
    //9.Vendor 'Produckt Reviews' butonuna'a tiklar
    //10.Vendor kullanici bilgisi(Author)görür
    //11.Vendor kullanicinin yorumunu(Comment) görür
    //12.Vendor kullanicinin degerlendirmesini(Rating)görür
    //13.Vendor kullacinin yorum tarihini (Dated) görür

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
        //8.Vendor 'Reviews' a tiklar
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(3);
        spendinGoodPage.reviews.click();
        ReusableMethods.waitFor(3);
        //9.Vendor 'Produckt Reviews' butonuna'a tiklar
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        spendinGoodPage.producktreviews.click();
        ReusableMethods.waitFor(3);
        //10.Vendor kullanici bilgisi(Author)görür
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(3);
        Assert.assertFalse(spendinGoodPage.author.getText().isEmpty());
        //11.Vendor kullanicinin yorumunu(Comment) görür
        Assert.assertFalse(spendinGoodPage.comment.getText().isEmpty());
        //12.Vendor kullanicinin degerlendirmesini(Rating)görür
        Assert.assertTrue(spendinGoodPage.rating.isDisplayed());
        //13.Vendor kullacinin yorum tarihini (Dated) görür
        Assert.assertFalse(spendinGoodPage.dated.getText().isEmpty());


    }
}
