package exemplo2.creators;

import exemplo2.interfaces.Notification;
import exemplo2.products.SMSNotification;

public class SMSNotificationFactory extends NotificationFactory{
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}