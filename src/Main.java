public class Main {
    public static void main(String[] args) {
        CreditService service = new CreditService();
        int CreditSumma = 1_000_000;
        int NumberOfMonths = 12;
        double Payment = service.calculate(CreditSumma, NumberOfMonths);
        System.out.println("Платёж в месяц составляет " + Payment + " Число месяцев равно " + NumberOfMonths);
        NumberOfMonths = 24;
        Payment = service.calculate(CreditSumma, NumberOfMonths);
        System.out.println("Платёж в месяц составляет " + Payment + " Число месяцев равно " + NumberOfMonths);
        NumberOfMonths = 36;
        Payment = service.calculate(CreditSumma, NumberOfMonths);
        System.out.println("Платёж в месяц составляет " + Payment + " Число месяцев равно " + NumberOfMonths);

    }
}