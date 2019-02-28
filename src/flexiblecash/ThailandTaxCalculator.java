package flexiblecash;

public class ThailandTaxCalculator implements CalculateTax{

	@Override
	public double calculate(double purchase) {
		return purchase*0.07;
		
	}
	
}
