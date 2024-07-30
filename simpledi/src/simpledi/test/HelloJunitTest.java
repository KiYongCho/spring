package simpledi.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import simpledi.bean.Hello;
import simpledi.service.Printer;

public class HelloJunitTest {
	
	ApplicationContext context = null;
			
	@Before
	public void init() {
		context = new GenericXmlApplicationContext("conf/beans.xml");
		System.out.println("test 시작!");
	}
	
	@Test
	public void testBean() {
		Hello hello = (Hello)context.getBean("hello");
		Hello hello2 = (Hello)context.getBean("hello");
		assertSame(hello, hello2);
	}
	
	@Test
	public void testString() {
		Printer printer = (Printer)context.getBean("stringPrinter");
		printer.print("hello");
		assertEquals(printer.toString(), "hello");
	}
	
	@Test
	public void testNotnull() {
		Object obj = new Object();
		assertNotNull(obj);
	}
	
	@Test
	public void testBoolean() {
		boolean bool = false;
		assertTrue(bool);
	}
	
	@After
	public void end() {
		System.out.println("test 종료!");
	}	

} // class













