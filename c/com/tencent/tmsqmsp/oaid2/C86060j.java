package com.tencent.tmsqmsp.oaid2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.os.RemoteException;
import com.tencent.tmsqmsp.oaid2.C86065m;

/* renamed from: com.tencent.tmsqmsp.oaid2.j */
public class C86060j {

    /* renamed from: com.tencent.tmsqmsp.oaid2.j$a */
    public static final class C86061a {

        /* renamed from: a */
        public final String f250530a;

        /* renamed from: b */
        public final boolean f250531b;

        public C86061a(String str, boolean z) {
            this.f250530a = str;
            this.f250531b = z;
        }

        /* renamed from: a */
        public final String mo120378a() {
            return this.f250530a;
        }

        /* renamed from: b */
        public final boolean mo120379b() {
            return this.f250531b;
        }
    }

    /* renamed from: a */
    public static C86061a m106555a(Context context) {
        C86062k kVar;
        m106556a();
        System.currentTimeMillis();
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                context.getPackageManager().getPackageInfo("com.huawei.hwid", 0);
                kVar = new C86062k();
                Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
                intent.setPackage("com.huawei.hwid");
                if (context.bindService(intent, kVar, 1)) {
                    m106556a();
                    try {
                        if (!kVar.f250533a) {
                            kVar.f250533a = true;
                            C86065m a = C86065m.C86066a.m106562a(kVar.f250534b.take());
                            C86061a aVar = new C86061a(a.mo120385m(), a.mo120384h());
                            context.unbindService(kVar);
                            return aVar;
                        }
                        throw new IllegalStateException();
                    } catch (RemoteException unused) {
                        C116445c.m164139b("bind hms service RemoteException");
                    } catch (Throwable th) {
                        context.unbindService(kVar);
                        throw th;
                    }
                } else {
                    C116445c.m164139b("bind failed");
                    return null;
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                C116445c.m164139b("HMS not found");
                return null;
            }
        } else {
            C116445c.m164139b("Cannot be called from the main thread");
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        context.unbindService(kVar);
        return null;
    }

    /* renamed from: a */
    public static String m106556a() {
        return "AdId";
    }
}
