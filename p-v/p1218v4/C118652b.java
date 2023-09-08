package p1218v4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.firebase.analytics.FirebaseAnalytics;
import p1014o4.C117693m;
import p1169a5.C112757a;

/* renamed from: v4.b */
public class C118652b extends C118653c<Boolean> {

    /* renamed from: i */
    public static final String f355042i = C117693m.m165967e("BatteryNotLowTracker");

    public C118652b(Context context, C112757a aVar) {
        super(context, aVar);
    }

    /* renamed from: a */
    public Object mo183374a() {
        Intent registerReceiver = this.f355048b.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver == null) {
            C117693m.m165966c().mo182390b(f355042i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        float intExtra2 = ((float) registerReceiver.getIntExtra(FirebaseAnalytics.C113379b.LEVEL, -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
        if (intExtra == 1 || intExtra2 > 0.15f) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: e */
    public IntentFilter mo183375e() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    /* renamed from: f */
    public void mo183376f(Context context, Intent intent) {
        if (intent.getAction() != null) {
            C117693m.m165966c().mo182389a(f355042i, String.format("Received %s", new Object[]{intent.getAction()}), new Throwable[0]);
            String action = intent.getAction();
            action.getClass();
            if (action.equals("android.intent.action.BATTERY_OKAY")) {
                mo183380b(Boolean.TRUE);
            } else if (action.equals("android.intent.action.BATTERY_LOW")) {
                mo183380b(Boolean.FALSE);
            }
        }
    }
}
