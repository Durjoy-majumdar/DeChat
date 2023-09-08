package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import p1014o4.C117693m;
import p1206p4.C117979k;

public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final String f338380a = C117693m.m165967e("RescheduleReceiver");

    public void onReceive(Context context, Intent intent) {
        C117693m.m165966c().mo182389a(f338380a, String.format("Received intent %s", new Object[]{intent}), new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                C117979k b = C117979k.m166386b(context);
                BroadcastReceiver.PendingResult goAsync = goAsync();
                b.getClass();
                synchronized (C117979k.f352603l) {
                    b.f352612i = goAsync;
                    if (b.f352611h) {
                        goAsync.finish();
                        b.f352612i = null;
                    }
                }
            } catch (IllegalStateException e) {
                C117693m.m165966c().mo182390b(f338380a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
            }
        } else {
            String str = C113055a.f338384g;
            Intent intent2 = new Intent(context, SystemAlarmService.class);
            intent2.setAction("ACTION_RESCHEDULE");
            context.startService(intent2);
        }
    }
}
