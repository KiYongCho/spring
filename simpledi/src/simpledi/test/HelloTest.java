package simpledi.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import simpledi.bean.Hello;
import simpledi.service.Printer;

public class HelloTest {
	
		public static void main(String[] args) {
			
			// BeanFactory를 상속받은 ApplicationContext를 생성
			// conf/beans.xml(빈 설정 파일)을 읽어서 ApplicationContext를 생성
			ApplicationContext context =
					new GenericXmlApplicationContext("conf/beans.xml");
			
			// hello라는 id를 가진 빈을 찾아서 Hello 객체 생성
			Hello hello = (Hello)context.getBean("hello");
			System.out.println(hello);
			
			Hello hello2 = (Hello)context.getBean("hello");
			// 두 객체는 같은 객체, 특별한 설정을 하지 않으면 스프링은 객체를
			// 싱클턴(클래스에서 객체를 하나만 생성하는 패턴)으로 만듬
			// 빈 설정시에 scope="prototype"으로 하면 객체 생성시마다 다른 객체를 생성해 줌
			System.out.println(hello==hello2); 

			// stringPrinter라는 id를 가진 빈을 찾아서 StringPrinter 객체를 생성
			Printer stringPrinter = (Printer)context.getBean("stringPrinter");
			stringPrinter.print("stringPrinter");
			System.out.println(stringPrinter.toString());
			
			// consolePrinter라는 id를 가진 빈을 찾아서 ConsolePrinter 객체를 생성			
			Printer consolePrinter = (Printer)context.getBean("consolePrinter");
			consolePrinter.print("consolePrinter");
			
		} // main

} // class











