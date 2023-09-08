package com.tencent.p014mm.sandbox.monitor;

import android.content.Intent;
import android.os.IBinder;
import com.tencent.p014mm.sandbox.monitor.C85702g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.service.MMService;
import rg3.C36325c;

/* renamed from: com.tencent.mm.sandbox.monitor.ExceptionMonitorMMService */
public class ExceptionMonitorMMService extends MMService implements C85702g.C85704b {

    /* renamed from: i */
    public C85702g f249710i = null;

    /* renamed from: b */
    public String mo63928b() {
        return "MicroMsg.ExceptionMonitorMMService";
    }

    /* renamed from: c */
    public IBinder mo93614c(Intent intent) {
        return null;
    }

    /* renamed from: d */
    public void mo112546d() {
        super.mo112546d();
        Log.m105924i("MicroMsg.ExceptionMonitorMMService", "onCreate()");
        C85702g gVar = new C85702g(2);
        this.f249710i = gVar;
        gVar.mo119304b(this);
    }

    /* renamed from: e */
    public void mo112547e() {
        super.mo112547e();
        Log.m105924i("MicroMsg.ExceptionMonitorMMService", "onDestroy()");
        C85702g gVar = this.f249710i;
        if (gVar != null) {
            C36325c.m40948b(gVar.hashCode(), gVar);
            C85702g.f249719b.removeCallbacks(C85702g.f249720c);
            C85702g.f249721d = false;
            C85702g.f249718a = null;
            Log.m105924i("MicroMsg.ExceptionMonitor", "onDestroy");
            this.f249710i = null;
        }
    }

    /* renamed from: f */
    public void mo112549f(Intent intent, int i) {
        super.mo112549f(intent, i);
        Log.m105924i("MicroMsg.ExceptionMonitorMMService", "onStart()");
        C85702g gVar = this.f249710i;
        if (gVar != null && gVar != null) {
            gVar.mo119303a(intent);
        }
    }

    /* renamed from: g */
    public int mo93615g(Intent intent, int i, int i2) {
        Log.m105924i("MicroMsg.ExceptionMonitorMMService", "onStartCommand()");
        C85702g gVar = this.f249710i;
        if (gVar == null || gVar == null) {
            return 1;
        }
        gVar.mo119303a(intent);
        return 1;
    }
}
