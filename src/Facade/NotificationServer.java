package Facade;

public class NotificationServer {
    // connect() -> Connection
    public Connection connect(String ipAddress){
        return new Connection();
    }
    // authenticate(appID, key) -> AuthToken
    public AuthToken authenticate(String appID, String key){
        return new AuthToken();
    }
    // send(authToken, message, target)
    public void send(AuthToken authToken, Message message, String target){
        System.out.println("Send a message");
    }

    // conn.disconnect()
}

