package androidx.core.app;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public abstract class NotificationCompatSideChannelService extends Service {
    public IBinder onBind(Intent intent) {
        intent.getAction().equals("android.support.BIND_NOTIFICATION_SIDE_CHANNEL");
        return null;
    }
}
