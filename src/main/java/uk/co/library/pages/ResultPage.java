package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.library.utility.Utility;

public class ResultPage  extends Utility
{
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Permanent jobs')]")
    WebElement result;

    public void setResult()
    {
        getTextFromElement(result);
    }
}
