package com.tencent.p014mm.plugin.downloader.model;

import y41.C53491a;
import y41.C53493b;
import z41.C53736a;

/* renamed from: com.tencent.mm.plugin.downloader.model.e */
public class C40916e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f110089d;

    /* renamed from: e */
    public final /* synthetic */ int f110090e;

    public C40916e(long j, int i) {
        this.f110089d = j;
        this.f110090e = i;
    }

    public void run() {
        C53736a c = C40933j.m44314c(this.f110089d);
        if (c != null) {
            if (c.field_status == 4) {
                C40935l.m44326g().mo63973u(c);
            }
            c.field_downloadType = 3;
            C40933j.m44322k(c);
            C53493b bVar = new C53493b();
            bVar.mo74165a(c);
            C53491a.m60013c(24, bVar);
            C29853f.f80895a.put(Long.valueOf(this.f110089d), Integer.valueOf(this.f110090e + 1));
        }
    }
}
