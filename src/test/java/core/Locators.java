package core;

public class Locators {

//The benefit of using locators in a separate file is to separate them from browser actions. Usage on constants
//allows to concatenate xpaths to make them more reusable and reliable

    public static String LOGIN_FIELD = "//*[@id=\"username\"]";

    public static String PASSWORD_FIELD = "//*[@id=\"password\"]";

    public static String LOGIN_BUTTON = "//*[@id=\"signInBtn\"]";

    public static String IN_PLAY_TABLE = "//*[@class=\"betLiveBorderFrame\"]";

    public static String IN_PLAY_FOOTBALL = IN_PLAY_TABLE + "/div[2]/a[1]/span/span";

    public static String FIRST_FOOTBALL_EVENT_HOME = IN_PLAY_TABLE + "/div[3]/div[1]/div[1]/table/tbody/tr[7]/td[5]/div[1]";

    public static String BET_SLIPS = "//*[@id=\"slipHideSelections\"]";

    public static String BET_SLIP_TABLE_1ST_ENTRY_BET = BET_SLIPS + "/div[6]/div[2]/div[1]/div[3]/*[@type=\"text\"]";

    public static String PLACE_BET_BUTTON = "//*[@id=\"slipBtnPlaceBet\"]";

    public static String SLIP_ERROR_NOTIFIER = "//*[@id=\"slipError0\"]/div[2]/strong";
}
