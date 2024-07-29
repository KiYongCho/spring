package simpledi.bean;

import simpledi.service.Printer;

public class Hello {
	
	private String name;
	private Printer printer;
	
	public Hello() {
		// TODO Auto-generated constructor stub
	}

	public Hello(String name, Printer printer) {
		super();
		this.name = name;
		this.printer = printer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Printer getPrinter() {
		return printer;
	}

	public void setPrinter(Printer printer) {
		this.printer = printer;
	}

	@Override
	public String toString() {
		return "Hello [name=" + name + ", printer=" + printer + "]";
	}

}
