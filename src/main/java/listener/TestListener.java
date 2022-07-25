package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.log4testng.Logger;

public class TestListener implements ITestListener {

    private static final Logger LOGGER = Logger.getLogger(ITestListener.class);

    @Override
    public void onTestStart(ITestResult result) {
        LOGGER.info(result.getMethod().getMethodName() + " started.");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        LOGGER.info(result.getMethod().getMethodName() + " succeeded.");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        LOGGER.info(result.getMethod().getMethodName() + " failed.");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        LOGGER.info(result.getMethod().getMethodName() + " skipped.");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }

}
