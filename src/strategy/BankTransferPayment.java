package strategy;

public class BankTransferPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Pembayaran sebesar " + amount + " menggunakan Bank Transfer.");
    }
}
