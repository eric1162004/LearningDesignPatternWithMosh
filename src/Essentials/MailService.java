package Essentials;

public class MailService {
    public void sendEmail(){
        connect();
        authenticate();
        discconect();
    }

    private void connect(){
        System.out.println("Connect");
    }

    public void discconect(){
        System.out.println("Disconnect");
    }

    public void authenticate(){
        System.out.println("anthenticate");
    }
}
