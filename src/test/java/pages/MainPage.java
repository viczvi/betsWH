package pages;

import static core.Actions.clickOnElement;
import static core.Actions.enterText;
import static core.Actions.getTextFromElement;
import static core.Constants.TEST_PASSWORD;
import static core.Constants.TEST_USERNAME;
import static core.Locators.*;

public class MainPage {
//This class holds all actions relevant to some page. The idea to left these methods as non-static is that multiple
//pages across application might have the same actions inside (but with different implementation) - hence, explicit usage
//of class instance with its methods will increase code readability

    public void logInAsCustomer(){
        enterText(LOGIN_FIELD, TEST_USERNAME);
        enterText(PASSWORD_FIELD, TEST_PASSWORD);
        clickOnElement(LOGIN_BUTTON);
    }

    public void chooseClosestFootballEvent(){
        clickOnElement(FIRST_FOOTBALL_EVENT_HOME);
    }

    public void placeBetOnClosestEvent(Double betSize){
        enterText(BET_SLIP_TABLE_1ST_ENTRY_BET, betSize.toString());
        clickOnElement(PLACE_BET_BUTTON);
    }

    public String getSlipErrorText() {
        return getTextFromElement(SLIP_ERROR_NOTIFIER);
    }
}
