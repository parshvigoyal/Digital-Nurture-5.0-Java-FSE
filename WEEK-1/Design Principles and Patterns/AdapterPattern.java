public class AdapterPattern {

    interface PaymentProcessor {
        void processPayment(double amount);
    }

    static class PayPalGateway {
        void makePayment(double amount) {
            System.out.println("Payment of Rs." + amount + " processed using PayPal.");
        }
    }

    static class StripeGateway {
        void pay(double amount) {
            System.out.println("Payment of Rs." + amount + " processed using Stripe.");
        }
    }

    static class PayPalAdapter implements PaymentProcessor {

        private PayPalGateway gateway = new PayPalGateway();

        public void processPayment(double amount) {
            gateway.makePayment(amount);
        }
    }

    static class StripeAdapter implements PaymentProcessor {

        private StripeGateway gateway = new StripeGateway();

        public void processPayment(double amount) {
            gateway.pay(amount);
        }
    }

    public static void main(String[] args) {

        PaymentProcessor paypal = new PayPalAdapter();
        PaymentProcessor stripe = new StripeAdapter();

        paypal.processPayment(1500);
        stripe.processPayment(2500);
    }
}