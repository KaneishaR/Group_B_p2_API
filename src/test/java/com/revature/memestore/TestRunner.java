package com.revature.memestore;

import com.revature.memestore.suites.UserServiceTestSuite;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(UserServiceTestSuite.class);
        for(Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }
    }

}