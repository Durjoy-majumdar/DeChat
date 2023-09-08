package qh3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: qh3.g */
public final class C89669g extends BroadcastReceiver {

    /* renamed from: a */
    public C89660a<Boolean> f257901a;

    /* renamed from: b */
    public C89660a<Boolean> f257902b;

    public C89669g(Context context) {
        int intExtra;
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver != null && ((intExtra = registerReceiver.getIntExtra("status", -1)) == 2 || intExtra == 5)) {
            z = true;
        }
        this.f257901a = new C89660a<>("charging", Boolean.valueOf(z));
        this.f257902b = new C89660a<>("interactive", Boolean.valueOf(((PowerManager) context.getSystemService("power")).isScreenOn()));
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        context.registerReceiver(this, intentFilter);
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action != null) {
            C89660a<Boolean> aVar = null;
            char c = 65535;
            switch (action.hashCode()) {
                case -2128145023:
                    if (action.equals("android.intent.action.SCREEN_OFF")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1886648615:
                    if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1454123155:
                    if (action.equals("android.intent.action.SCREEN_ON")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1019184907:
                    if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    this.f257902b.mo123989f(Boolean.FALSE);
                    aVar = this.f257902b;
                    break;
                case 1:
                    this.f257901a.mo123989f(Boolean.FALSE);
                    aVar = this.f257901a;
                    break;
                case 2:
                    this.f257902b.mo123989f(Boolean.TRUE);
                    aVar = this.f257902b;
                    break;
                case 3:
                    this.f257901a.mo123989f(Boolean.TRUE);
                    aVar = this.f257901a;
                    break;
            }
            if (aVar != null) {
                Log.m105925i("MicroMsg.SystemStatus", "System status changed: %s = %s", aVar.f257889d, aVar.f257890e.toString());
            }
        }
    }
}
