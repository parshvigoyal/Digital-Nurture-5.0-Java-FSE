public class DecoratorPattern {

    interface Notifier {
        void send(String message);
    }

    static class EmailNotifier implements Notifier {

        public void send(String message) {
            System.out.println("Email: " + message);
        }
    }

    static abstract class NotifierDecorator implements Notifier {

        protected Notifier notifier;

        NotifierDecorator(Notifier notifier) {
            this.notifier = notifier;
        }
    }

    static class SMSNotifierDecorator extends NotifierDecorator {

        SMSNotifierDecorator(Notifier notifier) {
            super(notifier);
        }

        public void send(String message) {
            notifier.send(message);
            System.out.println("SMS: " + message);
        }
    }

    static class SlackNotifierDecorator extends NotifierDecorator {

        SlackNotifierDecorator(Notifier notifier) {
            super(notifier);
        }

        public void send(String message) {
            notifier.send(message);
            System.out.println("Slack: " + message);
        }
    }

    public static void main(String[] args) {

        Notifier notifier = new SlackNotifierDecorator(
                                new SMSNotifierDecorator(
                                    new EmailNotifier()));

        notifier.send("Assignment Submitted Successfully");
    }
}