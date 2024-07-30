package simpledi.bean;

import java.util.List;
import java.util.Map;

public class VO {
	
	private List<String> hobbyList;
	private Map<String, String> personMap;
	
	public List<String> getHobbyList() {
		return hobbyList;
	}
	
	public void setHobbyList(List<String> hobbyList) {
		this.hobbyList = hobbyList;
	}

	public Map<String, String> getPersonMap() {
		return personMap;
	}
	
	public void setPersonMap(Map<String, String> personMap) {
		this.personMap = personMap;
	}

} // class
