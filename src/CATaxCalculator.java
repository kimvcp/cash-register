
public class CATaxCalculator implements CalculateTax{

	@Override
	public double calculate(double purchase) {
		return purchase * 0.075;
	}

}
