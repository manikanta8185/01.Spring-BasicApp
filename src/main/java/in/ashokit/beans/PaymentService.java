package in.ashokit.beans;

public class PaymentService {
	
	private IPayment payment;
	
//	public PaymentService(IPayment payment) {
//		super();
//		this.payment = payment;
//	}
	
	public void setPayment(IPayment payment) {
		this.payment=payment;
	}
	public IPayment getPayment() {
		return payment;
	}


	public void doPayment(double billAmt) {
		boolean status = payment.processPayment(billAmt);
		
		if(status) {
			System.out.println("Recipt Printing::");
		} else {
			System.out.println("Card Declined...");
		}
		
	}

}
