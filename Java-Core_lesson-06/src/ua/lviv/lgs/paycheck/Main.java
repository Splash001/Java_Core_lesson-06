package ua.lviv.lgs.paycheck;

public class Main {
	
	public static void main(String[] args) {
		
		Worker w = new Worker(8, 32.1, "John");
		w.payCheck();
		w.monthlyEarning(8, 32.1);
		
		MonthlyWorker mw = new MonthlyWorker(3240.99, "Eddy");
		mw.payCheck();
	}

}
