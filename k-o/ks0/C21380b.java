package ks0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: ks0.b */
public class C21380b implements C21385e {

    /* renamed from: d */
    public Context f60484d;

    /* renamed from: e */
    public final IntentFilter f60485e = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* renamed from: f */
    public final C21384d f60486f = new C21384d();

    /* renamed from: g */
    public Intent f60487g = null;

    /* renamed from: h */
    public final C21385e f60488h = this;

    /* renamed from: i */
    public C21382b f60489i;

    /* renamed from: ks0.b$b */
    public class C21382b extends BroadcastReceiver {
        public C21382b(C21381a aVar) {
        }

        public void onReceive(Context context, Intent intent) {
            synchronized (C21380b.this.f60488h) {
                C21380b.this.f60487g = intent;
            }
        }
    }
}
