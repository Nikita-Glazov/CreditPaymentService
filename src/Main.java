public class Main {
    public static void main(String[] args) {
        CreditService service = new CreditService();
        int creditSumma = 1_000_000;
        int numberOfMonths = 12;
        double payment = service.calculate(creditSumma, numberOfMonths);
        System.out.println("Платёж в месяц составляет " + payment + " Число месяцев равно " + numberOfMonths);
        numberOfMonths = 24;
        payment = service.calculate(creditSumma, numberOfMonths);
        System.out.println("Платёж в месяц составляет " + payment + " Число месяцев равно " + numberOfMonths);
        numberOfMonths = 36;
        payment = service.calculate(creditSumma, numberOfMonths);
        System.out.println("Платёж в месяц составляет " + payment + " Число месяцев равно " + numberOfMonths);

    }
}