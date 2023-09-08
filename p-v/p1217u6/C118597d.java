package p1217u6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p1217u6.C118589a;

/* renamed from: u6.d */
public class C118597d implements C118589a {

    /* renamed from: f */
    public static final IntentFilter f354898f = new IntentFilter("android.intent.action.CONFIGURATION_CHANGED");

    /* renamed from: a */
    public final C118599e f354899a;

    /* renamed from: b */
    public final Context f354900b;

    /* renamed from: c */
    public final C118589a.C118590a f354901c;

    /* renamed from: d */
    public BroadcastReceiver f354902d;

    /* renamed from: e */
    public C118591b f354903e = null;

    /* renamed from: u6.d$a */
    public class C118598a extends BroadcastReceiver {
        public C118598a() {
        }

        public void onReceive(Context context, Intent intent) {
            C118591b a = C118597d.this.f354899a.mo183346a();
            if (!a.equals(C118597d.this.f354903e)) {
                C118597d dVar = C118597d.this;
                dVar.f354903e = a;
                dVar.f354901c.mo183344a(a);
            }
        }
    }

    public C118597d(C118599e eVar, Context context, C118589a.C118590a aVar) {
        this.f354899a = eVar;
        this.f354900b = context;
        this.f354901c = aVar;
    }

    /* renamed from: a */
    public void mo183342a() {
        if (this.f354902d == null) {
            C118598a aVar = new C118598a();
            this.f354902d = aVar;
            this.f354900b.registerReceiver(aVar, f354898f);
            C118591b a = this.f354899a.mo183346a();
            this.f354903e = a;
            this.f354901c.mo183344a(a);
        }
    }

    /* renamed from: b */
    public void mo183343b() {
        BroadcastReceiver broadcastReceiver = this.f354902d;
        if (broadcastReceiver != null) {
            this.f354900b.unregisterReceiver(broadcastReceiver);
            this.f354902d = null;
        }
    }
}
