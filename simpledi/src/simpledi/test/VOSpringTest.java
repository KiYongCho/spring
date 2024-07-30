package simpledi.test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import simpledi.bean.VO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:conf/beans.xml")
public class VOSpringTest {

	@Autowired
	private ApplicationContext context;
	
	@Test
	public void listTest() {
		VO vo = (VO)context.getBean("vo");
		List<String> hobbyList = vo.getHobbyList();
		for (String hobby :  hobbyList) {
			System.out.println(hobby);
		}
	}
	
	@Test
	public void mapTest() {
		VO vo = (VO)context.getBean("vo");
		Map<String, String> personMap = vo.getPersonMap();
		Set<String> keySet = personMap.keySet();
		for (String key : keySet) {
			System.out.println("key:" + key + ", value:" + personMap.get(key));
		}
	}
	
} // class













