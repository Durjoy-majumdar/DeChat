package com.tencent.p014mm.plugin.appbrand.floatball;

import com.tencent.p014mm.plugin.appbrand.floatball.C81869m;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.floatball.h */
public class C81854h implements C81869m.C81877g {

    /* renamed from: a */
    public final /* synthetic */ int f240132a;

    /* renamed from: b */
    public final /* synthetic */ C81855i f240133b;

    public C81854h(C81855i iVar, int i) {
        this.f240133b = iVar;
        this.f240132a = i;
    }

    /* renamed from: a */
    public void mo114249a() {
        Log.m105925i("MicroMsg.AppBrandFloatBallLogic", "close, voip1v1, show voip tip, result:%s", Boolean.valueOf(this.f240133b.mo114250a(this.f240132a)));
    }
}
