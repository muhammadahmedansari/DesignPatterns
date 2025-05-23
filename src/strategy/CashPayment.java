package strategy;

public class CashPayment implements PaymentStrategy {
    private String currency;

    public CashPayment() {
    }

    public CashPayment(String currency) {
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    public CashPayment setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    @Override
    public void pay(int amount) {
        System.out.printf("Paid amount %d via currency %s%n", amount, currency);
    }
}