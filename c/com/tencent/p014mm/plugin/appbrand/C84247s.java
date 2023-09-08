package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.C80924w;
import com.tencent.p014mm.sdk.platformtools.Log;
import di0.C86297n;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.tencent.mm.plugin.appbrand.s */
public final class C84247s implements C80924w {

    /* renamed from: a */
    public final /* synthetic */ String f246082a;

    /* renamed from: b */
    public final /* synthetic */ int f246083b;

    /* renamed from: c */
    public final /* synthetic */ AtomicBoolean f246084c;

    /* renamed from: d */
    public final /* synthetic */ C86297n f246085d;

    public C84247s(String str, int i, AtomicBoolean atomicBoolean, C86297n nVar) {
        this.f246082a = str;
        this.f246083b = i;
        this.f246084c = atomicBoolean;
        this.f246085d = nVar;
    }

    /* renamed from: a */
    public void mo111377a() {
        C86297n nVar;
        Log.m105920e("MicroMsg.AppBrandPreRenderColdStartService", "bindRemoteService onRemoteProcessDied(" + this.f246082a + "), id:" + this.f246083b);
        if (!this.f246084c.getAndSet(true) && (nVar = this.f246085d) != null) {
            C86297n.C86298a.m106900a(nVar, -5, (String) null, 2, (Object) null);
        }
        C80907o.m98786i(this.f246082a, this);
    }
}
