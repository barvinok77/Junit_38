package core;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AppTest {
	
	@BeforeClass
	public static void testBeforeClass() {
		System.out.println("Code executed once before first Test Method");
	}
	
	@AfterClass
	public static void testAfterClass() {
		System.out.println("Code executed once after last Test Method");
	}
	
	@Before
	public void testBefore() {
		System.out.println("Code executed before each Test Method");
	}
	
	@After
	public void testAfter() {
		System.out.println("Code executed after each Test Method");
	}
	
	@Test
	public void test01_AssertEqualsPositive() {
		System.out.println("test01_AssertEqualsPositive");
	}
	
	@Test
	public void test02_AssertEqualsNegative() {
		System.out.println("test02_AssertEqualsNegative");
	}
	
	@Test @Ignore
	public void test03_AssertEqualsIgnored() {
		System.out.println("test03_AssertEqualsIgnored");
	}
	
	@Test
	public void test04_AssertSamePositive() {
		System.out.println("test04_AssertSamePositive");
	}
	
	@Test
	public void test05_AssertSameNegative() {
		System.out.println("test05_AssertSameNegative");
	}
	
	@Test @Ignore
	public void test06_AssertSameIgnored() {
		System.out.println("test06_AssertSameIgnored");
	}
	
	@Test
	public void test07_AssertFalsePositive() {
		System.out.println("test07_AssertFalsePositive");
	}
	
	@Test
	public void test08_AssertFalseNegative() {
		System.out.println("test08_AssertFalseNegative");
	}
	
	@Test
	public void test09_AssertTruePositive() {
		System.out.println("test09_AssertTruePositive");
	}
	
	@Test
	public void test10_AssertTrueNegative() {
		System.out.println("test10_AssertTrueNegative");
	}
}
