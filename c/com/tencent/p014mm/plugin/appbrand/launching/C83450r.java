package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.plugin.appbrand.C83606m1;
import com.tencent.p014mm.plugin.appbrand.launching.AppBrandPrepareTask;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.r */
public class C83450r implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandPrepareTask f243862d;

    public C83450r(AppBrandPrepareTask appBrandPrepareTask) {
        this.f243862d = appBrandPrepareTask;
    }

    public void run() {
        AppBrandPrepareTask.PrepareParams prepareParams = this.f243862d.f243155a;
        C83606m1.m102639c(4, prepareParams.f243170i, prepareParams.f243175q.f239452d, prepareParams.f243172n, prepareParams.f243176r);
    }
}
