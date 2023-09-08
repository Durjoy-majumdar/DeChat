package com.tencent.tmsqmsp.oaid2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.tencent.tmsqmsp.oaid2.C116470n;

/* renamed from: com.tencent.tmsqmsp.oaid2.p */
public class C116473p {

    /* renamed from: e */
    public static String f349410e = "LXOP";

    /* renamed from: a */
    public Context f349411a = null;

    /* renamed from: b */
    public C116470n f349412b;

    /* renamed from: c */
    public ServiceConnection f349413c;

    /* renamed from: d */
    public C116475b f349414d = null;

    /* renamed from: com.tencent.tmsqmsp.oaid2.p$a */
    public class C116474a implements ServiceConnection {
        public C116474a() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            synchronized (this) {
                C116473p.this.f349412b = C116470n.C86069a.m106573a(iBinder);
                C116473p pVar = C116473p.this;
                C116475b bVar = pVar.f349414d;
                if (bVar != null) {
                    bVar.mo179919a(pVar);
                }
                C116473p.this.mo179922b("Service onServiceConnected");
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C116473p pVar = C116473p.this;
            pVar.f349412b = null;
            pVar.mo179922b("Service onServiceDisconnected");
        }
    }

    /* renamed from: com.tencent.tmsqmsp.oaid2.p$b */
    public interface C116475b {
        /* renamed from: a */
        void mo179919a(C116473p pVar);
    }

    public C116473p(Context context, C116475b bVar) {
        if (context != null) {
            this.f349411a = context;
            this.f349414d = bVar;
            this.f349413c = new C116474a();
            Intent intent = new Intent();
            intent.setClassName("com.zui.deviceidservice", "com.zui.deviceidservice.DeviceidService");
            if (this.f349411a.bindService(intent, this.f349413c, 1)) {
                mo179922b("bindService Successful!");
                return;
            }
            C116475b bVar2 = this.f349414d;
            if (bVar2 != null) {
                bVar2.mo179919a(this);
            }
            mo179922b("bindService Failed!!!");
            return;
        }
        throw new NullPointerException("Context can not be null.");
    }

    /* renamed from: b */
    public final void mo179922b(String str) {
        C116445c.m164138a(f349410e + " " + str);
    }

    /* renamed from: c */
    public String mo179924c() {
        Context context = this.f349411a;
        if (context != null) {
            String packageName = context.getPackageName();
            mo179922b("liufeng, getAAID package：".concat(String.valueOf(packageName)));
            if (packageName == null || packageName.equals("")) {
                mo179922b("input package is null!");
                return null;
            }
            try {
                C116470n nVar = this.f349412b;
                if (nVar != null) {
                    return nVar.mo120396b(packageName);
                }
                return null;
            } catch (Exception unused) {
                mo179921a("getAAID error, RemoteException!");
                return null;
            }
        } else {
            mo179922b("Context is null.");
            throw new IllegalArgumentException("Context is null, must be new OpenDeviceId first");
        }
    }

    /* renamed from: d */
    public void mo179925d() {
        try {
            this.f349411a.unbindService(this.f349413c);
            mo179922b("unBind Service successful");
        } catch (IllegalArgumentException unused) {
            mo179921a("unBind Service exception");
        }
        this.f349412b = null;
    }

    /* renamed from: a */
    public final void mo179921a(String str) {
        C116445c.m164139b(f349410e + " " + str);
    }

    /* renamed from: b */
    public boolean mo179923b() {
        try {
            if (this.f349412b == null) {
                return false;
            }
            mo179922b("Device support opendeviceid");
            return this.f349412b.mo120397c();
        } catch (Exception unused) {
            mo179921a("isSupport error, RemoteException!");
            return false;
        }
    }

    /* renamed from: a */
    public String mo179920a() {
        if (this.f349411a != null) {
            try {
                C116470n nVar = this.f349412b;
                if (nVar != null) {
                    return nVar.mo120395b();
                }
                return null;
            } catch (Exception unused) {
                mo179921a("getOAID error, RemoteException!");
                return null;
            }
        } else {
            mo179921a("Context is null.");
            throw new IllegalArgumentException("Context is null, must be new OpenDeviceId first");
        }
    }
}
