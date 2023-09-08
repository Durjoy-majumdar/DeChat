package com.tencent.p014mm.plugin.appbrand.floatball;

import com.tencent.p014mm.plugin.appbrand.floatball.C81862l;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.floatball.g */
public class C81853g implements C81862l.C81868f {

    /* renamed from: a */
    public final /* synthetic */ int f240130a;

    /* renamed from: b */
    public final /* synthetic */ C81855i f240131b;

    public C81853g(C81855i iVar, int i) {
        this.f240131b = iVar;
        this.f240130a = i;
    }

    /* renamed from: a */
    public void mo114246a() {
        Log.m105925i("MicroMsg.AppBrandFloatBallLogic", "close, voip, show voip tip, result:%s", Boolean.valueOf(this.f240131b.mo114250a(this.f240130a)));
    }
}
