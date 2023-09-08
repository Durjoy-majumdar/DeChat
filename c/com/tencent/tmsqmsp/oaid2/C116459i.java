package com.tencent.tmsqmsp.oaid2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.tencent.tmsqmsp.oaid2.C116449f;

/* renamed from: com.tencent.tmsqmsp.oaid2.i */
public class C116459i {

    /* renamed from: a */
    public boolean f349382a = false;

    /* renamed from: b */
    public Context f349383b;

    /* renamed from: c */
    public C116449f f349384c;

    /* renamed from: d */
    public C116452g f349385d;

    /* renamed from: e */
    public ServiceConnection f349386e = new C116460a();

    /* renamed from: com.tencent.tmsqmsp.oaid2.i$a */
    public class C116460a implements ServiceConnection {
        public C116460a() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C116445c.m164138a("HSDID did service binded");
            C116459i.this.f349384c = C116449f.C86058a.m106551a(iBinder);
            C116459i.this.mo179901a(true);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C116459i.this.mo179901a(false);
        }
    }

    public C116459i(Context context) {
        this.f349383b = context;
    }

    /* renamed from: a */
    public void mo179899a() {
        try {
            if (this.f349382a && this.f349386e != null && this.f349383b != null) {
                C116445c.m164138a("HSDID start to unbind did service");
                this.f349382a = false;
                this.f349383b.unbindService(this.f349386e);
            }
        } catch (Exception e) {
            C116445c.m164139b("HSDID error:" + e.getMessage());
        }
    }

    /* renamed from: a */
    public void mo179900a(C116452g gVar) {
        try {
            this.f349385d = gVar;
            Intent intent = new Intent("com.asus.msa.action.ACCESS_DID");
            ComponentName componentName = new ComponentName("com.asus.msa.SupplementaryDID", "com.asus.msa.SupplementaryDID.SupplementaryDIDService");
            Intent intent2 = new Intent(intent);
            intent2.setComponent(componentName);
            C116445c.m164138a("HSDID start to bind did service");
            boolean bindService = this.f349383b.bindService(intent2, this.f349386e, 1);
            this.f349382a = bindService;
            if (!bindService) {
                this.f349385d.mo179890b();
            }
        } catch (Exception unused) {
            mo179901a(false);
        }
    }

    /* renamed from: a */
    public final void mo179901a(boolean z) {
        if (z) {
            try {
                this.f349385d.mo179889a(this.f349384c);
            } catch (Exception e) {
                C116445c.m164139b("HSDID notify did bind status error :" + e.getMessage());
            }
        } else {
            this.f349385d.mo179890b();
        }
    }
}
