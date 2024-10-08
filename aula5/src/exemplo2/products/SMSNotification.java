package exemplo2.products;

import exemplo2.interfaces.Notification;

public class SMSNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Notificação enviada via SMS: " + message);
    }
}
