package exemplo2.products;

import exemplo2.interfaces.Notification;

public class PushNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Notificação enviada via Push: " + message);
    }
}
