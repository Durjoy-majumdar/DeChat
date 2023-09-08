package com.tencent.p014mm.plugin.battery;

import android.app.ActivityManager;
import android.app.Notification;
import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import java.util.Iterator;
import java.util.List;
import kj2.C117407d;
import p918s2.C90116e;

/* renamed from: com.tencent.mm.plugin.battery.BackgroundActivationsListener */
public final class BackgroundActivationsListener extends NotificationListenerService {
    public void onCreate() {
        super.onCreate();
        Log.m105924i("MicroMsg.battery.BackgroundActivationsListener", "#onCreate");
        ComponentName componentName = new ComponentName(this, BackgroundActivationsListener.class);
        if (Build.VERSION.SDK_INT >= 24) {
            Log.m105924i("MicroMsg.battery.BackgroundActivationsListener", "requestRebind");
            NotificationListenerService.requestRebind(componentName);
            return;
        }
        Log.m105924i("MicroMsg.battery.BackgroundActivationsListener", "requestRebind Legacy");
        ActivityManager activityManager = (ActivityManager) getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (activityManager == null) {
            Log.m105928w("MicroMsg.battery.BackgroundActivationsListener", "am is null");
            return;
        }
        List<ActivityManager.RunningServiceInfo> runningServices = activityManager.getRunningServices(Integer.MAX_VALUE);
        if (runningServices == null || runningServices.isEmpty()) {
            Log.m105928w("MicroMsg.battery.BackgroundActivationsListener", "runningServices is empty");
            return;
        }
        boolean z = false;
        Iterator<ActivityManager.RunningServiceInfo> it = runningServices.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ActivityManager.RunningServiceInfo next = it.next();
            if (next.service.equals(componentName) && next.pid == Process.myPid()) {
                z = true;
                break;
            }
        }
        if (z) {
            Log.m105924i("MicroMsg.battery.BackgroundActivationsListener", "service is running, skip");
            return;
        }
        Log.m105924i("MicroMsg.battery.BackgroundActivationsListener", "try manually rebind service");
        ComponentName componentName2 = new ComponentName(this, BackgroundActivationsListener.class);
        PackageManager packageManager = getPackageManager();
        packageManager.setComponentEnabledSetting(componentName2, 2, 1);
        packageManager.setComponentEnabledSetting(componentName2, 1, 1);
    }

    public void onDestroy() {
        Log.m105924i("MicroMsg.battery.BackgroundActivationsListener", "#onDestroy");
        super.onDestroy();
    }

    public void onListenerConnected() {
        super.onListenerConnected();
        Log.m105924i("MicroMsg.battery.BackgroundActivationsListener", "#onListenerConnected");
    }

    public void onListenerDisconnected() {
        super.onListenerDisconnected();
        Log.m105924i("MicroMsg.battery.BackgroundActivationsListener", "#onListenerDisconnected");
    }

    public void onNotificationPosted(StatusBarNotification statusBarNotification) {
        super.onNotificationPosted(statusBarNotification);
        Log.m105924i("MicroMsg.battery.BackgroundActivationsListener", "#onNotificationPosted");
        Notification notification = statusBarNotification.getNotification();
        if ("FOREGROUND_SERVICE".equals(C90116e.m112746a(notification))) {
            Log.m105918d("MicroMsg.battery.BackgroundActivationsListener", "sbn = " + statusBarNotification.toString());
            String[] stringArray = notification.extras.getStringArray("android.foregroundApps");
            String packageName = getApplication().getPackageName();
            if (stringArray != null) {
                for (String str : stringArray) {
                    if (packageName.equals(str)) {
                        Log.m105928w("MicroMsg.battery.BackgroundActivationsListener", "AMS on updateForegroundApps, notification = " + notification.toString());
                        C117407d.INSTANCE.idkeyStat(1540, 100, 1, false);
                    } else {
                        Log.m105928w("MicroMsg.battery.BackgroundActivationsListener", "AMS on updateForegroundApps for others, pkg = " + str);
                        C117407d.INSTANCE.idkeyStat(1540, 101, 1, false);
                    }
                }
            }
        }
    }

    public void onNotificationRemoved(StatusBarNotification statusBarNotification) {
        super.onNotificationRemoved(statusBarNotification);
        Log.m105924i("MicroMsg.battery.BackgroundActivationsListener", "#onNotificationRemoved");
    }
}
