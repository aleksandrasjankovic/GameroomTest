package lt.aleksandras.pom.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        takeScreenShots();

    }

    private void takeScreenShots() {
        TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();
        File screenshotRow = takesScreenshot.getScreenshotAs(OutputType.FILE);

        String directory = "./screenshots";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH_mm_ss");
        LocalDateTime localDateTime = LocalDateTime.now();
        String dateTime = localDateTime.format(formatter);

        File screenshotFile = new File(
                directory + "/screenshot_" + dateTime + "_" + UUID.randomUUID() + ".png"
        );

        try {
            FileUtils.copyFile(screenshotRow, screenshotFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
