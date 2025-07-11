package message_system;

public class Main {
    public static void main(String[] args) {
        MSN msn = new MSN();
        Facebook facebook = new Facebook();
        Telegram telegram = new Telegram();

        msn.sentMessage();
        msn.receivedMessage();

        facebook.sentMessage();
        facebook.receivedMessage();

        telegram.sentMessage();
        telegram.receivedMessage();
    }
}
