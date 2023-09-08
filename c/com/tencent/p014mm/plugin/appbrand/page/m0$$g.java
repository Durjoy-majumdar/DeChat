package com.tencent.p014mm.plugin.appbrand.page;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.appbrand.page.m0$$g */
public class m0$$g implements C82531i.C82538g {

    /* renamed from: a */
    public final /* synthetic */ long f244781a;

    /* renamed from: b */
    public final /* synthetic */ C83817h4 f244782b;

    /* renamed from: c */
    public final /* synthetic */ String f244783c;

    /* renamed from: d */
    public final /* synthetic */ C83820i0 f244784d;

    /* renamed from: e */
    public final /* synthetic */ m0$$x f244785e;

    /* renamed from: f */
    public final /* synthetic */ C83849m0 f244786f;

    public m0$$g(C83849m0 m0Var, long j, C83817h4 h4Var, String str, C83820i0 i0Var, m0$$x m0__x) {
        this.f244786f = m0Var;
        this.f244781a = j;
        this.f244782b = h4Var;
        this.f244783c = str;
        this.f244784d = i0Var;
        this.f244785e = m0__x;
    }

    public void onReady() {
        Log.m105925i("MicroMsg.AppBrandPageContainer", "navigateToNext, onReady cost[%dms], appId[%s] type[%s], url[%s]", Long.valueOf(Util.currentTicks() - this.f244781a), this.f244786f.getAppId(), this.f244782b, this.f244783c);
        this.f244784d.getCurrentPageView().f244657w.f241645d.remove(this);
        this.f244786f.removeCallbacks(this.f244785e);
        this.f244786f.post(this.f244785e);
        this.f244786f.mo116331J();
    }
}
