package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p1014o4.C117693m;

public abstract class ConstraintProxy extends BroadcastReceiver {

    /* renamed from: a */
    public static final String f338375a = C117693m.m165967e("ConstraintProxy");

    public static class BatteryChargingProxy extends ConstraintProxy {
    }

    public static class BatteryNotLowProxy extends ConstraintProxy {
    }

    public static class NetworkStateProxy extends ConstraintProxy {
    }

    public static class StorageNotLowProxy extends ConstraintProxy {
    }

    public void onReceive(Context context, Intent intent) {
        C117693m.m165966c().mo182389a(f338375a, String.format("onReceive : %s", new Object[]{intent}), new Throwable[0]);
        String str = C113055a.f338384g;
        Intent intent2 = new Intent(context, SystemAlarmService.class);
        intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
        context.startService(intent2);
    }
}
