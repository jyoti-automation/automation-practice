package api.cucumber.hooks;

import io.cucumber.core.gherkin.Step;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import org.junit.Before;

public class cucumberHooks {
    @Before
    public void setUp(){
        System.out.println("---Before hook---");
    }
    @After
    public void tearDown(){
        System.out.println("---After hook");
    }
    @BeforeStep
    public void setUp2(){
        System.out.println("---BeforeSteps hook---");
    }
   @ AfterStep
    public void tearDown2(){
       System.out.println("---tearDown2---");
   }


}
