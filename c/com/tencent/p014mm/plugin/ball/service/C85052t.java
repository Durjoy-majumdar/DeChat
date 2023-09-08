package com.tencent.p014mm.plugin.ball.service;

import com.tencent.p014mm.sdk.platformtools.Log;
import xv0.C112181e;
import yv0.C112504a;

/* renamed from: com.tencent.mm.plugin.ball.service.t */
public class C85052t implements C112504a {

    /* renamed from: a */
    public final /* synthetic */ C105052s f247835a;

    public C85052t(C105052s sVar) {
        this.f247835a = sVar;
    }

    /* renamed from: a */
    public void mo114239a() {
        Log.m105924i("MicroMsg.PageFloatBallHelper", "transform to float ball animation cancel");
        C112181e eVar = this.f247835a.f311729g;
        if (eVar != null) {
            eVar.mo149149y(true);
        }
        this.f247835a.f311808n.mo23513d(true);
        C105052s.m140977v0(this.f247835a);
    }

    public void onAnimationEnd() {
        Log.m105924i("MicroMsg.PageFloatBallHelper", "transform to float ball animation end");
        C112181e eVar = this.f247835a.f311729g;
        if (eVar != null) {
            eVar.mo149149y(true);
        }
        this.f247835a.f311808n.mo23513d(false);
        C105052s.m140977v0(this.f247835a);
    }
}
