package com.tencent.p014mm.sandbox.monitor;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.tencent.p014mm.sandbox.monitor.C85702g;
import com.tencent.p014mm.sdk.platformtools.Log;
import rg3.C36325c;

/* renamed from: com.tencent.mm.sandbox.monitor.ExceptionMonitorService */
public class ExceptionMonitorService extends Service implements C85702g.C85704b {

    /* renamed from: d */
    public C85702g f249711d = null;

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        Log.m105924i("MicroMsg.ExceptionMonitorService", "onCreate()");
        C85702g gVar = new C85702g(1);
        this.f249711d = gVar;
        gVar.mo119304b(this);
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105924i("MicroMsg.ExceptionMonitorService", "onDestroy()");
        C85702g gVar = this.f249711d;
        if (gVar != null) {
            C36325c.m40948b(gVar.hashCode(), gVar);
            C85702g.f249719b.removeCallbacks(C85702g.f249720c);
            C85702g.f249721d = false;
            C85702g.f249718a = null;
            Log.m105924i("MicroMsg.ExceptionMonitor", "onDestroy");
            this.f249711d = null;
        }
    }

    public void onStart(Intent intent, int i) {
        super.onStart(intent, i);
        Log.m105924i("MicroMsg.ExceptionMonitorService", "onStart()");
        C85702g gVar = this.f249711d;
        if (gVar != null) {
            gVar.mo119303a(intent);
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        Log.m105924i("MicroMsg.ExceptionMonitorService", "onStartCommand()");
        C85702g gVar = this.f249711d;
        if (gVar == null) {
            return 1;
        }
        gVar.mo119303a(intent);
        return 1;
    }
}
