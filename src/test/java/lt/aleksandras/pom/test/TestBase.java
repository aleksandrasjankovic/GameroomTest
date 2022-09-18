package lt.aleksandras.pom.test;

import lt.aleksandras.pom.pages.Common;
import lt.aleksandras.pom.utils.TestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;

@Listeners(TestListener.class)
public class TestBase {

    @AfterMethod
    public void teardown() {
//        Common.closeDriver();
    }

}
