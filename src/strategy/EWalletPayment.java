package strategy;

public class EWalletPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Pembayaran sebesar " + amount + " menggunakan E-Wallet.");
    }
}
