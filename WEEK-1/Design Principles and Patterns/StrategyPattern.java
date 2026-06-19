public class StrategyPattern {

    interface PaymentStrategy {
        void pay(double amount);
    }

    static class CreditCardPayment implements PaymentStrategy {

        public void pay(double amount) {
            System.out.println("Paid Rs." + amount + " using Credit Card.");
        }
    }

    static class PayPalPayment implements PaymentStrategy {

        public void pay(double amount) {
            System.out.println("Paid Rs." + amount + " using PayPal.");
        }
    }

    static class PaymentContext {

        private PaymentStrategy strategy;

        PaymentContext(PaymentStrategy strategy) {
            this.strategy = strategy;
        }

        public void executePayment(double amount) {
            strategy.pay(amount);
        }
    }

    public static void main(String[] args) {

        PaymentContext payment1 = new PaymentContext(new CreditCardPayment());
        payment1.executePayment(2500);

        PaymentContext payment2 = new PaymentContext(new PayPalPayment());
        payment2.executePayment(1500);
    }
}