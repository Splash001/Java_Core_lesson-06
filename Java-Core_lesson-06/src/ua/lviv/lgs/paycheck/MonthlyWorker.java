package ua.lviv.lgs.paycheck;

public class MonthlyWorker implements Paycheck{
	
	private double payment;
	private String name;	
	
	public MonthlyWorker(double payment, String name) {
		super();
		this.payment = payment;
		this.name = name;
	}

	public double getPayment() {
		return payment;
	}

	public String getName() {
		return name;
	}

	public void setPayment(double payment) {
		this.payment = payment;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "MonthlyWorker [payment=" + payment + ", name=" + name + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void payCheck() {
		System.out.println(name + " received a paycheck of " + payment + "$ for working this month");
	}
	
	

}
