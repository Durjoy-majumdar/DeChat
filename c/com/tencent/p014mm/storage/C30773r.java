package com.tencent.p014mm.storage;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.storage.r */
public final class C30773r implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C30766q f82748d;

    /* renamed from: e */
    public final /* synthetic */ int f82749e;

    public C30773r(C30766q qVar, int i) {
        this.f82748d = qVar;
        this.f82749e = i;
    }

    public final void run() {
        this.f82748d.mo57688Lo();
        long currentTimeMillis = System.currentTimeMillis();
        for (int i = 0; i < this.f82749e; i++) {
            C30763p pVar = new C30763p();
            long j = ((long) i) + currentTimeMillis;
            pVar.field_aId = String.valueOf(j);
            pVar.field_msgId = j;
            pVar.field_exposeTime = currentTimeMillis;
            this.f82748d.mo57689Yt(pVar);
            Log.m105924i("MicroMsg.BizAdInfoStorage", "mockExposeAdCount traceId=" + pVar.field_aId);
        }
    }
}
