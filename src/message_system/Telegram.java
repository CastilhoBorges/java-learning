package message_system;

public class Telegram extends MessageSystem {
    public void sentMessage() {
        System.out.println("Sent message in Telegram");
    }

    public void receivedMessage() {
        System.out.println("Received message in Telegram");
    }
}
