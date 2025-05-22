package singleton;

public class Main {
    public static void main(String[] args) {
        DBConnection.getInstance();
        DBConnection.getInstance();
        DBConnection.getInstance();
        DBConnection.getInstance();

        Thread clientOneRequest = new Thread(() -> {
            System.out.println("instance requested from client one");
            DBConnection.getInstance();
        });
        clientOneRequest.start();

        Thread clientTwoRequest = new Thread(() -> {
            System.out.println("instance requested from client two");
            DBConnection.getInstance();
        });
        clientTwoRequest.start();
    }
}