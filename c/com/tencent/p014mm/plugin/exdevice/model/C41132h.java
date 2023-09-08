package com.tencent.p014mm.plugin.exdevice.model;

import a81.C39504d;
import android.os.Looper;
import com.tencent.p014mm.plugin.exdevice.model.C41140m;
import com.tencent.p014mm.plugin.exdevice.service.C41178a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import java.util.HashMap;
import java.util.Vector;
import y71.C53501k;

/* renamed from: com.tencent.mm.plugin.exdevice.model.h */
public class C41132h implements C39504d {

    /* renamed from: f */
    public static C41132h f110805f;

    /* renamed from: a */
    public C53501k f110806a;

    /* renamed from: b */
    public C41134b f110807b;

    /* renamed from: c */
    public Vector<C41171u1> f110808c = new Vector<>();

    /* renamed from: d */
    public byte[] f110809d = new byte[0];

    /* renamed from: e */
    public MMHandler f110810e = new MMHandler("ExdeviceHandlerThread");

    /* renamed from: com.tencent.mm.plugin.exdevice.model.h$a */
    public class C41133a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C41171u1 f110811d;

        public C41133a(C41171u1 u1Var) {
            this.f110811d = u1Var;
        }

        public void run() {
            C41132h hVar = C41132h.this;
            C41171u1 u1Var = this.f110811d;
            boolean z = true;
            if (hVar.f110806a == null) {
                Log.m105928w("MicroMsg.exdevice.ExDeviceTaskService", "dispathcer is null, now try to reset it");
                if (hVar.f110807b != null) {
                    Log.m105924i("MicroMsg.exdevice.ExDeviceTaskService", "prepare dispatcher is not null. not prepare it");
                    C41140m.C41141a aVar = (C41140m.C41141a) hVar.f110807b;
                    C41140m mVar = C41140m.this;
                    if (mVar.f110826a == null) {
                        mVar.f110826a = new C41178a();
                        C41140m.this.f110826a.f110938d = null;
                    }
                    C41140m.this.f110826a.mo64230a(MMApplicationContext.getContext());
                    new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C41129g(hVar), true).startTimer(100);
                } else {
                    Log.m105920e("MicroMsg.exdevice.ExDeviceTaskService", "prepare dispatcher is null");
                }
                z = false;
            }
            if (z) {
                u1Var.mo62113a(hVar.f110806a, hVar);
            } else {
                hVar.f110808c.add(u1Var);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.model.h$b */
    public interface C41134b {
    }

    public C41132h() {
        new HashMap();
    }

    /* renamed from: a */
    public void mo62112a(long j, int i, int i2, String str) {
        Log.m105925i("MicroMsg.exdevice.ExDeviceTaskService", "onTaskSceneEnd, taskid =%d, errType =%d, errCode = %d, errMsg =%s, wattingtask size : %d", Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), str, Integer.valueOf(this.f110808c.size()));
        synchronized (this.f110809d) {
            mo64200c();
        }
    }

    /* renamed from: b */
    public boolean mo64199b(C41171u1 u1Var) {
        this.f110810e.postToWorker(new C41133a(u1Var));
        return true;
    }

    /* renamed from: c */
    public final void mo64200c() {
        Log.m105925i("MicroMsg.exdevice.ExDeviceTaskService", "now watting task size is %d", Integer.valueOf(this.f110808c.size()));
        if (!this.f110808c.isEmpty()) {
            mo64199b(this.f110808c.remove(0));
        }
    }
}
