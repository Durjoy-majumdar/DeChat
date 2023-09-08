package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.plugin.appbrand.C83606m1;
import com.tencent.p014mm.plugin.appbrand.launching.AppBrandPrepareTask;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.q */
public class C83441q implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandPrepareTask f243827d;

    public C83441q(AppBrandPrepareTask appBrandPrepareTask) {
        this.f243827d = appBrandPrepareTask;
    }

    public void run() {
        AppBrandPrepareTask.PrepareParams prepareParams = this.f243827d.f243155a;
        C83606m1.m102639c(3, prepareParams.f243170i, prepareParams.f243175q.f239452d, prepareParams.f243172n, prepareParams.f243176r);
    }
}
