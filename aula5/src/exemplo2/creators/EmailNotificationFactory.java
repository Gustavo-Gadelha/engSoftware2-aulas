package exemplo2.creators;

import exemplo2.interfaces.Notification;
import exemplo2.products.EmailNotification;

public class EmailNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}