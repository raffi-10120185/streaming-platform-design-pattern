import singleton.StreamingConfig;
import facade.StreamingFacade;
import strategy.*;

public class Main {

    public static void main(String[] args) {

        // === TEST SINGLETON ===
        System.out.println("=== TEST SINGLETON ===");
        StreamingConfig config1 = StreamingConfig.getInstance();
        StreamingConfig config2 = StreamingConfig.getInstance();

        System.out.println("Quality: " + config1.getDefaultQuality());
        System.out.println("Apakah instance sama? " + (config1 == config2));

        // === TEST FACADE ===
        System.out.println("\n=== TEST FACADE ===");
        StreamingFacade facade = new StreamingFacade();
        facade.watchContent("Raffi", "12345", "Avengers");

        // === TEST STRATEGY ===
        System.out.println("\n=== TEST STRATEGY ===");
        Subscription subscription = new Subscription();

        subscription.setPaymentStrategy(new CreditCardPayment());
        subscription.processPayment(150000);

        subscription.setPaymentStrategy(new EWalletPayment());
        subscription.processPayment(150000);

        subscription.setPaymentStrategy(new BankTransferPayment());
        subscription.processPayment(150000);
    }
}
