package in.ashokit.beans;

public class CreditCardPayment implements IPayment {
	
public boolean processPayment(double billAmt) {
		
		System.out.println("credit card payment is sucess");
		
		return true;
		
	}
	

}
