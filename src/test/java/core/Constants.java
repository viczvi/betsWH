package core;

public class Constants {
//This class holds constants, like credentials, URLs, expected messages. The benefit to split it from real actions
//is that this data can be used across different test cases

    public static String MAIN_PAGE_URL = "http://sports.williamhill.com/bet/en-gb";

    public static String TEST_USERNAME = "TestUserForBets";

    public static String TEST_PASSWORD = "123456";

    public static String SLIP_ERROR_NOTIFIER_EXPECTED_TEXT = "Alert - your bet has not been placed";
}
