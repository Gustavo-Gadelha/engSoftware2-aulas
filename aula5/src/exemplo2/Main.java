package exemplo2;

import exemplo2.creators.EmailNotificationFactory;
import exemplo2.creators.NotificationFactory;
import exemplo2.creators.PushNotificationFactory;
import exemplo2.creators.SMSNotificationFactory;
import exemplo2.interfaces.Notification;

public class Main {
    public static void main(String[] args) {
        NotificationFactory emailFactory = new EmailNotificationFactory();
        Notification emailNotification = emailFactory.createNotification();
        emailNotification.send("Enviada por Email");

        NotificationFactory pushFactory = new PushNotificationFactory();
        Notification pushNotification = pushFactory.createNotification();
        pushNotification.send("Enviada por Push");

        NotificationFactory smsFactory = new SMSNotificationFactory();
        Notification smsNotification = smsFactory.createNotification();
        smsNotification.send("Enviada por SMS");
    }
}
