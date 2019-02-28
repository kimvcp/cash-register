
public class NYTaxCalculator implements CalculateTax{

	@Override
	public double calculate(double purchase) {
		 if (purchase > 100) {
	          return purchase * 0.08;
		 }
		 return 0;
	}

}
