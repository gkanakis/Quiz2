package Quiz2;

public class quiz2 {
	private double tuition;
	private double percentIncrease;
	private double apr;
	private double paymentPeriod;
	
	public quiz2(double tuition, double percentIncrease, double apr, double paymentPeriod) {
		this.tuition = tuition;
		this.percentIncrease = percentIncrease;
		this.apr = apr;
		this.paymentPeriod = paymentPeriod;
	}
	
	public double totalTuitionCost( ) {
		double fullcost = tuition;
		double increase = tuition;
		for (int year = 1; year <= 4; year = year + 1) {
			if (year > 1) {
				increase = increase + (increase * percentIncrease);
				fullcost = fullcost + increase;
			}
		}
		
		fullcost = fullcost + (fullcost / paymentPeriod) * apr * paymentPeriod ; 
		return fullcost;
	}
}
