package programs;

import programs.array.FindSumTest;
import org.junit.runner.Result;
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;
public class TestRunner {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(FindSumTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println("WasSuccessful ? "+result.wasSuccessful());
    }
}
