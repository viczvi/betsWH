import core.AbstractTest;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@CucumberOptions(
        features = "src/test/resources/features",
//        features = "C:\\Users\\palpatin\\IdeaProjects\\bdd\\src\\test\\resources\\PlaceBet.feature",
        glue = {"steps"},
//        glue = {"C:\\Users\\palpatin\\IdeaProjects\\bdd\\src\\test\\java\\steps\\StepDefinitions.java"},
        format = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty"
        }
        )

public class BetsTest extends AbstractTest {

    private TestNGCucumberRunner testNGCucumberRunner;

//Despite I tested by running via class, TestNG groups were added to make possible to run via groups
    @BeforeClass(groups = "bets")
    public void setupClass() {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }

    @Test(groups = "bets")
    public void feature(CucumberFeatureWrapper cucumberFeature) {
        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
    }

    @AfterClass (groups = "bets")
    public void tearDown(){
        testNGCucumberRunner.finish();
    }
}
