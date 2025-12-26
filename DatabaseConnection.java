package example;

public class DatabaseConnection {
	private boolean connected = false;

    public void connectToDatabase() {
        connected = true;
    }

    public void closeConnection() {
        connected = false;
    }

    public boolean isConnected() {
        return connected;
    }
   public void anyKind() {
	   System.out.println("penguin");
   }
}
