/**
 * Created by Brothers on 19.02.2016.
 */

import org.testng.annotations.*;

public class TestSecond {

    @BeforeClass
    protected void beforeClass(){
        System.out.println("Hello guys! beforeClass run");
    }

    @AfterClass
    protected void afterClass(){
        System.out.println("Bye guys! afterClass run");
    }

    @BeforeMethod
    protected void beforeMethod(){
        System.out.println("Start initializing process! beforeMethod run");
    }

    @AfterMethod
    protected void afterMethod() {
        System.out.println("Finish initializing process! afterMethod run");
    }

    @Test
    protected void test() {
        System.out.println("Calculation! test is run");
    }
}
