package in.ashokit.beans;

public class DebitCardPayment implements IPayment {
	
	public boolean processPayment(double billAmt) {
		
		System.out.println("Debit card payment is sucess");
		
		return true;
	}

}
