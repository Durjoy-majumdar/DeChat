package com.tencent.tmsqmsp.oaid2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.IBinder;
import com.tencent.tmsqmsp.oaid2.C116476q;

/* renamed from: com.tencent.tmsqmsp.oaid2.r */
public class C116479r {

    /* renamed from: e */
    public static String f349417e = "com.mdid.msa";

    /* renamed from: a */
    public C116481s f349418a;

    /* renamed from: b */
    public ServiceConnection f349419b;

    /* renamed from: c */
    public Context f349420c;

    /* renamed from: d */
    public C116476q f349421d;

    /* renamed from: com.tencent.tmsqmsp.oaid2.r$a */
    public class C116480a implements ServiceConnection {

        /* renamed from: a */
        public C116481s f349422a;

        public C116480a(C116479r rVar, C116481s sVar) {
            this.f349422a = sVar;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            synchronized (this) {
                C116476q unused = C116479r.this.f349421d = C116476q.C116477a.m164248a(iBinder);
                new C116482t(C116479r.this.f349421d, this.f349422a).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C116476q unused = C116479r.this.f349421d = null;
            C116476q unused2 = C116479r.this.f349421d = null;
        }
    }

    public C116479r(Context context, C116481s sVar) {
        if (context != null) {
            this.f349420c = context;
            this.f349418a = sVar;
            this.f349419b = new C116480a(this, sVar);
            return;
        }
        throw new NullPointerException("Context can not be null.");
    }

    /* renamed from: b */
    public String mo179936b() {
        try {
            C116476q qVar = this.f349421d;
            return qVar == null ? "" : qVar.mo179928a();
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: c */
    public boolean mo179937c() {
        try {
            C116476q qVar = this.f349421d;
            if (qVar == null) {
                return false;
            }
            return qVar.mo179932g();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: d */
    public void mo179938d() {
        C116476q qVar = this.f349421d;
        if (qVar != null) {
            try {
                qVar.mo179931f();
                ServiceConnection serviceConnection = this.f349419b;
                if (serviceConnection != null) {
                    this.f349420c.unbindService(serviceConnection);
                }
            } catch (Exception unused) {
            }
            this.f349419b = null;
            this.f349421d = null;
        }
    }

    /* renamed from: a */
    public void mo179935a(String str) {
        C116481s sVar;
        Intent intent = new Intent();
        intent.setClassName("com.mdid.msa", "com.mdid.msa.service.MsaIdService");
        intent.setAction("com.bun.msa.action.bindto.service");
        intent.putExtra("com.bun.msa.param.pkgname", str);
        if (!this.f349420c.bindService(intent, this.f349419b, 1) && (sVar = this.f349418a) != null) {
            sVar.mo179942b();
        }
    }

    /* renamed from: a */
    public static boolean m164257a(Context context) {
        try {
            context.getPackageManager().getPackageInfo(f349417e, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static void m164256a(Context context, String str) {
        Intent intent = new Intent();
        intent.setClassName(f349417e, "com.mdid.msa.service.MsaKlService");
        intent.setAction("com.bun.msa.action.start.service");
        intent.putExtra("com.bun.msa.param.pkgname", str);
        try {
            intent.putExtra("com.bun.msa.param.runinset", true);
            context.startService(intent);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public String mo179934a() {
        try {
            C116476q qVar = this.f349421d;
            if (qVar == null) {
                return "";
            }
            return qVar.mo179930d();
        } catch (Exception unused) {
            return "";
        }
    }
}
