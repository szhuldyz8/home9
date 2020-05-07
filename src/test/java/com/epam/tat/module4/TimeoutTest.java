package com.epam.tat.module4;

import org.testng.annotations.Test;

public class TimeoutTest {

    @Test (timeOut = 5000)
    public void sleepTestPass() throws InterruptedException{
       Thread.sleep(4000);
    }
    @Test (timeOut = 1000)
    public void testSleepFail() {
        while(true);
    }

}
