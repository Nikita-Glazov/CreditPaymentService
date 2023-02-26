public class CreditService {
    public double calculate(int creditSumma, double numberOfMonths) {
        double percent = 9.99;
        double monthlyInterestRate = percent / (100 * 12);
        double payment = creditSumma * (monthlyInterestRate / (1 - Math.pow((1 + monthlyInterestRate), -numberOfMonths)));
        return payment;
    }

}
