package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import p1014o4.C117693m;
import p1169a5.C112758b;
import p1206p4.C117979k;
import p1222y4.C118922g;

public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final String f338376a = C117693m.m165967e("ConstrntProxyUpdtRecvr");

    /* renamed from: androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver$a */
    public class C113054a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Intent f338377d;

        /* renamed from: e */
        public final /* synthetic */ Context f338378e;

        /* renamed from: f */
        public final /* synthetic */ BroadcastReceiver.PendingResult f338379f;

        public C113054a(ConstraintProxyUpdateReceiver constraintProxyUpdateReceiver, Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f338377d = intent;
            this.f338378e = context;
            this.f338379f = pendingResult;
        }

        public void run() {
            try {
                boolean booleanExtra = this.f338377d.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f338377d.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f338377d.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f338377d.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                C117693m.m165966c().mo182389a(ConstraintProxyUpdateReceiver.f338376a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", new Object[]{Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)}), new Throwable[0]);
                C118922g.m167677a(this.f338378e, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                C118922g.m167677a(this.f338378e, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                C118922g.m167677a(this.f338378e, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                C118922g.m167677a(this.f338378e, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f338379f.finish();
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            C117693m.m165966c().mo182389a(f338376a, String.format("Ignoring unknown action %s", new Object[]{action}), new Throwable[0]);
            return;
        }
        ((C112758b) C117979k.m166386b(context).f352607d).mo164514a(new C113054a(this, intent, context, goAsync()));
    }
}
