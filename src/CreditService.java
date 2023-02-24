public class CreditService {
    public double calculate(int CreditSumma, double NumberOfMonths) {
        double percent = 9.99;
        double MonthlyInterestRate = percent / (100 * 12);
        double Payment = CreditSumma * (MonthlyInterestRate / (1 - Math.pow((1 + MonthlyInterestRate), -NumberOfMonths)));
        return Payment;
    }

}
