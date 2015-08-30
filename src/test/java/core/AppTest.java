package core;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AppTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	System.out.println("BeforeClass method will be executed befor first test method starts");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	System.out.println("AfterClass method will be executed after last test method completed");
	}

	@Before
	public void setUp() throws Exception {
	System.out.println("Before method will execute before every test method");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After method will execute after every test method");
	}

	@Test
	public void Test_01_assertEquals_Positive() {
		String s = "ok";
		assertEquals("Failure - string are not equal", "ok", s);
	       System.out.println("Test_01_assertEquals_Positive");
	}

	@Test
	public void Test_02_assertEquals_Negative() {
		String s = "Okay";
		assertEquals("Failure - string are not equal", "NotOkay", s);
	       System.out.println("Test_02_assertEquals_Negative");
	       }

	@Ignore
	@Test
	public void Test_03_assertEquals_Ignored() {
	       System.out.println("Test_03_assertEquals_Ignored");
	       }

	@Test
	public void Test_04_AssertSame_Positive() {
		Integer i = 10;
		assertSame("Should be the same", 10, i);
	       System.out.println("Test_04_AssertSame_Positive");
	       }

	@Test
	public void Test_05_AssertSame_Negative() {
		Integer i = 10;
		assertSame("Should be the same", 1, i);
	       System.out.println("Test_05_AssertSame_Negative");
	       }

	@Ignore
	@Test
	public void Test_06_AssertSame_Ignored() {
	       System.out.println("Test_06_AssertSame_Ignored");
	       }

	@Test
	public void Test_07_assertFalse_Positive() {
		Boolean f = false;
		assertFalse("Failure - should be false", f);
	       System.out.println("Test_07_assertFalse_Positive");
	       }

	@Test
	public void Test_08_assertFalse_Negative() {
		Boolean f = true;
		assertFalse("Failure - should be false", f);
	       System.out.println("Test_08_assertFalse_Negative");
	       }

	@Test
	public void Test_09_assertTrue_Positive() {
		Boolean t = true;
		assertTrue("Failure - should be true", t);
	       System.out.println("Test_09_assertTrue_Positive");
	       }

	@Test
	public void Test_10_assertTrue_Negative() {
		Boolean t = false;
		assertTrue("Failure - should be true", t);
	       System.out.println("Test_10_assertTrue_Negative");
	       }
	}