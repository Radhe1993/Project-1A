package uk.co.library.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import uk.co.library.pages.HomePage;

public class JobSearchTest {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I  enter job title {string}")
    public void iEnterJobTitle(String jobTitle)
    {
       new HomePage().enterJobTitle(jobTitle);

    }

    @And("I  enter Location {string}")
    public void iEnterLocation(String location)
    {
        new HomePage().enterLocation(location);
    }

    @And("I select distance {string}")
    public void iSelectDistance(String distance)
    {
        new HomePage(). selectDistance(distance);
    }

    @And("I click on moreSearchOptionsLink")
    public void iClickOnMoreSearchOptionsLink()
    {
        new HomePage(). setMoreSearchLink();
    }

    @And("I  enter salaryMin {string}")
    public void iEnterSalaryMin(String salaryMin)
    {
        new HomePage(). enterMinSalary(salaryMin);
    }

    @And("I enter salaryMax {string}")
    public void iEnterSalaryMax(String salaryMax)
    {
        new HomePage(). enterMaxSalary(salaryMax);
    }

    @And("I select salaryType {string}")
    public void iSelectSalaryType(String salaryType)
    {
        new HomePage().setSalaryType(salaryType);
    }

    @And("I select jobType {string}")
    public void iSelectJobType(String jobType)
    {
        new HomePage(). setJobType(jobType);
    }

    @And("I click on Find job button")
    public void iClickOnFindJobButton() {
        new HomePage(). clickOnFindJob();
    }

    @Then("I should see the result {string}")
    public void iShouldSeeTheResult(String result)
    {
        Assert.assertEquals(new HomePage().setResult(),result,"result");
    }


}
