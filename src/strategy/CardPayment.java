package strategy;

public class CardPayment implements PaymentStrategy {
    private String cardNumber;

    public CardPayment() {
    }

    public CardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public CardPayment setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
        return this;
    }

    @Override
    public void pay(int amount) {
        System.out.printf("Paid amount %d via card %s%n", amount, cardNumber);
    }
}