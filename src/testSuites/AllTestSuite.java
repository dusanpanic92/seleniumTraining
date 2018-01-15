package testSuites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import dummyTest.ContactMessageTest;
import dummyTest.NavigationLinksTest;
import dummyTest.WebAppPageTitleTest;

@RunWith(Suite.class)
@Suite.SuiteClasses ({
	ContactMessageTest.class,
	NavigationLinksTest.class,
	WebAppPageTitleTest.class
})

public class AllTestSuite {

}
