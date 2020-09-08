package java9.mod.modapp2;

import static org.junit.Assert.*;

import org.junit.Test;

import static java9.mod.modapp2.TestUtils.*;
public class MainTest {

	@Test
	public void testCheckPrime() throws Exception {
		yakshaAssert(currentTest(),(Main.checkPrime(2)?"true":"false"),businessTestFile);
		yakshaAssert(currentTest(),(Main.checkPrime(9)?"true":"false"),businessTestFile);
	}
	@Test
    public void testExceptionConditon() throws Exception{
	 yakshaAssert(currentTest(),true,boundaryTestFile);
      }

	@Test
	public void testBoundaryCondition() throws Exception {
	  yakshaAssert(currentTest(),true,exceptionTestFile);
   }



}
