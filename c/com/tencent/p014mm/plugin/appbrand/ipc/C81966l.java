package com.tencent.p014mm.plugin.appbrand.ipc;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;

/* renamed from: com.tencent.mm.plugin.appbrand.ipc.l */
public class C81966l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C1256g f240368d;

    /* renamed from: e */
    public final /* synthetic */ MainProcessTask f240369e;

    public C81966l(MainProcessTask.C81951c cVar, C1256g gVar, MainProcessTask mainProcessTask) {
        this.f240368d = gVar;
        this.f240369e = mainProcessTask;
    }

    public void run() {
        C1256g gVar = this.f240368d;
        if (gVar != null) {
            gVar.mo894a(this.f240369e);
        }
    }
}
