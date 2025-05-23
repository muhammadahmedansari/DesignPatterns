package strategy;

public class PayPalPayment implements PaymentStrategy {
    private String emailAddress;

    public PayPalPayment() {
    }

    public PayPalPayment(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public PayPalPayment setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    @Override
    public void pay(int amount) {
        System.out.printf("Paid amount %d via email address %s%n", amount, emailAddress);
    }
}