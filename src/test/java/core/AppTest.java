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

	//////////////////////////////////////////////////////////////////
	
	
	
	
	
	
	@Test
	public void Test_01_assertEquals_Positive() {
		//String s = "ok";
		assertEquals("String not the same", "Testing JUnit 4", App.s);
	      
	}

	@Test
	public void Test_02_assertEquals_Negative() {
		//String s = "Okay";
		assertEquals("String not the same.", "Testing TestNG 6", App.s);
	      
	       }

	@Ignore
	@Test
	public void Test_03_assertEquals_Ignored() {
		 assertEquals("String not the same.", "Testing JUnit 3", App.s);
	       }

	@Test
	public void Test_04_AssertSame_Positive() {
		//Integer i = 10;
		assertSame("Integer not the same.", 55,App.i);
	       
	       }

	@Test
	public void Test_05_AssertSame_Negative() {
		//Integer i = 10;
		 assertSame("Integer not the same.", 54,App.i);
	     
	       }

	@Ignore
	@Test
	public void Test_06_AssertSame_Ignored() {
		assertSame("Integer not the same.", 56,App.i);
	       }

	@Test
	public void Test_07_assertFalse_Positive() {
		//Boolean f = false;
		assertFalse("Boolean should be false", App.f);
	     
	       }

	@Test
	public void Test_08_assertFalse_Negative() {
		//Boolean f = true;
		assertFalse("Boolean should be false", App.t);
	       
	       }

	@Test
	public void Test_09_assertTrue_Positive() {
		//Boolean t = true;
		assertTrue("Boolean should be true", App.t);
	      
	       }

	@Test
	public void Test_10_assertTrue_Negative() {
		//Boolean t = false;
		assertTrue("Boolean should be true", App.f);
	      
	       }
	}