package in.ashokit.beans;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("Beans.xml");
		
		PaymentService ps = ctxt.getBean(PaymentService.class);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Bill amount:::");
		float billAmt = Float.parseFloat(sc.nextLine());
		
		
	
		ps.doPayment(billAmt);
	
		
	}

}
