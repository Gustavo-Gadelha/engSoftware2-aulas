package exemplo1;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection connection = DatabaseConnection.getInstance();
        connection.executeQuery("SELECT * FROM user");
    }
}
