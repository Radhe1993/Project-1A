package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobTitle;

    @CacheLookup
    @FindBy(xpath = "//input[@id='location']")
    WebElement location;

    @CacheLookup
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distance;

    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchLink;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;

    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryType;

    @CacheLookup
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobType;

    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJob;

    @CacheLookup
    @FindBy(xpath = "//body/main[@id='site-main']/div[1]/section[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[4]/select[1]/option[6]")
    WebElement result;


    // @CacheLookup
    //   @FindBy(xpath = "//body/main[@id='site-main']/div[1]/div[1]/div[2]")
    //WebElement result;

    public void enterJobTitle(String job)
    {
        sendTextToElement(jobTitle,job);
        log.info("Enter job title : " + jobTitle.toString());
    }

    public void enterLocation(String location1)
    {
        sendTextToElement(location,location1);
        log.info("Enter Location : " + location.toString());
    }
    public void selectDistance(String text)
    {
        selectByVisibleTextFromDropDown(distance,text);
        log.info("Select  Distance : " + distance.toString());
    }
    public void setMoreSearchLink()
    {
        clickOnElement(moreSearchLink);
        log.info("Clicking on register link : " + moreSearchLink.toString());
    }
    public void enterMinSalary(String min)
    {
        sendTextToElement(salaryMin,min);
        log.info("Enter MinSalary : " + salaryMin.toString());
    }
    public void enterMaxSalary(String max)
    {
        sendTextToElement(salaryMax,max);
        log.info("Enter MaxSalary : " + salaryMax.toString());
    }
    public void setSalaryType(String  text1)
    {
        selectByVisibleTextFromDropDown(salaryType,text1);
        log.info("Select SalaryType : " + salaryType.toString());
    }
    public void setJobType(String type)
    {
        sendTextToElement(jobType,type);
        log.info("Send job Type : " + jobType.toString());

    }
    public void clickOnFindJob()
    {
        clickOnElement(findJob);
        log.info("Clicking on register link : " + findJob.toString());
    }
    public String setResult()
    {
       return getTextFromElement(result);
    }

    public void sendData(String jobTitle, String location, String distance, String salaryMin, String salaryMax, String salaryType, String jobType,String result)
    {
        enterJobTitle(jobTitle);
        enterLocation(location);
        selectDistance(distance);
        setMoreSearchLink();
        enterMinSalary(salaryMin);
        enterMaxSalary(salaryMax);
        setSalaryType(salaryType);
        setJobType(jobType);
        clickOnFindJob();
        setResult();

    }

}
