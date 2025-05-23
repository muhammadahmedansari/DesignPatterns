package strategy;

public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setPaymentStrategy(new CashPayment("PKR"));
        shoppingCart.checkout(500);

        shoppingCart.setPaymentStrategy(new CardPayment("1234-5678-9876-5432"));
        shoppingCart.checkout(600);

        shoppingCart.setPaymentStrategy(new PayPalPayment("abc@gmail.com"));
        shoppingCart.checkout(300);
    }
}