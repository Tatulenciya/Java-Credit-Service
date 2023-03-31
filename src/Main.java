public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();
        int loan = 1_000_000;          // сумма кредита в рублях
        int time = 12;                 // срок кредита в месяцах
        double annualInterest = 9.99; // годовая ставка в процентах
        int monthlyPayment = service.calculate(annualInterest, loan, time);
        System.out.println ();
        System.out.println ("Ежемесячный платеж при сроке кредита 1 год");
        System.out.println (monthlyPayment + " рублей.");

        System.out.println ();
        System.out.println ("Ежемесячный платеж при сроке кредита 2 года");
        System.out.println (service.calculate(9.99, 1000000, 24)+ " рублей.");

        System.out.println ();
        System.out.println ("Ежемесячный платеж при сроке кредита 3 года");
        System.out.println (service.calculate(9.99, 1000000, 36)+ " рублей.");

    }
}