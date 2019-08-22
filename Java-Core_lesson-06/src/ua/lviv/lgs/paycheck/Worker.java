package ua.lviv.lgs.paycheck;

public class Worker implements Paycheck{
	
	private double workingHours;
	private double payment;
	private String name;	
	
	public Worker(double workingHours, double payment, String name) {
		super();
		this.workingHours = workingHours;
		this.payment = payment;
		this.name = name;
	}
	
	public double getWorkingHours() {
		return workingHours;
	}
	public double getPayment() {
		return payment;
	}
	public String getName() {
		return name;
	}
	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}
	public void setPayment(double payment) {
		this.payment = payment;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Worker [workingHours=" + workingHours + ", payment=" + payment + ", name=" + name + ", toString()="
				+ super.toString() + "]";
	}

	@Override
	public void payCheck() {
		System.out.println(name + " received a paycheck of " + payment + "$ for working " + workingHours + " hours");
	}
	
	public void monthlyEarning(double workingHours, double payment) {
		double totalPaycheck;
		totalPaycheck = workingHours*payment*30;
		System.out.println(name + " received a paycheck of "+ totalPaycheck + "$ for working this month");
	}

}
