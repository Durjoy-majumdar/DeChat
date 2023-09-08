package com.tencent.tmsqmsp.oaid2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.tencent.tmsqmsp.oaid2.C116461i0;

/* renamed from: com.tencent.tmsqmsp.oaid2.j0 */
public class C116464j0 {

    /* renamed from: e */
    public static String f349389e = "SDI";

    /* renamed from: f */
    public static String f349390f = "SI";

    /* renamed from: a */
    public C116466b f349391a = null;

    /* renamed from: b */
    public ServiceConnection f349392b;

    /* renamed from: c */
    public Context f349393c = null;

    /* renamed from: d */
    public C116461i0 f349394d;

    /* renamed from: com.tencent.tmsqmsp.oaid2.j0$a */
    public class C116465a implements ServiceConnection {
        public C116465a() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            synchronized (this) {
                C116464j0.this.f349394d = C116461i0.C116462a.m164183a(iBinder);
                C116464j0 j0Var = C116464j0.this;
                C116466b bVar = j0Var.f349391a;
                if (bVar != null) {
                    bVar.mo179914a(j0Var);
                }
                C116445c.m164140c(C116464j0.f349390f + " Service onServiceConnected");
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C116464j0.this.f349394d = null;
            C116445c.m164140c(C116464j0.f349390f + " Service onServiceDisconnected");
        }
    }

    /* renamed from: com.tencent.tmsqmsp.oaid2.j0$b */
    public interface C116466b {
        /* renamed from: a */
        void mo179914a(C116464j0 j0Var);
    }

    public C116464j0(Context context, C116466b bVar) {
        if (context != null) {
            this.f349393c = context;
            this.f349391a = bVar;
            this.f349392b = new C116465a();
            return;
        }
        throw new NullPointerException("Context can not be null.");
    }

    /* renamed from: a */
    public String mo179907a() {
        Context context = this.f349393c;
        if (context != null) {
            String packageName = context.getPackageName();
            C116445c.m164138a(f349390f + "apackage：" + packageName);
            if (packageName == null || packageName.equals("")) {
                C116445c.m164140c(f349390f + " input package is null!");
                return null;
            }
            try {
                C116461i0 i0Var = this.f349394d;
                if (i0Var == null) {
                    return null;
                }
                String a = i0Var.mo179905a(packageName);
                C116445c.m164138a(f349390f + " getAAID Package: " + packageName);
                return a;
            } catch (Exception unused) {
                C116445c.m164140c(f349390f + " geta error, RemoteException!");
                return null;
            }
        } else {
            C116445c.m164140c(f349390f + " Context is null.");
            throw new IllegalArgumentException("Context is null, must be new SxCore first");
        }
    }

    /* renamed from: b */
    public String mo179908b() {
        if (this.f349393c != null) {
            try {
                C116461i0 i0Var = this.f349394d;
                if (i0Var == null) {
                    return null;
                }
                String a = i0Var.mo179904a();
                C116445c.m164140c(f349389e + " geto call");
                return a;
            } catch (Exception unused) {
                C116445c.m164140c(f349390f + " geto error, RemoteException!");
                return null;
            }
        } else {
            C116445c.m164140c(f349390f + " Context is null.");
            throw new IllegalArgumentException("Context is null, must be new SxCore first");
        }
    }

    /* renamed from: c */
    public void mo179909c() {
        Intent intent = new Intent();
        intent.setClassName("com.samsung.android.deviceidservice", "com.samsung.android.deviceidservice.DeviceIdService");
        if (this.f349393c.bindService(intent, this.f349392b, 1)) {
            C116445c.m164140c(f349390f + " bindService Successful!");
            return;
        }
        this.f349391a.mo179914a(this);
        C116445c.m164140c(f349390f + " bindService Failed!");
    }

    /* renamed from: d */
    public boolean mo179910d() {
        try {
            if (this.f349394d == null) {
                C116445c.m164140c(f349390f + " Device not support opendeviceid");
                return false;
            }
            C116445c.m164140c(f349390f + " Device support opendeviceid");
            return true;
        } catch (Exception unused) {
            C116445c.m164140c(f349390f + " isSupport error, RemoteException!");
            return false;
        }
    }

    /* renamed from: e */
    public void mo179911e() {
        try {
            this.f349393c.unbindService(this.f349392b);
            C116445c.m164140c(f349390f + " unBind Service successful");
        } catch (IllegalArgumentException unused) {
            C116445c.m164140c(f349390f + " unBind Service exception");
        }
        this.f349394d = null;
    }
}
