package exemplo2.creators;

import exemplo2.interfaces.Notification;
import exemplo2.products.PushNotification;

public class PushNotificationFactory extends NotificationFactory{
    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}