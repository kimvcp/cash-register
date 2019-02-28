
public class CashRegister {
    private double purchase; // total amount of product price bought
    private double payment;  // total amount of payment
    private CalculateTax calculateTax;

    public CashRegister(CalculateTax calTax) {
        purchase = 0;
        payment = 0;
        calculateTax = calTax;
    }

    public void recordPurchase(double amount) {
        purchase += amount;
    }

    public void calculateTax() {
        purchase += calculateTax.calculate(purchase);
    }

    public void enterPayment(double amount) {
        payment += amount;
    }

    public double giveChange() {
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        return change;
    }
}
