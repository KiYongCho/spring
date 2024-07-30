package simpledi.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:conf/beans.xml")
public class HelloSpringTest {

	@Autowired
	private ApplicationContext context;
	
	@Before
	public void beforeTest() {
		System.out.println("test 전에 수행!");
	}
	
	@Test
	public void beanTest() {
		System.out.println("test 수행!");
		assertNull(new Object());
		assertFalse(false);
	}
	
	@After
	public void afterTest() {
		System.out.println("test 이후에 수행!");
	}
	
	
} // class















