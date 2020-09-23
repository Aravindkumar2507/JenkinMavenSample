package training;

import static org.junit.Assert.*;

import org.junit.Test;

public class JenkinsCaseTest {

	@Test
	public void addtest() {
		JenkinsCalculator a = new JenkinsCalculator();
		assertEquals(10, a.addVals(4,6));
//		fail("Not yet implemented");
	}
	
	@Test
	public void subtest() {
		JenkinsCalculator a = new JenkinsCalculator();
		assertEquals(4, a.subVals(10,6));
//		fail("Not yet implemented");
	}
	@Test
	public void multiplytest() {
		JenkinsCalculator a = new JenkinsCalculator();
		assertEquals(24, a.multiplyVals(4,6));
//		fail("Not yet implemented");
	}
	
	@Test
	public void checktest() {
		JenkinsCalculator a = new JenkinsCalculator();
		assertTrue("Error in Test Report", 24 == a.multiplyVals(4,6));
		assertEquals(24, a.multiplyVals(4,6));
//		fail("Not yet implemented");
	}

}
