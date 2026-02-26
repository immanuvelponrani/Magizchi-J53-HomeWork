class UserSession {

    private static UserSession instance;
    private String userName;

    private UserSession() {}

    public static UserSession getInstance() {
        if (instance == null) {
            instance = new UserSession();
        }
        return instance;
    }

    void setUser(String name) {
        userName = name;
    }

    void showUser() {
        System.out.println("User: " + userName);
    }
}

public class SessionTest {
    public static void main(String[] args) {

        UserSession s1 = UserSession.getInstance();
        s1.setUser("Imman");

        UserSession s2 = UserSession.getInstance();
        s2.showUser();   // Same name prints
    }
}
