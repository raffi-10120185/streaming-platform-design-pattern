package strategy;

public class Subscription {

    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void processPayment(double amount) {
        if (strategy == null) {
            System.out.println("Metode pembayaran belum dipilih.");
        } else {
            strategy.pay(amount);
        }
    }
}
