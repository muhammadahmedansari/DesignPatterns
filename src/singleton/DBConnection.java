package singleton;

public class DBConnection {
    private static volatile DBConnection instance;

    private DBConnection() {
    }

    public static synchronized DBConnection getInstance() {
        if (instance == null) {
            System.out.println("new instance created and returned");
            instance = new DBConnection();
            return instance;
        }

        System.out.println("existing instance returned");
        return instance;
    }
}