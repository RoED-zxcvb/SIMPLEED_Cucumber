package Steps;


import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomeSteps {
    
    @When("some step A")
    public void someStepA() {
        System.out.println("some step 1 text");
    }

    @When("some step B")
    public void someStepB() {
        System.out.println("some step 2 text");
    }


    @When("some assert step 1=={int}")
    public void someAssertStep(int i) {
        assertEquals(1,i);

    }
}
