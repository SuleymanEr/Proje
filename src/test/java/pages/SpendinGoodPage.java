package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SpendinGoodPage {

    public SpendinGoodPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//*[text()='Sign In ']")
    public WebElement signIn1;
    @FindBy(xpath = "//*[@id='username']")
    public WebElement userName;
    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;
    @FindBy(xpath = "//button[@name='login']")
    public WebElement signIn2;
    @FindBy(xpath = "//li[@id='menu-item-1074']")
    public WebElement myAccount;
    @FindBy(xpath = "//*[text()='Store Manager']")
    public WebElement storeManager;
    @FindBy(xpath = "//span[contains(text(),'Reviews')]")
    public WebElement reviews;
    @FindBy(xpath = " //span[contains(text(),'Reports')]")
    public WebElement reports;
    @FindBy(xpath = "//*[text()='Product Reviews']")
    public WebElement producktreviews;
    @FindBy(xpath = "(//*[@class='wcfmmp-author-meta'])[1]")
    public WebElement author;
    @FindBy(xpath = "(//*[@class='wcfmmp-comments-content'])[1]")
    public WebElement comment;
    @FindBy(xpath = "(//*[@class='wcfmmp-rating'])[1]")
    public WebElement rating;
    @FindBy(xpath = "//*[text()='15 October 2022 16:48']")
    public WebElement dated;
    @FindBy(xpath = "//*[text()='Year']")
    public WebElement reportsyear;
    @FindBy(xpath = "//*[text()='Last Month']")
    public WebElement lastmonth;
    @FindBy(xpath = "(//*[text()='This Month'])[1]")
    public WebElement thismonath;
    @FindBy(xpath = "//*[text()='Last 7 Days']")
    public WebElement last7days;
    @FindBy(xpath = "//*[@class='wcfm-date-range']")
    public WebElement custom;
    @FindBy(xpath = "//*[@id='chart-placeholder-canvas']")
    public WebElement rapor;
    @FindBy(xpath = "(//div[text()='18'])[1]")
    public WebElement date1;
    @FindBy(xpath = "(//div[text()='18'])[2]")
    public WebElement date2;

    @FindBy(xpath = "(//*[@class='text'])[4]")
    public WebElement products;
    @FindBy(xpath = "//*[@id='add_new_product_dashboard']")
    public WebElement addNew;
    @FindBy(xpath = "//*[@id='manage_stock']")
    public WebElement manageStock;
    @FindBy(xpath = "//*[@id='stock_qty']")
    public WebElement stockqty;
    @FindBy(xpath = "//*[@id='backorders']")
    public WebElement backOrders;
    @FindBy(xpath = "//*[text()='Shipping']")
    public WebElement shipping;
    @FindBy(xpath = "//*[@id='weight']")
    public WebElement weight;
    @FindBy(xpath = "//*[@id='_wcfmmp_processing_time']")
    public WebElement processingTime;
    @FindBy(xpath = "//span[contains(text(),'Refund')]")
    public WebElement refund;


}
