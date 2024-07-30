package simpledi.anno.service;

import org.springframework.stereotype.Component;

@Component("stringPrinter")
public class StringPrinter implements Printer {
	
	private StringBuilder sb = new StringBuilder();

	@Override
	public void print(String message) {
		this.sb.append(message);
	}
	
	@Override
	public String toString() {
		return this.sb.toString();
	}

}
