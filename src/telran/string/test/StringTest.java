package telran.string.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringTest {
	
	@Test
	void compareToTest(){
		assertEquals(2,"3".compareTo("123"));
		assertEquals(-1,"123".compareTo("124"));
		assertEquals(-2,"123".compareTo("12345"));
		assertEquals(0,"Java".compareTo("Java"));
		assertEquals('j'-'J',"java".compareTo("Java"));
		assertTrue("java".compareTo("JAVA")>0);
	}
	@Test
	void compareToIgnoreTest(){
		assertEquals(2,"3".compareToIgnoreCase("123"));
		assertEquals(-1,"123".compareToIgnoreCase("124"));
		assertEquals(-2,"123".compareToIgnoreCase("12345"));
		assertEquals(0,"Java".compareToIgnoreCase("JAva"));
		assertEquals(0,"java".compareToIgnoreCase("JAVA"));
		
	}
	
	@Test
	@DisplayName("test of the method concat")
	void concatTest() {
		String hello="Hello";
		
		assertEquals("Hello World!!!",hello.concat(" World").concat("!!!"));
		assertEquals("Hello",hello.concat(""));
		assertEquals("Hello","".concat(hello));
		assertEquals("","".concat(""));
	}
	@Test
	void startsWithTest(){
		String hello="World";
		assertTrue(hello.startsWith("Worl"));
		assertFalse(hello.startsWith("worl"));
		assertTrue(hello.startsWith(""));
		
	}
	@Test
	void endsWithTest(){
		String hello="World";
		assertTrue(hello.endsWith("ld"));
		assertFalse(hello.endsWith("l"));
		assertTrue(hello.endsWith(""));
		
	}
	@Test
	void equalsIgnoreTest(){
		String hello="Java";
		assertTrue(hello.equalsIgnoreCase("JaVa"));
		assertFalse(hello.equalsIgnoreCase("JaVaa"));
		assertFalse(hello.equalsIgnoreCase(null));
	}
	@Test
	void containsTest(){
		String hello="Hello";
		assertTrue(hello.contains("ell"));
		assertFalse(hello.contains("lll"));
	}
	@Test
	void indexOfTest(){
		String hello="Java";
		assertEquals(0,hello.indexOf("Java"));
		assertEquals(1,hello.indexOf("ava"));
		assertEquals(-1,hello.indexOf("vv"));
		assertEquals(0,hello.indexOf(""));
	}
	@Test
	void lastindexOfTest(){
		String hello="Java";
		assertEquals(0,hello.indexOf("J"));
		assertEquals(1,hello.indexOf("a"));
		assertEquals(2,hello.indexOf("v"));
		assertEquals(-1,hello.indexOf("j"));
	}
}
