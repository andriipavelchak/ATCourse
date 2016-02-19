/**
 * Created by Brothers on 18.02.2016.
 */

import org.testng.annotations.*;
public class TestFirst {

    protected int first_point = 4;
    protected int second_point = 8;
    protected int calculation;

    @BeforeClass
    protected void beforeClass(){
        System.out.println("Hello guys");
    }

    @AfterClass
    protected void afterClass(){
        if (calculation > 12){
        System.out.println("Bye guys, all right");
        }
        else System.out.println("Wrong result. You may need recalculate.");
    }

    @BeforeMethod
    protected void beforeMethod(){
        System.out.println("Start initializing process");
    }

    @AfterMethod
    protected void afterMethod() {
        System.out.println("Finish initializing process");
    }

    @Test
    protected void test() {
        calculation = first_point + second_point;
        System.out.println("Result = " + calculation);
    }
}

