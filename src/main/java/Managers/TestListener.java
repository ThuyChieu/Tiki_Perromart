package Managers;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

/**
 * This class takes care of test report generation.
 *
 * @author tahanima
 * @since 02/03/2022
 */
public final class TestListener implements ITestListener {

  @Override
  public void onTestSuccess(final ITestResult result) {
    ITestNGMethod method = result.getMethod();
//    String testData = result.getParameters()[0].toString();

    System.out.println(String.format("PASS: %s in %d", result.getTestName(), result.getEndMillis() - result.getStartMillis()));
//    ExtentTest test =
//        REPORT
//            .createTest(method.getMethodName())
//            .assignCategory(method.getRealClass().getSimpleName())
//            .pass(String.format("Test Data: %s%n", testData));
  }

  @Override
  public void onTestFailure(final ITestResult result) {
//    String testData = result.getParameters()[0].toString();

    System.out.println(String.format("PASS: %s in %d", result.getTestName(), result.getEndMillis() - result.getStartMillis()));
//    ExtentTest test =
//        REPORT
//            .createTest(method.getMethodName())
//            .assignCategory(method.getRealClass().getSimpleName())
//            .fail(String.format("Test Data: %s%n", testData))
//            .fail(
//                result.getThrowable(),
//                MediaEntityBuilder.createScreenCaptureFromPath(
//                        String.format(
//                            "%s%s.png",
//                            configuration().baseScreenshotPath(), method.getMethodName()))
//                    .build());
  }

  @Override
  public void onTestSkipped(final ITestResult result) {
    ITestNGMethod method = result.getMethod();
    String testData = result.getParameters()[0].toString();

    System.out.println(String.format("SKIP: %s, %s", method.getMethodName(), testData));
//    ExtentTest test =
//        REPORT
//            .createTest(method.getMethodName())
//            .assignCategory(method.getRealClass().getSimpleName())
//            .skip(String.format("Test Data: %s%n", testData));
  }

  @Override
  public void onFinish(final ITestContext context) {
//    REPORT.flush();
  }
}
