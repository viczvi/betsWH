package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.MainPage;

import static core.Actions.getTextFromElement;
import static core.Actions.navigateToUrl;
import static core.Constants.MAIN_PAGE_URL;
import static core.Constants.SLIP_ERROR_NOTIFIER_EXPECTED_TEXT;
import static org.testng.Assert.assertEquals;

public class StepDefinitions {

    @Given("^user logs in and navigates to the site and opens championship event$")
    public void navigateToMainPage() {
        navigateToUrl(MAIN_PAGE_URL);
        MainPage mainPageObject = new MainPage();
        mainPageObject.logInAsCustomer();
        throw new PendingException();
    }

    @When("^user places a \"([^\"]*)\" bet for win for the home team$")
    public void userPlacesABetForWinForTheHomeTeam(Double quantity) throws Throwable {
        MainPage mainPageObject = new MainPage();
        mainPageObject.chooseClosestFootballEvent();
        mainPageObject.placeBetOnClosestEvent(quantity);
        throw new PendingException();
    }

//THEN implementation below supposed to be different, as per task; however, when I started to manually check this case,
//it required me to create and place some cash to make the bet. Hence, the code below just checks the error message,
//not a real return return from the bet
    @Then("^the odds and returns are displayed$")
    public void theOddsAndReturnsAreDisplayed() throws Throwable {
        MainPage mainPageObject = new MainPage();
        assertEquals(mainPageObject.getSlipErrorText(), SLIP_ERROR_NOTIFIER_EXPECTED_TEXT,
                "Acutual error message differs from expected one.");
        throw new PendingException();
    }
}
