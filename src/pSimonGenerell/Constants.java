package pSimonGenerell;

public class Constants {

    // PORTS N HOSTS
    public static final String SERVER_HOST = "localhost";
    public static final int SERVER_PORT = 8888;
    public static final int REG_PORT = 9999;
    public static final String CLIENT_HOST = "localhost";
    public static final String SERVER_FILE_DIR = "pics/";
    
    public static final long SERVER_PING_INTERVALL = 5000;
    
    // STRINGS 
    public static final String ASK_FOR_RECONNECTING = "Would you like to try to reconnect to server?";
    public static final String FILE_REQUESTED = "Requested to download file: ";
    public static final String RUNNER_SEND = "Send a TimRunner to be queued in Servers ThreadPool! ";
    public static final String SERVER_PING_MESSAGE = "Server sends a message to all registered users!";
}
