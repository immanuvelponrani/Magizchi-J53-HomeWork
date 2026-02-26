class MessageLogger {

    private static MessageLogger instance;

    private MessageLogger() {}

    public static synchronized MessageLogger getInstance() {
        if (instance == null) {
            instance = new MessageLogger();
        }
        return instance;
    }

    void logMessage(String msg) {
        System.out.println(Thread.currentThread().getName()
                + ": " + msg);
    }
}

public class LoggerTest {
    public static void main(String[] args) {

        Runnable task = () -> {
            MessageLogger logger =
                MessageLogger.getInstance();
            logger.logMessage("Log message");
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();
    }
}
