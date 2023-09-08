package com.tencent.p014mm.plugin.appbrand.appcache.predownload;

import android.os.Build;
import com.tencent.p014mm.plugin.appbrand.appcache.predownload.C81334h;
import kr0.C88262c1;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.g */
public final class C81333g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C81334h.C81335a f238794d;

    public C81333g(C81334h.C81335a aVar) {
        this.f238794d = aVar;
    }

    public final void run() {
        this.f238794d.f238798b.mo113616a(C88262c1.C88265c.Success_AllPkgDownloaded);
        C81334h.C81335a aVar = this.f238794d;
        aVar.getClass();
        if (Build.VERSION.SDK_INT >= 24) {
            C81334h.f238796b.remove(aVar.f238797a, aVar);
        } else {
            C81334h.f238796b.remove(aVar.f238797a);
        }
    }
}
